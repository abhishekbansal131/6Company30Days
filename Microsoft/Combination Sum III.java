class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1,9,k,n,new ArrayList<>(),ans);
        return ans;
    }
    public void combinations(int start,int end,int k,int target,List<Integer> temp,List<List<Integer>> ans){
        if(target==0 && temp.size()==k){
                ans.add(new ArrayList<>(temp));
                return;
        }

        for(int i=start;i<=end;i++){
            temp.add(i);
            combinations(i+1,end,k,target-i,temp,ans);                       
            temp.remove(temp.size()-1);
        }
        
        return;
    }
}
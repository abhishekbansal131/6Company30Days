class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(1,9,k,n,new ArrayList<>(),result);
        return result;
    }
    public void combinations(int start,int end,int k,int target,List<Integer> helper,List<List<Integer>> result){
        if(target==0 && helper.size()==k){
                result.add(new ArrayList<>(helper));
                return;
        }

        for(int i=start;i<=end;i++){
            helper.add(i);
            combinations(i+1,end,k,target-i,helper,result);                       
            helper.remove(helper.size()-1);
        }
        return;
    }
}

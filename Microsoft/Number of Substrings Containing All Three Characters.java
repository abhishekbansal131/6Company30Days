class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int ans=0;
        int[] arr=new int[3];
        for( j=0;j<s.length();j++)
        {
            arr[s.charAt(j)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0)
            {
                arr[s.charAt(i)-'a']--;
                ans+=s.length()-j;
                i++;
            }
        }
        
        return ans;
    }
}
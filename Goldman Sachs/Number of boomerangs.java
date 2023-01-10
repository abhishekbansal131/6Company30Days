class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int c = 0, n=points.length;
        HashMap<Integer, Integer> h;
        for(int i=0; i<n; i++){
            h = new HashMap<>();
            for(int j=0; j<n; j++){
                if(i != j){
                        int a = points[i][0];
                        int b = points[i][1];
                        int p = points[j][0];
                        int q = points[j][1];
                        int dis1 = ((a-p)*(a-p) + (b-q)*(b-q));
                        h.put(dis1, h.getOrDefault(dis1,0)+1);
                }
            }
            for(int p : h.keySet()){
                if(h.get(p) >=2) c += (h.get(p)*(h.get(p)-1)); //finding permutation
            }
        }
        return c;
    }
}
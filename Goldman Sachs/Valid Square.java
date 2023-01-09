class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> sh = new HashSet<>();
        sh.add(getSize(p1,p2));
        sh.add(getSize(p3,p4));
        sh.add(getSize(p1,p3));
        sh.add(getSize(p1,p4));
        sh.add(getSize(p2,p3));
        sh.add(getSize(p4,p2));
        
        return sh.size() == 2 && !sh.contains(0);             
    }
    public int getSize(int[] p1, int[] q1){
        int size = (int)Math.pow(p1[0]-q1[0],2) + (int)Math.pow(p1[1]-q1[1],2);
        return size;
    }
}
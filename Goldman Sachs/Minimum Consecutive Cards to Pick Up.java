class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int n = cards.length;
        for(int i=0; i<n; i++){
            if(h.containsKey(cards[i])){
                min = Math.min(min, i-h.get(cards[i])+1);
                h.put(cards[i], i);
            }
            else h.put(cards[i], i);
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}
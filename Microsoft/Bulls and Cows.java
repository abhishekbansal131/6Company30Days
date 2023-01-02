class Solution {
    public String getHint(String s, String g) {
        int c = 0;
        int b = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == g.charAt(i)) c++;                                           
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != g.charAt(i)){
            h1.put(s.charAt(i), h1.getOrDefault(s.charAt(i),0)+1);
            h2.put(g.charAt(i), h2.getOrDefault(g.charAt(i),0)+1);}
        }
        for (Map.Entry<Character,Integer> i : h1.entrySet()) {
            if(h2.containsKey(i.getKey())){
                b += Math.min(h2.get(i.getKey()), i.getValue());
            }
        }
        return String.valueOf(c)+"A"+String.valueOf(b)+"B";
    }
}
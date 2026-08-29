class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s: strs) {
            sb.append(String.valueOf(s.length()));
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    //0 1 2 3 4 5 6 7 8 9 10 11 12 13
    //1 0 # a b d f e d r e  e  w

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<>();

        while (i < str.length()) {
            int curLen = 0;
            
            while (str.charAt(i) != '#') {
                curLen = curLen * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++; 
            
            int end = i + curLen;
            StringBuilder sb = new StringBuilder();
            while (i < end) {
                sb.append(str.charAt(i++));
            }
            
            res.add(sb.toString());
        }
        return res;
    }
}
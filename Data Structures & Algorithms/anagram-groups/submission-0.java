class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s: strs) {
            char[] cur = s.toCharArray();
            Arrays.sort(cur);
            String curS = new String(cur);
            if (groups.containsKey(curS)) {
                List<String> curList = groups.get(curS);
                curList.add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                groups.put(curS, newList);
            }
        }
        return new ArrayList<>(groups.values());
    }
}

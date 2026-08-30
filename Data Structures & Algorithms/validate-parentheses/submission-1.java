class Solution {
    public boolean isValid(String s) {
        List<Character> opened = List.of('(', '[', '{');
        Deque<Character> chars = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (opened.contains(c)) {
                chars.push(c);
            } else {
                if (chars.size() == 0) return false;
                char cur = chars.pop();
                if (!((cur == '(' && c == ')') ||
                    (cur == '[' && c == ']') ||
                    (cur == '{' && c == '}') )) {
                        return false;
                    }
            }
        }
        if (chars.size() != 0) return false;
        return true;
    }
}

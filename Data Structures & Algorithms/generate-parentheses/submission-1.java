class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        build(0, 0, res, new StringBuilder(), n);
        return res;
    }

    private void build(int open, int close, List<String> res, StringBuilder cur, int n) {
        if (cur.length() == 2 * n) {
            res.add(cur.toString());
            return;
        }

        if (open < n) {
            cur.append('(');
            build(open + 1, close, res, cur, n);
            cur.deleteCharAt(cur.length() - 1);
        }

        if (close < open) {
            cur.append(')');
            build(open, close + 1, res, cur, n);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
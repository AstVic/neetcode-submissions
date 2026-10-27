class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        build(0, 0, res, new StringBuilder(), n);
        return res;
    }

    public void build(int open, int close, List<String> res, StringBuilder cur, int n) {
        if (open == n && close == n) {
            res.add(cur.toString());
            return;
        }

        if (open == close) {
            if (open < n) {
                cur.append('(');
                build(open + 1, close, res, cur, n);
                cur.deleteCharAt(cur.length() - 1);
            }
        } else if (open > close) {
            if (open < n) {
                cur.append('(');
                build(open + 1, close, res, cur, n);
                cur.deleteCharAt(cur.length() - 1);
                cur.append(')');
                build(open, close + 1, res, cur, n);
                cur.deleteCharAt(cur.length() - 1);
            } else { // open == n
                if (close < n) {
                    cur.append(')');
                    build(open, close + 1, res, cur, n);
                    cur.deleteCharAt(cur.length() - 1);
                }
            }
        }
    }
}

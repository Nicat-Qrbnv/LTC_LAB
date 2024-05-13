package p7_leetCode.n101_200.n150_EvaluateReversePolishNotation;

class Solution2 {
    int pos;
    public int evalRPN(String[] tokens) {
        this.pos = tokens.length-1;
        return evaluate(tokens);
    }

    public int evaluate(String [] t){
        String token = t[pos--];
        return switch (token) {
            case "+" -> evaluate(t) + evaluate(t);
            case "-" -> -evaluate(t) + evaluate(t);
            case "*" -> evaluate(t) * evaluate(t);
            case "/" -> evaluate(t) / evaluate(t);
            default -> Integer.parseInt(token);
        };
    }
}
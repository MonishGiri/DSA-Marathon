public class MaximumNestingDepth {
    public static int maxDepth(String s) {
        int depth = 0;
        int rightBrackets = 0;
        int leftBrackets = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') leftBrackets++;
            else if(s.charAt(i) == ')') rightBrackets++;
            depth = Math.max(depth, leftBrackets - rightBrackets);
        }
        return depth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println("Max depth is: "+maxDepth(s));
    }
}

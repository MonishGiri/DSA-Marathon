public class RotateString {

    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            sb = rotate(sb);
            System.out.println("sb is: "+sb);
            if(sb.toString().equals(goal)) return true;
        }
        return false;
    }

    public static StringBuilder rotate(StringBuilder s){
        StringBuilder reversed = reverse(s, 1, s.length()-1);
        return reverse(reversed, 0, reversed.length()-1);
        
    }
    public static StringBuilder reverse(StringBuilder s, int low, int high){
        StringBuilder sb = new StringBuilder(s);
        while(low<high){
            char temp = sb.charAt(low);
            sb.setCharAt(low, sb.charAt(high));
            sb.setCharAt(high, temp);
            low++;
            high--;
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
}

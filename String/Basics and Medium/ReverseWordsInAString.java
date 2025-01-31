public class ReverseWordsInAString{

    public static String reverseWords(String s) {
        if(s.length() == 0) return "";
        StringBuilder sb = new StringBuilder(s.trim().replaceAll("\\s+", " "));
        int i = 0;
        int j = sb.length()-1;

        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        int startIndex = 0;
        for(i=0; i<sb.length(); i++){
            if(sb.charAt(i) == ' '){
                sb = reverse(sb, startIndex, i-1);
                startIndex = i + 1;
            }
        }
        reverse(sb,startIndex, sb.length() - 1);

        return sb.toString();
    }

    public static StringBuilder reverse(StringBuilder sb, int i, int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
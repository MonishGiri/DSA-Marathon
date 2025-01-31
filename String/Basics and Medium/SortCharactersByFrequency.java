public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[256];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)] += 1;
            System.out.println(s.charAt(i)+" : "+count[s.charAt(i)]);
        }


        for(int i=0; i<s.length(); i++){
            int maxFreq = Integer.MIN_VALUE;
            int maxIdx = -1;
            for(int j=0; j<count.length; j++){
                if(maxFreq < count[j]){
                    maxFreq = count[j];
                    maxIdx = j;
                    count[j] = 0;
                }
            }
            System.out.println("Max Frequency: "+maxFreq);
            System.out.println("Max Index: "+maxIdx);
            for(int k=1; k<=maxFreq; k++){
                sb.append((char)maxIdx);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("After sorting: "+frequencySort("Aabb"));
    }
}

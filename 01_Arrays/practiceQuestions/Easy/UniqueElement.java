package Easy;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,1,2,5,7,6,9,7,9,1,6};
        int[] hashmap = new int[11]; // Assuming that the array contains numbers only between 0 to 10: creating hashmap

        for(int i=0; i<arr.length; i++){
            hashmap[arr[i]]++;
        }

        for(int i=0; i<hashmap.length; i++){
            if(hashmap[i] == 1) System.out.println("Unique Element is: "+i);
        }
    }
}

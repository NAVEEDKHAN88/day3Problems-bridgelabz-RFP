public class ArraySmallestElement {
    public static void main(String[] args) {
        int [] arr = new int [] {21, 11, 16, 53, 19, 43, 14, 111, 22, 77};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}

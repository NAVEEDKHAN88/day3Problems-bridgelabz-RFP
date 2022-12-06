public class ArrayOnEvenPosition {
    public static void main(String[] args) {
        //Initializing the array
        int [] numbers = new int [] {5, 11, 16, 33, 9, 77, 1, 88};

        System.out.println("Array Elements on even Positions: ");

        for (int i = 1; i < numbers.length; i = i+2) {
            System.out.println(numbers[i]);
        }
    }
}

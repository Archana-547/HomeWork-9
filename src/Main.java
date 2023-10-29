
//Create an array of integers (primitive type int) of 5 elements and assign a value to
//any one element. //
public class Main {
    public static void main(String[] args) {

        //int[] myArray = new int[5];
        String[] myArray = new String[5];
        // myArray[0] = 42;
        myArray[1] = "Hello, World!";
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + " is: " + myArray[i]);


        }
    }
}
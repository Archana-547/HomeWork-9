public class Loop {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        char targetChar = 'o';

        boolean found = false;
        int i = 0;

        while (i < charArray.length) {
            if (charArray[i] == targetChar) {
                found = true;
                break;
            }
            i++;
        }


//=========with For Loop===================
       // for (int i = 0; i < charArray.length; i++) {
         // if (charArray[i] == targetChar) {
           //     found = true;
             //   break;
            //}
        //}

        if (found) {
            System.out.println("The character '" + targetChar + "' occurs at least once in the string.");
        } else {
            System.out.println("The character '" + targetChar + "' does not occur in the string.");

        }
    }
}








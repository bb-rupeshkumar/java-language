import java.io.*;
import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {

        // 1️⃣ ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        // 2️⃣ NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

        // 3️⃣ ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }

        // 4️⃣ NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }

        // 5️⃣ ClassCastException
        try {
            Object obj = "Hello";
            Integer i = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e);
        }

        // 6️⃣ IOException (Checked)
        try {
            FileReader fr = new FileReader("notfound.txt");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        // 7️⃣ FileNotFoundException (Checked)
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e);
        }

        // 8️⃣ IllegalArgumentException
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException: " + e);
        }

        // 9️⃣ StringIndexOutOfBoundsException
        try {
            String str = "Java";
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e);
        }

        // 🔟 Custom Exception
        try {
            validateAge(15);
        } catch (AgeNotValidException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // 1️⃣1️⃣ Finally block demo
        try {
            int x = 10 / 2;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues normally...");
    }

    // Custom exception usage
    static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or above");
        }
    }
}

// Custom Exception class
class AgeNotValidException extends Exception {
    AgeNotValidException(String msg) {
        super(msg);
    }
}

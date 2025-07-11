package Task;
import java.util.*;

public class AgeValidateException {

    public static void validateAge(int age) throws InValidAgeException {
        if (age < 18 || age > 40) {
            throw new InValidAgeException("Invalid Age: Age should be between 18 and 40");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = s.nextInt();

        try {
            validateAge(a);
        } catch (InValidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
class InValidAgeException extends Exception {
    public InValidAgeException(String message) {
        super(message);
    }
}

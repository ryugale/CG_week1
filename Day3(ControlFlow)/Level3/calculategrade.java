
import java.util.Scanner;

class calculategrade {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int physics = ip.nextInt();
        int chemistry = ip.nextInt();
        int maths = ip.nextInt();
        int percentage = (physics + chemistry + maths) / 3;
        if (percentage < 0 || percentage > 100) {
            System.out.println("wrong marks entered");
        } else if (percentage >= 80) {
            System.out.println("Grade is A \nremarks : Level 4, above agency normalized standard");
        } else if (percentage >= 70) {
            System.out.println("Grade is B \nremarks : Level 3, at agency normalized standard");
        } else if (percentage >= 60) {
            System.out.println("Grade is C \nremarks : Level 2,below, but approaching agency normalized standard");
        } else if (percentage >= 50) {
            System.out.println("Grade is D \nremarks : Level 1, well below agency normalized standard");
        } else if (percentage >= 40) {
            System.out.println("Grade is E \nremarks : Level 1, too below agency normalized standard");
        } else if (percentage >= 30) {
            System.out.println("Remedial standarsds");
        }
    }
}

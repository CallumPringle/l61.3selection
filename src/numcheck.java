import java.util.Scanner;

public class numcheck {
    public static void main(String[] args) {
        System.out.println("what is 2 + 2");
        Scanner sc = new Scanner(System.in);
        String userOpinion = sc.next();
        if (userOpinion == "4") {
            System.out.println("you are correct");
        } else {
            System.out.print("you are wrong");
        }
    }
}

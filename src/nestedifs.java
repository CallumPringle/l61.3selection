import java.util.Scanner;

public class nestedifs {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("type in a number");
    double pay = sc.nextDouble();
    if (pay < 1000){
        System.out.println("tax is 0%");
    }
    else if (pay > 1000 && pay < 1200){
        System.out.println("tax is 5%");
    }
    else if (pay > 1200 && pay < 1500){
        System.out.println("tax is 10%");
    }
    else{
        System.out.println("tax is 15%");
    }

    }
    }

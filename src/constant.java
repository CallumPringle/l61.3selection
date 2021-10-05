import java.util.Scanner;

public class constant {
    public static void main(String[] args) {
        boolean loop = true;
        while (loop = true) {
            final double vat = 1.2;
            System.out.println("enter a number");
            Scanner sc = new Scanner(System.in);
            double taxedAmount = (sc.nextDouble() * vat);
            System.out.println("your price + VAT = " + taxedAmount);
            System.out.println("do you want to run it again? Y/N");
            String yn = sc.nextLine();
            while(true){
            if (yn == "Y"){
                loop = true;
                break;
            }
            else if (yn == "N"){
                loop = false;
                break;
            }
            else {
                System.out.println("incorrect input");
            }
            }
        }
        }
    }

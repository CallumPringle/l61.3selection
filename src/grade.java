import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the total marks available");
    int totalMarks = sc.nextInt();
    System.out.println("enter the marks the student got");
    int studentMarks = sc.nextInt();
    if (studentMarks > (totalMarks*0.8)){
        System.out.println("grade: A");
    }
    else if (studentMarks >= totalMarks *0.7 || studentMarks <= totalMarks*0.79){
        System.out.println("grade: B");
    }
    else if (studentMarks >= totalMarks *0.6 || studentMarks <= totalMarks*0.69) {
        System.out.println("grade: C");
    }
    else if (studentMarks >= totalMarks *0.5 || studentMarks <= totalMarks*0.59) {
        System.out.println("grade: D");
    }
    else if (studentMarks >= totalMarks *0.4 || studentMarks <= totalMarks*0.49) {
        System.out.println("grade: E");
    }
    else if (studentMarks < (totalMarks*0.4)) {
        System.out.println("grade: U");
    }
    else if (studentMarks > totalMarks || studentMarks < 0){
        System.out.println("error: percentage was above 100 or below 0");
    }
    }
    }

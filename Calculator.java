import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("This is a calculator of your marks and gardes!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you are marks of 5 subjects");
        System.out.println("Enter Total marks of the subject :");
        System.out.println("Enter marks of subject1");
        float subject1 = sc.nextInt();
        System.out.println("Enter marks of subject2");
        float subject2 = sc.nextInt();
        System.out.println("Enter marks of subject3");
        float subject3 = sc.nextInt();
        System.out.println("Enter marks of subject4");
        float subject4 = sc.nextInt();
        System.out.println("Enter marks of subject5");
        float subject5 = sc.nextInt();
        
        float sum = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = ((sum)/500.0f)*100;
        System.out.println("RESULT!!\nYour total marks are: "+sum+ " Average Percentage " +percentage+ "");
        if(percentage>=90 && percentage<=100){
            System.out.println("Grade is A+");
        }
        else if(percentage>=80 && percentage<=90){
            System.out.println("Grade is A");
        }
        else if(percentage>=70 && percentage<=80){
            System.out.println("Grade is B+");
        }
        else if(percentage>=60 && percentage<=70){
            System.out.println("Grade is B");
        }
        else if(percentage>=50 && percentage<=60){
            System.out.println("Grade is C+");
        }
        else if(percentage>=40 && percentage<=50){
            System.out.println("Grade is C");
        }
        else if(percentage<=33){
            System.out.println("Better luck next time");
        }
        sc.close();
    }
}

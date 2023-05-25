import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        EmployeeData self = new EmployeeData();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your First Name:- ");
        String empFname = scan.nextLine();
        System.out.println("Enter Your Last Name:- ");
        String empLname = scan.nextLine();
        System.out.println("Enter Your Employee Id  :- ");
        int emp_id = scan.nextInt();


        System.out.println("Full Name:- "+empFname+" "+empLname+ "\nEmployee ID:-"+emp_id);
    }
}
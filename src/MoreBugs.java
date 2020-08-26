import java.util.Scanner; // add Scanner functionality to receive user's input

public class MoreBugs {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in); // changed method to accept input from scanner
        //
        System.out.print("Input your name: ");
        String name = input.nextLine(); // changed input from int to String data type

        System.out.print("Enter your age: "); // added quote marks to string
        String age = input.nextLine(); // changed variable name to lowercase to follow convention.

        System.out.print("Enter your DOB year: ");
        String dob = input.nextLine(); // changed data type from int to string to accept various input formats.

        System.out.println("Summary: Your name is: "+name+"\nYour age is: "+age+"\nYour birth year is: "+dob);
    }
}

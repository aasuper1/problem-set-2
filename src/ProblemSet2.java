/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	static Scanner input = new Scanner(System.in);
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		input.close();
	}
	
	public void sayHello() {
		System.out.println("Type your first name");
		String firstName = input.nextLine();
		System.out.println("Type your last name");
		String lastName = input.nextLine();
		System.out.println("Hello, " + firstName + " " + lastName + "!");
		
	}
	
	public void gradeMe() {
		System.out.println("Type your homework grade");
		double homeWork = input.nextDouble();
		System.out.println("Type your quiz grade");
		double quiz = input.nextDouble();
		System.out.println("Type your test grade");
		double test = input.nextDouble();
		double finalGrade = (homeWork*15+quiz*30+test*55)/100;
		DecimalFormat df2 = new DecimalFormat(".##");
		System.out.println(df2.format(finalGrade) + "%");
	}
	
	public void groupUs() {
		System.out.println("How many teachers are on the trip");
		int teachers = input.nextInt();
		input.nextLine();
		System.out.println("How many students are on the trip");
		int students = input.nextInt();
		double attendees = teachers+students;
		int lessBus = (teachers+students)/47;
		double bus = attendees/47;
		//int busFinal = lessBus;
		System.out.print("There will be " + lessBus + " full busses with 48 people including the bus driver");
		if (bus > lessBus) {
			System.out.print(" and 1 bus with " + ((teachers + students) % 47 + 1) + " people including the bus driver");
		}
		
		
		
	}
	
	public void info() {
		System.out.println("Type your first name");
		String first = input.nextLine();
		System.out.println("Type your last name");
		String last = input.nextLine();
		System.out.println("Type your grade");
		String grade = input.nextLine();
		System.out.println("Type your age");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Type your hometown");
		String hometown = input.nextLine();
		
		System.out.println("NAME     : " + first + " " + last);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
	}
	
	public void initials() {
		System.out.print("Please enter your first name:");
		String first = input.nextLine();
		System.out.print("Please enter your middle name: ");
		String middle = input.nextLine();
		System.out.print("Please enter your last name: ");
		String last = input.nextLine();
		System.out.print("Your initials are " + first + middle + last);
	}
}
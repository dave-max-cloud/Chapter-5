import java.util.Scanner;
public class Extremes{
public static void main(String[]args){
		
Scanner input = new Scanner(System.in);
		
System.out.println("Enter value: ");
int value = input.nextInt();

int sum = 0;

int maximum = value;
int minimum = value;

for(int index = 2; index <= 4; index++){

System.out.println("Enter value: ");
value = input.nextInt();

if(value > maximum){
maximum = value;
}

if(value < minimum){
minimum = value;

sum = maximum + minimum;


}
}
System.out.println("The sum is: " + sum);
//System.out.println("The smallest number is: " + minimum);
		}
	}

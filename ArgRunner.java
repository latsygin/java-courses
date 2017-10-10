import java.util.Scanner;

public class ArgRunner{
	public static void main(String[] arg){
//		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		String exit = "no";
		Calculator calc = new Calculator();
		Scanner reader = new Scanner(System.in);
		while(!exit.equals("yes")){
			calc.add(first, second);			
			System.out.println("Result = " + calc.getResult());
			calc.cleanResult();
			System.out.println("Exit : yes/no ?");
			exit = reader.next();			
		}
	}
}
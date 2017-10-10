public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double sum = first + second;
		double proizv = first * second;
		double chast = first / second;
		double razn = first - second;
		System.out.println("Sum = " + sum);
		System.out.println("Proizv = " + proizv);
		System.out.println("Chastnoe = " + chast);
		System.out.println("Raznost = " + razn);
	}
}
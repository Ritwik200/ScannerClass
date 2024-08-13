package ScannerCls;
import java.util.Scanner;
public class nextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter double value: ");
		
		double value = ip.nextDouble();
		System.out.println("Enter double value is ..... "+value);
		
		ip.close();
	}

}

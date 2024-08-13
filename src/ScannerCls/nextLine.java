package ScannerCls;
import java.util.Scanner;
public class nextLine {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String value = ip.nextLine();
		System.out.println("Enter your name "+value);
		
		ip.close();
	}
}

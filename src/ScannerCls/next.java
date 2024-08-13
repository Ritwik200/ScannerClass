package ScannerCls;
import java.util.Scanner;
public class next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String value = ip.next();
		System.out.println("Text entered: "+value);
		
		ip.close();
	}

}

package rmi;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws RemoteException {

		try {

			Registry registry = LocateRegistry.getRegistry("localhost", 3000);
			Calculator calculate = (Calculator) registry.lookup("calculator");

			Scanner in = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int no1 = in.nextInt();

			System.out.println("Enter a Number: ");
			int no2 = in.nextInt();
			
			in.close();
			
			System.out.println("Addition: "+calculate.add(no1, no2));
			System.out.println("Subtraction: "+calculate.subtract(no1, no2));
			System.out.println("Multiply: "+calculate.multiply(no1, no2));
			System.out.println("Divide: "+calculate.divide(no1, no2));
			registry.unbind("calculator");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

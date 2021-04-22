package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Calculator {

	protected Server() throws RemoteException {
		super();

	}

	public static void main(String[] args) throws RemoteException {
		try {
			Registry registry = LocateRegistry.createRegistry(3000);
			registry.rebind("calculator", new Server());
			System.out.println("Server is up and running...");
			Thread.sleep(2000);
			System.out.println("Waiting for Client...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int add(int no1, int no2) {

		return no1 + no2;
	}

	@Override
	public int subtract(int no1, int no2) {

		return no1 - no2;
	}

	@Override
	public int divide(int no1, int no2) {

		return no1 / no2;
	}

	@Override
	public int multiply(int no1, int no2) {

		return no1 * no2;
	}

}

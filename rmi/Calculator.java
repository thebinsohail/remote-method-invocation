package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote{

	public int add(int no1, int no2) throws RemoteException;

	public int subtract(int no1, int no2) throws RemoteException;

	public int divide(int no1, int no2) throws RemoteException;

	public int multiply(int no1, int no2) throws RemoteException;

}

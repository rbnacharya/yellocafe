package yelloclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import yelloserver.ControlClient;


public class YelloClient {
	public Registry reg;
	public YelloClient(){
		try{
			
		}
		catch(Exception e){
			System.out.println("Error Occured:"+e.getMessage());
		}
	}
	public static void main(String args[]){
		try{
			YelloClient yc=new YelloClient();
			yc.GetServer();
			
		}
		catch(Exception e){
			System.out.println("Error:"+e.getMessage());
		}
		
	}
	public void Invoke(String args[]){
		try{
		}
		catch(Exception e){
			System.out.println("Error Occured"+e.getMessage());
		}

		
	}
	public void GetServer(){
		try{
			String registry="localhost";
			String registration="rmi://localhost/RmiServer";
						
			reg=LocateRegistry.getRegistry("7.217.164.255",1040);
			Remote stub=reg.lookup(registration);
			ControlClient myclass=ControlClient.class.cast(stub);
			
			ClientComputer di=new ClientComputerImpl();
			di=(ClientComputer)UnicastRemoteObject.exportObject(di,0);
			myclass.AddListener(di);
                       // myclass.RemoveListener(di);
		}
		catch(Exception e){
			System.out.println("Error"+e.getMessage());
			for(StackTraceElement ete : e.getStackTrace()){
				System.out.println(ete.getFileName()+ete.getLineNumber()+ete.getMethodName());
				
			}
			
			}
		}

		

}

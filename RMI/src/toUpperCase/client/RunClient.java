package toUpperCase.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {

    public static void main(String[] args) throws NotBoundException, RemoteException {
        RmiClient client = new RmiClient();
        client.startClient();

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Input: ");
            String line = in.nextLine();
            if(line.equalsIgnoreCase("exit")) break;


            String result = null;
            try {
                result = client.toUpperCase(line);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Result: " +  result);

        }
    }
}

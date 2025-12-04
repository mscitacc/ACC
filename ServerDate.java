import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ServerDate extends UnicastRemoteObject implements InterDate {

    public ServerDate() throws RemoteException {
        super();
    }

    public String display() throws RemoteException {
        Date d = new Date();
        return d.toString();
    }

    public static void main(String[] args) throws Exception {
        ServerDate s1 = new ServerDate();
        Naming.rebind("DS", s1);
        System.out.println("Object registered...");
    }
}

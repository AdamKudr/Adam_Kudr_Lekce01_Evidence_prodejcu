import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        String nameOfMerchant = "Zdislav Okoralý";
        String dateOfBirth = "10.10.1980";
        int numberOfContracts = 15;
        double tonsOfCarrots = 65;
        String city = "Brno";
        String carRegistrationPlate = "9BA8899";
        double carConsumption = 6.2;
        InetAddress ipAddress = InetAddress.getByName("192.168.22.33");

        double averageCarrotsPerContract = tonsOfCarrots/numberOfContracts;
        System.out.println("Prodejce " + nameOfMerchant + " narozen dne " + dateOfBirth + " prodal průměrně " + averageCarrotsPerContract + " tuny mrkve na jednu smlouvu.");



    }
}
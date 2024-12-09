
import java.util.Scanner;
 class Assign3 {
    
    private int consumerNo;
    private String consumerName;
    private int previousReading;
    private int currentReading;
    private String connectionType;

    
    public Assign3(int consumerNo, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

   
    private int calculateUnits() {
        return currentReading - previousReading;
    }


    public double computeBill() {
        int units = calculateUnits();
        double billAmount = 0.0;


        if (connectionType.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                billAmount = units * 1.0;
            } else if (units <= 200) {
                billAmount = 100 * 1.0 + (units - 100) * 2.50;
            } else if (units <= 500) {
                billAmount = 100 * 1.0 + 100 * 2.50 + (units - 200) * 4.0;
            } else {
                billAmount = 100 * 1.0 + 100 * 2.50 + 300 * 4.0 + (units - 500) * 6.0;
            }
        } 
  
        else if (connectionType.equalsIgnoreCase("commercial")) {
            if (units <= 100) {
                billAmount = units * 2.0;
            } else if (units <= 200) {
                billAmount = 100 * 2.0 + (units - 100) * 4.50;
            } else if (units <= 500) {
                billAmount = 100 * 2.0 + 100 * 4.50 + (units - 200) * 6.0;
            } else {
                billAmount = 100 * 2.0 + 100 * 4.50 + 300 * 6.0 + (units - 500) * 7.0;
            }
        } else {
            System.out.println("Invalid connection type!");
        }

        return billAmount;
    }


    public void displayBill() {
        System.out.println("Electricity Bill:");
        System.out.println("Consumer No.   : " + consumerNo);
        System.out.println("Consumer Name  : " + consumerName);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Units Consumed : " + calculateUnits());
        System.out.println("Bill Amount    : Rs. " + computeBill());
    }
}

public class Assign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Consumer Number: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        int previousReading = scanner.nextInt();
        System.out.print("Enter Current Month Reading: ");
        int currentReading = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Connection Type (domestic/commercial): ");
        String connectionType = scanner.nextLine();

      
        Assign3 bill = new Assign3(consumerNo, consumerName, previousReading, currentReading, connectionType);  
        bill.displayBill();
        scanner.close();
    }
}
    



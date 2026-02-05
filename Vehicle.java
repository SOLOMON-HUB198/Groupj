import java.util.Scanner;

public class Vehicle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vehicle Reg No: ");
        String regNo = sc.nextLine();

        System.out.print("Vehicle Cost: ");
        double cost = sc.nextDouble();

        System.out.print("Deposits Made: ");
        double deposits = sc.nextDouble();

        System.out.print("Expenses Incurred: ");
        double expenses = sc.nextDouble();

        double[] bids = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter bid for bidder " + (i + 1) + ": ");
            bids[i] = sc.nextDouble();
        }

        double highestBid = bids[0];
        for (double bid : bids) {
            if (bid > highestBid)
                highestBid = bid;
        }

        double balance = highestBid - deposits;
        double profitLoss = highestBid - (cost + expenses);

        System.out.println("\n--- VEHICLE SUMMARY ---");
        System.out.println("Reg No: " + regNo);
        System.out.println("Highest Bid: " + highestBid);
        System.out.println("Balance: " + balance);

        if (profitLoss > 0)
            System.out.println("Profit: " + profitLoss);
        else
            System.out.println("Loss: " + profitLoss);
    }
}

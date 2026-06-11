import java.util.Scanner;

public class FlightBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] flights = {
                "Delhi to Mumbai - ₹9000",
                "Delhi to Bangalore - ₹6500",
                "Delhi to Kolkata - ₹5500"
        };

        int[] prices = {9000, 6500, 5500};

        System.out.println("=================================");
        System.out.println("     FLIGHT BOOKING SYSTEM");
        System.out.println("=================================");

        System.out.println("\nAvailable Flights:");

        for (int i = 0; i < flights.length; i++) {
            System.out.println((i + 1) + ". " + flights[i]);
        }

        System.out.print("\nSelect Flight (1-3): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid Flight Selection!");
            return;
        }

        System.out.println("\nAvailable Seats:");
        System.out.println("1. Window Seat");
        System.out.println("2. Middle Seat");
        System.out.println("3. Aisle Seat");

        System.out.print("Choose Seat: ");
        int seatChoice = sc.nextInt();

        String seatType;

        switch (seatChoice) {
            case 1:
                seatType = "Window Seat";
                break;
            case 2:
                seatType = "Middle Seat";
                break;
            case 3:
                seatType = "Aisle Seat";
                break;
            default:
                System.out.println("Invalid Seat Selection!");
                return;
        }

        System.out.print("\nEnter Passenger Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("\n===== PAYMENT DETAILS =====");
        System.out.println("Amount to Pay: ₹" + prices[choice - 1]);

        System.out.print("Enter Payment Amount: ₹");
        int payment = sc.nextInt();

        if (payment < prices[choice - 1]) {
            System.out.println("Payment Failed! Insufficient Amount.");
        } else {
            System.out.println("\n===== BOOKING CONFIRMED =====");
            System.out.println("Passenger Name : " + name);
            System.out.println("Flight         : " + flights[choice - 1]);
            System.out.println("Seat Type      : " + seatType);
            System.out.println("Amount Paid    : ₹" + payment);
            System.out.println("Booking Status : Confirmed");
        }

        sc.close();
    }
}

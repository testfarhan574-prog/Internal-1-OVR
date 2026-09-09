package kmitlab.OVR;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("     ONLINE VEHICLE RENTAL SYSTEM");
        System.out.println("======================================");

        System.out.println("\n1. View Available Vehicles");
        System.out.println("2. Rent a Vehicle");
        System.out.println("3. Return a Vehicle");
        System.out.println("4. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nAvailable Vehicles:");
                System.out.println("-------------------------");
                System.out.println("1. Toyota Corolla - ₹2000/day");
                System.out.println("2. Honda City     - ₹2500/day");
                System.out.println("3. Hyundai Creta  - ₹3000/day");
                System.out.println("4. Royal Enfield  - ₹1200/day");
                break;

            case 2:
                System.out.println("\nVehicle Rental");
                System.out.println("-------------------------");

                System.out.print("Enter customer name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.println("1. Toyota Corolla - ₹2000/day");
                System.out.println("2. Honda City     - ₹2500/day");
                System.out.println("3. Hyundai Creta  - ₹3000/day");
                System.out.println("4. Royal Enfield  - ₹1200/day");

                System.out.print("Select vehicle: ");
                int vehicle = sc.nextInt();

                System.out.print("Enter number of rental days: ");
                int days = sc.nextInt();

                int price = 0;
                String vehicleName = "";

                switch (vehicle) {
                    case 1:
                        vehicleName = "Toyota Corolla";
                        price = 2000;
                        break;

                    case 2:
                        vehicleName = "Honda City";
                        price = 2500;
                        break;

                    case 3:
                        vehicleName = "Hyundai Creta";
                        price = 3000;
                        break;

                    case 4:
                        vehicleName = "Royal Enfield";
                        price = 1200;
                        break;

                    default:
                        System.out.println("Invalid vehicle selection.");
                        sc.close();
                        return;
                }

                int total = price * days;

                System.out.println("\n========== RENTAL DETAILS ==========");
                System.out.println("Customer Name : " + name);
                System.out.println("Vehicle       : " + vehicleName);
                System.out.println("Rental Days   : " + days);
                System.out.println("Price/Day     : ₹" + price);
                System.out.println("Total Amount  : ₹" + total);
                System.out.println("====================================");
                System.out.println("Vehicle booked successfully!");

                break;

            case 3:
                System.out.println("\nVehicle returned successfully!");
                break;

            case 4:
                System.out.println("\nThank you for using Online Vehicle Rental System!");
                break;

            default:
                System.out.println("\nInvalid choice!");
        }

        sc.close();
    }
}

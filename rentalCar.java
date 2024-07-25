import java.util.Scanner;


public class rentalCar {
    private String name;
    private int price;
    private String fuel_type;


    public String getName() {
        return name;
    }
    public rentalCar setName(String name) {
        this.name = name;
        System.out.println("WELCOME TO DABBA CAR RENTAL SYSTEM ");
        System.out.print("PLEASE ENTER YOUR NAME : ");
        Scanner s= new Scanner(System.in);
        String user=s.nextLine();
        System.out.println("WELCOME  "+user.toUpperCase());
        return this;

    }

    public int getPrice() {
        return price;
    }
    public rentalCar setPrice(int price) {
        this.price = price;
        System.out.println("ENTER HOW MANY DAYS YOU ARE GOING TO USE ");
        Scanner p=new Scanner(System.in);
        int days=p.nextInt();
        if ( days<=5){
            int amount = 1000*days;
            System.out.println(amount);
         }
         else{
            int amount= 2000*days;
            System.out.println(amount);
         }

         System.out.println("WHILE RETURNING CAR MAKE SURE THAT THE FUEL TANK IS FULL ");
         return this;
    }
    public String getFuel_type() {
        return fuel_type;
    }
    public rentalCar setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
        System.out.println("CHOOSE YOUR CAR MODEL ");
        System.out.println("1. BMW");
        System.out.println("2. AUDI");
        System.out.println("3. RR");
        System.out.println("4. JAGUAR");

        Scanner f = new Scanner(System.in);
        int model = f.nextInt();
        f.nextLine(); // Consume the newline character left by nextInt()

        switch (model) {
            case 1:
                System.out.println("YOU HAVE SELECTED BMW");
                break;
            case 2:
                System.out.println("YOU HAVE SELECTED AUDI");
                break;
            case 3:
                System.out.println("YOU HAVE SELECTED RR");
                break;
            case 4:
                System.out.println("YOU HAVE SELECTED JAGUAR");
                break;
            default:
                System.out.println("INVALID CHOICE");
                return this;
        }

        repeat();
        return this;
    }

    public rentalCar repeat() {
        Scanner pd = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {    //looping code when the user puts invalid fuel type;
            System.out.println("YOUR FUEL TYPE PREFERENCE (PETROL/DIESEL): ");
            String type = pd.nextLine();
            if (type.equalsIgnoreCase("petrol") || type.equalsIgnoreCase("diesel")) {
                System.out.println("YOU HAVE SELECTED A " + type.toUpperCase() + " VARIANT ");
                this.fuel_type = type;
                valid = true;
            } else {
                System.out.println("INVALID CHOICE. ONLY PETROL/DIESEL OPTIONS ARE AVAILABLE. PLEASE TRY AGAIN.");
            }
        }
        return this;
    }
    public static void main(String[] args) {
        rentalCar r1= new rentalCar();
        r1.setName(null).setFuel_type(null).setPrice(0);
       
    }
    
}

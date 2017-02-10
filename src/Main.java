import java.util.ArrayList;
import java.util.Scanner;

public class Main 

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList();
        int carChoice = 0;
        String buyCarChoice = "no";

        carList.add(new UsedCar("ford", "five hundred", 1997, 50000.00,50000));
        carList.add(new UsedCar("toyota", "avalon", 1997, 39999.00, 90000));
        carList.add(new UsedCar("nissan", "altima", 1997, 19999.00, 80000));
        carList.add(new Car("mini", "cooper", 1997, 59999.00));
        carList.add(new Car("chevy", "volt", 2000, 59999.00));
        carList.add(new Car("hummer", "H1", 2010, 100000.00));


        int i = 1;
        for (Car c : carList) {

            System.out.println(i + "." + c.toString());
            ++i;
        }


        System.out.println("Which car do you want?");
        carChoice = scan1.nextInt();
        scan1.nextLine();

        System.out.println(carList.get(carChoice-1).toString());

        System.out.println("Do you want to buy the car?");
        buyCarChoice = scan1.nextLine();


        if (buyCarChoice.equalsIgnoreCase("yes"))
        {

            carList.remove(carChoice-1);
        }





        i =1;
        for (Car c : carList) {

            System.out.println(i + " " + c.toString());
            ++i;
        }












    }













    public static ArrayList<Car> getUserCarInput() // obtains user input for an ArrayList of car objects
    {
        Scanner scan1 = new Scanner(System.in);
        int numCars = 0;
        String make = "";
        String model ="";
        int year = 0;
        double price = 0.0;
        ArrayList <Car> carList = new ArrayList<>();



        System.out.println("How many cars are you entering?");
        numCars = scan1.nextInt();
        scan1.nextLine();


        for (int i = 0; i < numCars; i++)
        {
            System.out.printf("Enter car# %d: make: ", i +1);
            make = scan1.nextLine();

            System.out.printf("Enter car# %d: model: ", i +1);
            model = scan1.nextLine();

            System.out.printf("Enter car# %d: year: ", i +1);
            year = scan1.nextInt();
            scan1.nextLine();

            System.out.printf("Enter car# %d: price: ", i +1);
            price = scan1.nextDouble();
            scan1.nextLine();

            carList.add(new Car(make,model,year,price));



        }


        return carList;
    }

   public static void printCars(ArrayList <Car> carList) // prints out an array
   {


       System.out.println("Current Inventory");
       for (Car c: carList)
       {

           System.out.println(c.toString());

       }




   }



}

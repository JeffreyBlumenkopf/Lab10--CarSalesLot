/**
 * Created by Owner on 2/9/2017.
 */
public class UsedCar extends Car {

    private int mileage;


    public UsedCar(String make, String model, int year, double price, int mileage) {
        super(make, model, year, price);
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
       return String.format("%-10s %-10s %-10d %-10.2f %-15d", make, model,year, price, mileage);
      // return String.format("%1$10s %2$10s %3$7d %4$10.2f %s", make, model, year, price, mileage);
    }


}

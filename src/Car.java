/**
 * Created by Owner on 2/9/2017.
 */
public class Car {
    public String make;//TODO turn in to protected variable si it can only be used in this class and subclass
    public String model;
    public int year;
    public double price;

    public Car(String make, String model, int year, double price) {// constructor that creates car class the .this method allows the same variables to be used in program
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override

    public String toString(){


        return String.format("%-10s %-10s %-10d %-10.2f ", make, model,year, price);
        //return String.format("%1$10s %2$10s %3$7d %4$10.2f" , make, model, year, price);
    }



}

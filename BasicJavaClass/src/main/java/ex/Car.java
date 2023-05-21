package ex;

import java.time.Year;

public class Car {

    private String make;
    private String model;
    private Year modelYear;

    public Car(String make, String model, Year modeYear){
        this.make = make;
        this.model = model;
        this.modelYear = modeYear;
    }
    /* The key is to generate a toString() method that prints all the properties */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "X", Year.of(2020));
        System.out.println(myCar);
        Car mySecondCar = new Car("ACURA","ILC",Year.of(2014));
        System.out.println(mySecondCar);
    }

}

package transportation;

import java.util.Iterator;
import java.util.TreeSet;

public class Car implements IVehicle {

    private String brand;
    private TreeSet brandTreeSet;

    public Car(String brand) {
        this.brand = brand;
        brandTreeSet = new TreeSet();
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void ajuterBrand(String brand) {
        brandTreeSet.add(brand);
    }

    public String getBrands() {
        String listeBrands = "";
        Iterator it = brandTreeSet.iterator();

        while (it.hasNext()) {
            String brand = (String) it.next();
            listeBrands = listeBrands + "\n" + brand;
        }
        return listeBrands;
    }

    //Implementing our interface methods.
    public void applyBreak(int bPow) {
        System.out.println("I APPLY BREAK : (break power) " + bPow);
    }

    public void accelerate(int aPow) {
        System.out.println("VROUM VROUM : (accelerationSpeed) " + aPow);
    }

    public String toString() {
        return (" List of brands : " + getBrands());

    }

}
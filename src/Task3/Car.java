package Task3;

public class Car {
    double carPrice;
    String color;
    void calculateSalePrice(double carPrice){
        this.carPrice=carPrice;
        System.out.println("The price of the car is "+carPrice);
    }
}
class Sedan extends Car{
    int length;


    @Override void calculateSalePrice(double carPrice) {
        if(length >20){
            carPrice=carPrice*0.95;
        }else{
            carPrice=carPrice*0.90;
        }
        System.out.println("The price of the car is "+carPrice);
    }
}
class Truck extends Car{
    double weight;

    @Override
    void calculateSalePrice(double carPrice) {
        if(weight > 2000){
            carPrice=carPrice*0.90;
        }else{
            carPrice=carPrice*0.80;
        }System.out.println("The price of the car is "+carPrice);
    }
}
class Main{
    public static void main(String[] args) {
        Sedan hw=new Sedan();
        hw.length=21;
        hw.calculateSalePrice(2000);
        Truck hw1=new Truck();
        hw1.weight=1500;
        hw.calculateSalePrice(2000);
    }
}

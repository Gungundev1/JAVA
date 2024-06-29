package Oops.Inheritance;

class Vehicle{
   String colour;
   String model;
   int price;
   public void details(String colour, String model, int price){
       System.out.println("colour:- "+colour);
       System.out.println("model:- "+model);
       System.out.println("price:- "+price);
   }
}
class Car extends Vehicle {
    int buy_year;

    public Car( int buy_year) {

        this.buy_year = buy_year;
    }
        public void year() {

            System.out.println("BUY_year:- " + buy_year);
        }
    }

public class Test {
    public static void main(String[] args) {
        Car obj=new Car(2024);
        obj.details("Black","BMW",6000000);
        obj.year();
    }


}

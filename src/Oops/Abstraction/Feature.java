package Oops.Abstraction;
abstract class Vehicle{
    String color;
   public abstract void colour();
    abstract void start();
    abstract void brake();
        }
        class Car extends Vehicle{


            public void colour() {
                this.color=color;
                System.out.println(color);
            }


            void start() {
                System.out.println("car is starting");
            }


            void brake() {
                System.out.println("Press brake");
            }
        }
        class MotorCycle extends Vehicle{


            public void colour() {
                this.color=color;
                System.out.println(color);
            }


            void start() {
                System.out.println("Motorcycle is starting");
            }


            void brake() {
                System.out.println("Press brake");
            }
        }
public class Feature {
    public static void main(String[] args) {
        Car c=new Car();
        c.color="RED";
        c.colour();
        c.start();
        c.brake();
        MotorCycle bike =new MotorCycle();
        bike.color="Black";
        bike.colour();
        bike.start();
        bike.brake();

    }
}

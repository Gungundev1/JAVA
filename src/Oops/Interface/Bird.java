package Oops.Interface;

 class Bird implements Animal,Flyable {


        @Override
        public void eat () {
            System.out.println("it's eating");
        }

        @Override
        public void sleep () {
            System.out.println("It's sleeping");
        }

        @Override
        public void fly () {
            System.out.println("It's flying");
        }


public static void main(String[] args) {
    Bird obj = new Bird();
    obj.eat();
    obj.fly();
    obj.sleep();
}
}

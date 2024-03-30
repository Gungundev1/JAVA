package BasicJava.Functions;
    class GrandFather{
        void sing(){
            System.out.println("GrandFather is singing");
        }
    }

    class Father extends GrandFather {
        @Override
        void sing() {
            System.out.println("Father is singing");
        }
    }
        class Daughter extends Father {
            @Override
            void sing() {
                System.out.println("Daughter is singing");
            }
        }
    public class OverRiding {
        public static void main(String[] args){
            Daughter obj=new Daughter();
            obj.sing();
        }
    }



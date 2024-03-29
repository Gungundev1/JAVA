package BasicJava.Functions;

class OverLoading {

    static   void schedule(String time) {
        System.out.println("morning time:)  ");
        System.out.println("• Make bed ,drink water\n• Take bath & go for Worship");
    }
    static void schedule(int time) {
        System.out.println("Noon time:)");
        System.out.println("• Take Breakfast & schedule your day\n• Do your Schedule's work");
    }
    static   void schedule(double time) {
        System.out.println("Evening time:)");
        System.out.println("• Go for walk.\n• Read some interesting things");
    }
    static public void schedule(char time){
        System.out.println("Night time:)");
        System.out.println("• Take dinner.\n • complete your schedule's work."+"\n"+ "• Go to the bed");
    }
    public static void main(String[] args) {
        String name;
        schedule("1");
        schedule(1);
        schedule(1.0);
        schedule('g');
    }

}

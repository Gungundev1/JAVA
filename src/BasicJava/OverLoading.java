package BasicJava;

class Morning {
    void schedule(String time) {
        System.out.println("morning time:)  ");
        System.out.println("• Make bed ,drink water\n• Take bath & go for Worship");
    }
}

class Noon extends Morning {
    void schedule(int time) {
        System.out.println("Noon time:)");
        System.out.println("• Take Breakfast & schedule your day\n• Do your Schedule's work");
    }
}

class Evening extends Noon {

    void schedule(double time) {
        System.out.println("Evening time:)");
        System.out.println("• Go for walk.\n• Read some interesting things");
    }
}

class Night extends Evening {
     public void schedule(char time){
        System.out.println("Night time:)");
        System.out.println("• Take dinner.\n • complete your schedule's work."+"\n"+ "• Go to the bed");
     }
}

class Overloading {
    public static void main(String[] args) {
//        String name;
       Night E = new Night();
        E.schedule("1");
        E.schedule(1);
        E.schedule(1.0);
        E.schedule('g');
    }
}



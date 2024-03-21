package HackerRank;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in Soccer Class ");
    }
}

public class MethodOverRiding {

    public static void main(String[] args) {
        Sports s=new Sports();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
        Soccer obj=new Soccer();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
    }
}


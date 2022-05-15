import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.*;

interface Sports{
     public String getName();
     public void getNumberOfTeamMembers();
}
class GenericSports implements Sports{

    @Override
    public String getName(){
        return "Generic Sports";
    }
    @Override
    public void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer implements Sports{
    @Override
    public String getName(){
        return "Soccer Class";
    }
    // Write your overridden getNumberOfTeamMembers method here
    @Override
    public void getNumberOfTeamMembers(){
        System.out.println( "Each team had 11 players in " + getName() );
    }
}

public class MethodOverriding{

    public static void main(String []args){
        GenericSports c1 = new GenericSports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}

//Output Format
//Generic Sports
// Each team has n players in Generic Sports
// Soccer Class
// Each team has 11 players in Soccer Class
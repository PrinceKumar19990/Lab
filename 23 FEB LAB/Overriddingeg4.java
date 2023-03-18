package LAB23FEB;

class Sports{

    String getName(){

        return "Generic Sports";

    }

    void getNumberOfTeamMembers(){

        System.out.println( "Each team has n players in " + getName() );

    }

}
class Soccer extends Sports {
	 @Override
	    String getName() {
	        return "Soccer Class";
	    }
	

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
   

 public class Overriddingeg4 {
public static void main(String[] args) {
	Sports game = new Sports();
	System.out.println(game.getName());
	game.getNumberOfTeamMembers();
	Soccer game2 = new Soccer();
	System.out.println(game2.getName());
	game2.getNumberOfTeamMembers();
}
} 
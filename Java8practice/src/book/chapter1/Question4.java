package book.chapter1;

public class Question4 {

}
class BaseBallTeam{
    private int numberOfPlayers;
    private String city,mascot;
    @Override
    public boolean equals(Object obj){
	if(!(obj instanceof BaseBallTeam)){
	    return false;
	}
	BaseBallTeam other =(BaseBallTeam) obj;
	return(city.equals(other.city)&&mascot.equals(other.mascot));
    }
    @Override
    public int hashCode(){
	return numberOfPlayers;
    }
}
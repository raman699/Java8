package book.chapter1;

//checking the switch statements with enum
public class Enumcheck2 {

    public static void main(String...s){
	Season season=Season.valueOf("SPRING");
	switch(season){
	case SPRING:
	    System.out.println("it is spring");
	    break;
	case WINTER:
	    System.out.println("this is winter");
	    break;
	default:
	    break;
	    //but if we owuld have given
	    //case 2: it would have been error

	}
	switch(season.ordinal()){
	case 2:
	    System.out.println("this is 2");
	}
    }
}

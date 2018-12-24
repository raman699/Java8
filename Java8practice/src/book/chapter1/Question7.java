package book.chapter1;

public class Question7 {
    enum IceCream{
	VANILLA,CHOCOLATE,STRAWBERRY
    }
    public static void main(String[] args) {
	IceCream i=IceCream.STRAWBERRY;
	switch(i){
	case 0: System.out.println("vanila");
	case 1: System.out.println("CHOCOLATE");
	case 2: System.out.println("STRAWBERRY");
	break;
	default:System.out.println("missing flavour");
	}

    }

}

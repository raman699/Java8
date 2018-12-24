package book.chapter1;

//enums are also case sensitive
//enums can contain main method
class EnumCheck{
    public static void main(String...s){
	Season s1=Season.AUTUMN;
	System.out.println(s1.AUTUMN);
	System.out.println(s1);
	System.out.println(s1.name());
	//it should be invoked in a static way
	//there is no difference in output
	try{
	    Season spring = Season.valueOf("SPRINg");
	    System.out.println(spring);
	}catch(Exception e){
	    System.out.println("Exception caught");
	}
	Season autumn=Season.AUTUMN;

	//see this is case  sensitive
	//if we don't give right value then it will give IllegalArgumentException
	//Now comparison of enums by two methods
	if(s1==Season.SPRING){
	    System.out.println(true);
	}
	else{
	    System.out.println(false);
	}

	//here we can cannot write the following:
	//	if(2==Season.SPRING){
	//
	//	}
	//	if(s1==2){
	//
	//	}
	//if(Season.AUTUMN=="AUTMN"){

	//}
	//but we can give the following:
	if(Season.SPRING.ordinal()==2){

	}//or
	if(s1.ordinal()==2){}
	for(Season season: Season.values()){
	    System.out.println(season.name()+" "+season.ordinal());
	}
    }
}
//exendting enums are not allowed
public enum Season {

    AUTUMN,RAIN,SPRING,SUMMER,WINTER;
    public static void main(String...s){
	System.out.println("helo from main");
    }
    Season(){
	System.out.println("hello Enum here");;
    }
}
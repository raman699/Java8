package book.chapter1;

enum EnumState {

    STATE1("S1",1),STATE2("S2",1);
    //private String name;
    //if you see you will not have any benefit if you use constructor and not assign values to it .
    //You will then only able to get the default name and ordinal values
    EnumState(String name,int g){
	//this.name=name;
    }
    //constructor becomes mandatory if need to pass them some user-defined values
    //like we have already said that these are constants so there is a need to pass some values,we pass here

    public static void main(String...s){
	EnumState enumState =EnumState.STATE1;
	System.out.println(enumState);
    }
}
//default constructor enum are allowed
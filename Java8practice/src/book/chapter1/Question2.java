package book.chapter1;

public class Question2 {

    public static void main(String[] args) {


    }

}
class Book{
    private int ISBN;
    private String title,author;
    private int pageCount;
    public int hasCode(){
	return ISBN;
    }
    @Override
    public boolean equals(Object obj){
	if(!(obj instanceof Book)){
	    return false;
	}
	Book other=(Book)obj;
	return this.ISBN==other.ISBN;
    }
}
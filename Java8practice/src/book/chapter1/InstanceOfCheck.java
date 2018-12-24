package book.chapter1;

class Child1InstanceOfCheck{

}
class Child2InstanceOfCheck{

}
public class InstanceOfCheck {

    public static void main(String...s){
	final Child1InstanceOfCheck c1=new Child1InstanceOfCheck();
	final boolean b =c1 instanceof Object;

    }
}
interface OtherClass{

}
class ParentInstanceOfCheck{

}
package book.chapter1;

public class OverridingRules extends OverridingRulesParent {

    public static void main(String[] args) {

    }
    @Override
    public int checkReturnType(){
	return 0;

    }

    public void staticCheck(){}
}
class OverridingRulesParent{

    public static void staticCheck(){}
    public long checkReturnType(){
	return 0;

    }
}
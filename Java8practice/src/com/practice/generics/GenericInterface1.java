package com.practice.generics;

public interface GenericInterface1<T> {
    Class<String> string=null;
    public void show();
}
/*you are allowed to not use the generic parameter is you want .
It is syntactically correct but of no use
 */
interface GenericInterface2<T>{
    public void show(T t);
}
class GI_Implemeted1 implements GenericInterface2<String>{

    @Override
    public void show(String t) {
	// TODO Auto-generated method stub

    }
    /*if the class name defined at the implementation level is different
 than that defined at the implemented level then it would be an error
     */
}
class GI_Implemented2<T> implements GenericInterface2<T>{

    @Override
    public void show(T t) {
	// TODO Auto-generated method stub

    }

}
/* Second approach is defining the generic parameter again
but make sure that class is also declared with same generic tpe
as it will make sure that the when the instance of this class is made with generics
it pass that data-type to implemented methods also.
 */
class GI_implemented3 implements GenericInterface2{

    @Override
    public void show(Object t) {
	// TODO Auto-generated method stub

    }
}
//Third approach: do not define generic type at all

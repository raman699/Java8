package book.chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StaticImportCheck {

    public List<String> copyAndSortList(List <String> org){
	final List<String> list=new ArrayList<String>(org);
	Collections.sort(list);
	return list;
    }
}

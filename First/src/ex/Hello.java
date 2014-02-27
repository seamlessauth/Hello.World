package ex;

import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        for(int i = 0; i < 10; i++) {
            myList.add("i" + i);
        }
        System.out.println(myList);
	}

}

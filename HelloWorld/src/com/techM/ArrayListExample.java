package com.techM;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
	    ArrayList<String> arrayList = new ArrayList<String>();

	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("java2s.com");
	    
	    int totalElements = arrayList.size();
	    for (int index = 0; index < totalElements; index++)
	      System.out.println(arrayList.get(index));
	  }

}

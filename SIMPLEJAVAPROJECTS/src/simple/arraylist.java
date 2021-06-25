package simple;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
	  public static void main(String[] args) {
	      ArrayList<Integer> numbers = new ArrayList<Integer>();
	      numbers.add(1);
	      numbers.add(7);
	      numbers.add(5);
	      numbers.add(6);
	      System.out.println("Number of elements in ArrayList: "+numbers.size());
	      ArrayList<String> alist=new ArrayList<String>(); 
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");

	      //displaying elements
	      System.out.println(alist);

	      //Removing "Steve" and "Angela"
	      alist.remove("Steve");
	      alist.remove("Angela");

	      //displaying elements
	      System.out.println(alist);

	      //Removing 3rd element
	      alist.remove(0);

	      //displaying elements
	      System.out.println(alist);
	      ArrayList<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	      Collections.sort(fruits);

	      for (String str : fruits) {
	         System.out.println(str);
	      }
	      
	   }

}

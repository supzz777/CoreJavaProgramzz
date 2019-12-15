import java.util.LinkedList;

public class ArraysOfLinkedList
{
	public static void main(String args[]) {
	      LinkedList list1 = new LinkedList();
	      list1.add("JavaFX");
	      list1.add("Hbase");
	     
	      LinkedList list2 = new LinkedList();
	      list2.add("OpenCV");
	      list2.add("Mahout");
	     
	      LinkedList list3 = new LinkedList();
	      list3.add("WebGL");
	      list3.add("CoffeeScript");
	      Object[] obj = {list1, list2, list3};
	     
	      for (int i=0; i<obj.length; i++) {
	         System.out.println(obj[i].toString());
	      }
	   }

}

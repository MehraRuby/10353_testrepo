package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ProductTestCase 
{
	public static List<Product> L = Arrays
            .asList(
           		 new Product("Pen",80.50,10,"stationary",10.00),
           		 new Product("PenHolder",90.50,10,"stationary",00.00),
           		 new Product("HarryPotter",1500.00,5,"books",00.00),
           		 new Product("Laptop",80000.00,4,"electronics",15000.00),
           		 new Product("FlashDrive",1500.00,0,"electronics",250.00),
           		 new Product("Eraser",10.50,200,"stationary",10.00),
           		 new Product("Java17",1000.50,7,"books",250.00),
           		 new Product("Hadoop Clustering",1500.50,6,"books",50.00),
           		 new Product("Speakers",2500.00,5,"electronics",500.00),
           		 new Product("Mouse",2500.00,0,"electronics",250.00)	
           		);	
	
	public static void main(String[] args)
	{
		    
	      int rows = 4;
	      int cols = 4;
	      int innerRows = rows - 2;
	      int innerCols = cols - 2;
	      String innerRow = innerRows > 0 && innerCols > 0 ? "O".repeat(innerCols) : "";
	      List<String> box = new ArrayList<>();
	      for(int i=0;i<L.size();i++)
	      {
	      box.add("-".repeat(cols));
	      box.add(L.get(i).toString());
	      box.add("-".repeat(cols));
	      if(i%2==0)System.out.println();
	      System.out.print(box+"\t");
	      box.clear();
	      }
	      
	    
	}
	

}

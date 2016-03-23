

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile {

	public static void main(String[] args)  {
		 try {
			 FileReader a = new FileReader("C:/Mtest/test1.txt") ;
			 BufferedReader b = new BufferedReader(a);
			 String [] temp ;
			 String s = b.readLine();
			 temp = s.split(" "); 
			 int numofline = Integer.parseInt(temp[0]);
			 int i = 3 ; // start of the black point on list 
			 // 5 4 1 0
			 Graph t = new Graph(i);
			 while (i < temp.length) {
				 
			}
			 
			 
			 
		} catch (Exception e) {
			System.out.println("ther is no such file with this name !! ");
		}
		 	
		 
		
		
	}

}

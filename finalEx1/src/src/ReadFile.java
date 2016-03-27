package src;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;



public class ReadFile {

	public static void main(String[] args)  {
		 try {
			
			 FileWriter fff = new FileWriter("C:\\ex1\\te2iscszcziii.txt");
			 BufferedWriter gggg = new BufferedWriter(fff);
			 gggg.write(4444);
			 FileReader a = new FileReader("C:\\ex1\\test1.txt") ;
			 BufferedReader b = new BufferedReader(a);
			 String [] temp ;
			 int from,to,numOfBL;
			 ArrayList<Integer> jjj = new ArrayList<>();
			 String s = b.readLine();
			 int numofline = Integer.parseInt(s);
			 int i = 3 ; // start of the black point on list 
			 // 5 4 1 0
			 In AAAA = new In("C:\\ex1\\tinyEWD.txt"); 
			 Graph t = new Graph(AAAA);
			 for (int j = 0; j < numofline ; j++) {
				 s = b.readLine();
				 temp = s.split(" "); 
				 from = Integer.parseInt(temp[0]);
				 to = Integer.parseInt(temp[1]);
				 numOfBL = Integer.parseInt(temp[2]);
				 int aaaa =  0;
				 int bb = 2 ;
				 while (aaaa < numOfBL ){
					 jjj.add(Integer.parseInt(temp[bb++]));
					 aaaa++;
				 }
				 t.blin(jjj);
				 Graph_algo ddddd = new Graph_algo(t , from);
				 System.out.println(ddddd.distTo(to));
				 //ddddd.distTo(to);
			 
				 fff.write(j);
				 
			}
			 gggg.close();
				 
				 
				 
			
	
			 
			 
		} catch (Exception e) {
			System.out.println("ther is no such file with this name !! ");
		}
	
		 
		
		
	}

}

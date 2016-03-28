

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile {

	public static void main(String[] args)  {
		 try {
			 File d = new File("C:/output.txt");
			 d.createNewFile();
			 FileWriter output = new FileWriter(d);
			 FileReader a = new FileReader("C:/test1.txt") ;
			 FileReader c = new FileReader("C:/test1.txt") ;
			
			 BufferedReader b = new BufferedReader(a);
			 BufferedReader e = new BufferedReader(c);
			 
			 String [] temp ;
			 String temp1 ;
			 temp1 = e.readLine();
			 int from,to,numOfBL;
			 ArrayList<Integer> jjj = new ArrayList<>();
			 String s = b.readLine();
			 int numofline = Integer.parseInt(s);
			 In AAAA = new In("C:/tinyEWD.txt"); 
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
				 ddddd.distTo(to);
				 temp1 = e.readLine();
				 output.write(temp1);
				 output.write(" ");
				 output.write(Double.toString(ddddd.distTo(to)));
				 output.write("\n");
			}
			 output.close();
	
		} catch (Exception e) {
			System.out.println("ther is no such file with this name !! ");
		}
	}

}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author 
 */
public class Test_EX {
    In in ;
    Graph Gr ;
    
    public Test_EX(String Graf , String Test){
        
        in = new In(Graf);
        Gr = new Graph(in);
        
        long start = System.currentTimeMillis();

        try {
            FileReader fr = new FileReader(Test);
            BufferedReader br = new BufferedReader(fr);
            String s;
            s = br.readLine();
            int result = Integer.parseInt(s);
            
        	PrintWriter outp;
        	OutputStream os = new FileOutputStream("ans.txt");
        	OutputStreamWriter osw = new OutputStreamWriter(os);
        	outp = new PrintWriter(osw,true);
        	outp.println(result);
         
        	for (int i = 0; i < result; i++) {
            
        		ArrayList<Integer> n = new ArrayList<Integer>();
            	s = br.readLine();
            	
            	String[] details = s.split(" ");
            	int strn = 0;
            	int from = Integer.parseInt(details[strn++]);
            	int to = Integer.parseInt(details[strn++]);
            	int Sumbl = Integer.parseInt(details[strn++]);
            	
            	for (int j = 0; j < Sumbl; j++) {
            		n.add(Integer.parseInt(details[strn++]));
				}
            	
            	Gr.blin(n);
                Graph_algo sp1 = new Graph_algo(Gr, from);
                
                if (sp1.hasPathTo(to) && sp1.distTo(to) <  Double.POSITIVE_INFINITY ) 
                {
                  System.out.println(s+" "+sp1.distTo(to));
                }
                
                else 
                {
                	System.out.println(s+" "+sp1.distTo(to));
                }
                
                	outp.println(s + " " + sp1.distTo(to));
               
                Gr.blinrollback();
			}
        	
            br.close();
            fr.close();
        } 
        catch (IOException ex) {
            System.out.print("error reading file\n" + ex);
            System.exit(2);
        }
        
        long end = System.currentTimeMillis();
        System.out.println(" test time = " + (end-start)/1000. + " seconds");
        
    }
    
    
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        String Test = "test1.txt";
        String Graf = "tinyEWD.txt";
        Test_EX a = new Test_EX(Graf ,Test );
        
        long end = System.currentTimeMillis();
        System.out.println("graf time = " + (end-start)/1000. + " seconds");
        
        
    }
        
    
}

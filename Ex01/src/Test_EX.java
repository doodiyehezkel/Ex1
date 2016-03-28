
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Most601
 */
public class Test_EX {
    In in ;
    Graph G ;
    
    public Test_EX(String Graf , String Test){
        
        in = new In(Graf);
        G = new Graph(in);
        
        
        long start = System.currentTimeMillis();

        
    
        
        //-------------------------------------------------------------------
        
    	
        try {
            FileReader fr = new FileReader(Test);
            BufferedReader br = new BufferedReader(fr);
            String str;
            str = br.readLine();
            int sum = Integer.parseInt(str);
            
        	PrintWriter out;
        	OutputStream os = new FileOutputStream("ans.txt");
        	OutputStreamWriter osw = new OutputStreamWriter(os);
        	out = new PrintWriter(osw,true);
        	out.println(sum);
            for (int i = 0; i < sum; i++) {
            	ArrayList<Integer> num = new ArrayList<Integer>();
            	str = br.readLine();
            	String[] details = str.split(" ");
            	int strnum = 0;
            	int from = Integer.parseInt(details[strnum++]);
            	int to = Integer.parseInt(details[strnum++]);
            	int SumBL = Integer.parseInt(details[strnum++]);
            	for (int j = 0; j < SumBL; j++) {
            		num.add(Integer.parseInt(details[strnum++]));
				}
            	G.blin(num);
                Graph_algo sp1 = new Graph_algo(G, from);
                
                //prints from to dis 
                if (sp1.hasPathTo(to) && sp1.distTo(to) <  Double.POSITIVE_INFINITY ) {
                	//System.out.println(from+" to "+to+" "+sp1.distTo(to));
                  System.out.println(str+" "+sp1.distTo(to));
                }
                else {
                	//System.out.println(from+" to "+to+" "+sp1.distTo(to));
                	System.out.println(str+" "+sp1.distTo(to));
                }
                
                
                
//                PrintWriter pr = new PrintWriter("test12222.txt");
           
                
                	out.println(str + " " + sp1.distTo(to));
               
               
//                
//                FileWriter fw = new FileWriter("test1-1.txt");
//                PrintWriter outs = new PrintWriter(fw);
//                outs.println(sum);
//                outs.println(str+" "+sp1.distTo(to));
                
                
                G.blinrollback();
			}
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.print("Error reading file\n" + ex);
            System.exit(2);
        }
    
        
        long end = System.currentTimeMillis();
        System.out.println("ONLY TEST time = " + (end-start)/1000. + " seconds");
        
     
        
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        long start = System.currentTimeMillis();
        String Test = "test1.txt";
        String Graf = "tinyEWD.txt";
        Test_EX a = new Test_EX(Graf ,Test );
        
        long end = System.currentTimeMillis();
        System.out.println("WITH GRAF time = " + (end-start)/1000. + " seconds");
        
        
        
        
    }
        
        

        //-------------------------------------------------------------------
//        

//      In in = new In("E:\\New folder\\largeEWD.txt");
//      Graph G = new Graph(in);
//    	long start = System.currentTimeMillis();
//		
//		
//		
//
//
//        
//        try {
//            FileReader fr = new FileReader("E:\\New folder\\test3.txt");
//            BufferedReader br = new BufferedReader(fr);
//            String str;
//            str = br.readLine();
//            int sum = Integer.parseInt(str);
//            for (int i = 0; i < sum; i++) {
//            	ArrayList<Integer> num = new ArrayList<Integer>();
//            	str = br.readLine();
//            	String[] details = str.split(" ");
//            	int strnum = 0;
//            	int from = Integer.parseInt(details[strnum++]);
//            	int to = Integer.parseInt(details[strnum++]);
//            	int SumBL = Integer.parseInt(details[strnum++]);
//            	for (int j = 0; j < SumBL; j++) {
//            		num.add(Integer.parseInt(details[strnum++]));
//				}
//            	G.BLIn(num);
//                Graph_algo sp1 = new Graph_algo(G, from);
//                
//                //prints from to dis 
//                if (sp1.hasPathTo(to) && sp1.distTo(to) < 100 ) {
//           //     	System.out.println("%d to %d (%f)  ", from, to, sp1.distTo(to));
//                  System.out.println(str+" "+sp1.distTo(to));
//                }
//                else {
//          //      	System.out.println("%d to %d (%f)  ", from, to, sp1.distTo(to));
//                	System.out.println(str+" inf");
//                }
//                
//                
//                PrintWriter pr = new PrintWriter("E:\\New folder\\test1-1.txt");
//             
//                
//                pr.write(str+"\n");
//                
////                
////                FileWriter fw = new FileWriter("E:\\New folder\\test1-1.txt");
////                PrintWriter outs = new PrintWriter(fw);
////                outs.println(sum);
////                outs.println(str+" "+sp1.distTo(to));
////                
//                
//                G.BLOut();
//			}
//            br.close();
//            fr.close();
//        } catch (IOException ex) {
//            System.out.print("Error reading file\n" + ex);
//            System.exit(2);
//        }
//    
//        
//        
//        long end = System.currentTimeMillis();
//        System.out.println("Selection Sort time = " + (end-start)/1000. + " seconds");
//        
//    }
//   
    
}

import static org.junit.Assert.*;

import org.junit.Test;


//public class TEST {
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
//
//}

import static org.junit.Assert.*;
 
	import java.io.File;
	import java.io.FileWriter;
	import java.io.PrintWriter;
	 
	import org.junit.Test;
	 
	 
	public class TEST {
		@Test
		
		public void test_tinyEWD_1(){
			
			String s1 = "output_tiny.txt";
			String s2 = "tinyEWD.txt";
			String s3 = "test1.txt";
			String s4 = "Solution_test1.txt_tinyEWD.txt_1458310266177_.txt";
			
			Test_EX ta = new Test_EX(s2 , s3);
			
			In Check_File = new In(s4);
			In Ans = new In("ans.txt");
			
			assertEquals(Ans.readLine(),Integer.toString(Check_File.readInt()));
			Check_File.readLine();
			
			while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
				assertEquals(Ans.readLine(), Check_File.readLine());
			}
			
		} 
		
		public void test_medium_1(){
			
		//	String s1 = "output_tiny.txt";
			String s2 = "mediumEWD.txt";
			String s3 = "test2.txt";
			String s4 = "Solution_test2.txt_mediumEWD.txt_1458309646602_.txt";
			
			Test_EX ta = new Test_EX(s2 , s3);
			
			In Check_File = new In(s4);
			In Ans = new In("ans.txt");
			
			assertEquals(Ans.readLine(),Integer.toString(Check_File.readInt()));
			Check_File.readLine();
			
			while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
				assertEquals(Ans.readLine(), Check_File.readLine());
			}
			
		}
		

		public void test_medium_2(){
			
		//	String s1 = "output_tiny.txt";
			String s2 = "mediumEWD.txt";
			String s3 = "test3.txt";
			String s4 = "Solution_test3.txt_mediumEWD.txt_1458310286550_.txt";
			
			Test_EX ta = new Test_EX(s2 , s3);
			
			In Check_File = new In(s4);
			In Ans = new In("ans.txt");
			
			assertEquals(Ans.readLine(),Integer.toString(Check_File.readInt()));
			Check_File.readLine();
			
			while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
				assertEquals(Ans.readLine(), Check_File.readLine());
			}
			
		}
		
		
		public void test_large_1(){
			
			//	String s1 = "output_tiny.txt";
				String s2 = "largeEWD.txt";
				String s3 = "test3.txt";
				String s4 = "Solution_test3.txt_largeEWD.txt_1458309223268_.txt";
				
				Test_EX ta = new Test_EX(s2 , s3);
				
				In Check_File = new In(s4);
				In Ans = new In("ans.txt");
				
				assertEquals(Ans.readLine(),Integer.toString(Check_File.readInt()));
				Check_File.readLine();
				
				while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
					assertEquals(Ans.readLine(), Check_File.readLine());
				}
				
			}
	
	}
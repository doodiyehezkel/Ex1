import java.util.Arrays;
public class Test {
	public static void byteSort(byte[] a){
		byte min = a[0];
		byte max = a[0];
		int k = 0 ;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)min = a[i];
			if(a[i]>max)max = a[i];
		}
		byte temp [] = new byte [max - min +1];
		for (int i = 0; i < a.length; i++) {
			temp[a[i]-min]++;
		}		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i]; j++) {
				a[k++] = (byte) (i+min);
			}
		}
		System.out.println(Arrays.toString(a));	
	}
	
	public static boolean indexEqual(int[] A){
			
		
	
		
		
		return false ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte arr[] = {4,2,13,9,7};
		byteSort(arr);
	}

}

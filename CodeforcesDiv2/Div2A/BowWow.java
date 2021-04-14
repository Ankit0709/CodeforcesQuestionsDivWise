//BowWow
import java.io.*;
import java.util.*;
public class BowWow{
static int t,n,h;
static int[] arr;
static StringBuilder ans=new StringBuilder();
static String str;
public static long  solve(){
  int value=Integer.parseInt(str,2);
  
  int pow=1;
  long count=0;
  while(value>pow){
  	count++;
  	pow*=4;
  }
  return count;
}		
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		
	 	str=br.readLine();	 		
	 	ans.append(solve()+"\n");				
	 	System.out.println(ans.toString());

    }
}
//AntonAndDanik
import java.io.*;
import java.util.*;
public class AntonAndDanik{
static int t,n,h;
static int[] arr;
static String str;
static StringBuilder ans=new StringBuilder();
public static String solve(){
 int c1=0,c2=0;
 for(int i=0;i<n;i++){
 	if(str.charAt(i)=='A')c1++;
 	else c2++;
 }
 if(c1>c2){return "Anton";}
 else if(c1==c2){return "Friendship";}
 else{return "Danik";}
 
}		
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		
	 	n=Integer.parseInt(br.readLine());
	 	str=br.readLine();
	 	ans.append(solve()+"\n");			
	 	System.out.println(ans.toString());

    }
}
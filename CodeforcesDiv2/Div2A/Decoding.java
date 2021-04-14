//Decoding
import java.io.*;
import java.util.*;
public class Decoding{
static int t,n;
static int[] arr;
static String str;
static StringBuilder ans=new StringBuilder();
public static void  solve(){
	String x="";
	//if length is odd
	if(n%2==1){	
		for(int i=0;i<n;i++){
			//first character at end at second at first
			if(i%2==0){
				x+=str.charAt(i);
			}
			else{
				x=str.charAt(i)+x;
			}
		}
	}
	//if length is even
	else{
		for(int i=0;i<n;i++){
			//first character at end at second at first
			if(i%2==1){
				x+=str.charAt(i);
			}
			else{
				x=str.charAt(i)+x;
			}
		}
	}
	ans.append(x);


}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	n=Integer.parseInt(br.readLine());
	 	str=br.readLine();
	 	solve();	 	
		System.out.println(ans.toString());

    }
}
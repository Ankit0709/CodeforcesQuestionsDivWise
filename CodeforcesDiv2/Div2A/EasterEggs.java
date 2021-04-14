//EasterEggs
import java.io.*;
import java.util.*;
public class EasterEggs{
static int t,n;
static int[] arr;
static StringBuilder ans=new StringBuilder();
public static void  solve(){
	int que=n/7;
	while(que--!=0){
		ans.append("ROYGBIV");
	}
	int rem=n%7;
	
	switch(rem){
		case 0:ans.append("");break;
		case 1:ans.append("G");break;
		case 2:ans.append("GB");break;
		case 3:ans.append("GBI");break;
		case 4:ans.append("GBIV");break;
		case 5:ans.append("YGBIV");break;
		case 6:ans.append("OYGBIV");break;
	}

}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	n=Integer.parseInt(br.readLine());
	 	solve();
		System.out.println(ans.toString());

    }
}
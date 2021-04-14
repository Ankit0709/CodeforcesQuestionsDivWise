//WayTooLong
import java.io.*;
import java.util.*;
public class WayTooLong{
static int t,n;
static int[] arr;
static String str;
static ArrayList<Integer> adj[];
static StringBuilder ans=new StringBuilder();
public static String  solve(){
	int len=str.length();
	if(len<=10){
		return str;
	}
	String x=str.charAt(0)+"";
	x+=len-2;
	x+=str.charAt(len-1);
	return x;

}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	n=Integer.parseInt(br.readLine());
	 	while(n--!=0){
	 		str=br.readLine();
	 		ans.append(solve()+"\n");
	 	}	 	
		 System.out.println(ans.toString());

    }
}
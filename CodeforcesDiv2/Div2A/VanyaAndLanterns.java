//VanyaAndLanterns
import java.io.*;
import java.util.*;
public class VanyaAndLanterns{
static int t,n,l;
static int[] arr;
static StringBuilder ans=new StringBuilder();
public static double  solve(){
	Arrays.sort(arr);
	double max_diff=(double)arr[0];
	for(int i=1;i<n;i++){
		max_diff=Math.max(max_diff,(double)(arr[i]-arr[i-1])/2);
	}
	max_diff=(double)Math.max(l-arr[n-1],max_diff);
	return max_diff;
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	String str[]=br.readLine().split(" ");
	 	t=1;
	 	while(t--!=0){
	 	n=Integer.parseInt(str[0]);
	 	l=Integer.parseInt(str[1]);
	 	arr=new int[n];	 		
	 	str=br.readLine().split(" ");
	 	for(int i=0;i<n;i++){
	 		arr[i]=Integer.parseInt(str[i]);
	 	}
	 	String x=String.format("%.10f",solve());
	 		ans.append(x+"\n");
	 	}	 	
		 System.out.println(ans.toString());

    }
}
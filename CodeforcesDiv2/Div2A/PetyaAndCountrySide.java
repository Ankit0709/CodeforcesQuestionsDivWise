//PetyaAndCountrySide
import java.io.*;
import java.util.*;
public class PetyaAndCountrySide{
	static int t,n;
	static StringBuilder ans=new StringBuilder();
	static int[] arr;
	public static long solve(){
		long max_value=0;
		if(n==1){return 1;}
		for(int i=0;i<n;i++){
			long water=0;
			int ptr1=i,ptr2=i;
			while(ptr1>0&&arr[ptr1-1]<=arr[ptr1]){ptr1--;}
			while(ptr2<n-1&&arr[ptr2]>=arr[ptr2+1]){ptr2++;}
			water=ptr2-ptr1+1;

			max_value=Math.max(max_value,water);
		}
		return max_value;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new
			FileReader("sampleinp.txt"));
    	// BufferedReader br = new BufferedReader( 
     //                         new InputStreamReader(System.in)); 

		n=Integer.parseInt(br.readLine());
		arr=new int[n];
		String str[]=br.readLine().split(" ");		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		}

		ans.append(solve()+"\n");		
	 	System.out.println(ans.toString());

	}
}
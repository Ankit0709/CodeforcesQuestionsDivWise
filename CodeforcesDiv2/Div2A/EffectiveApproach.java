//EffectiveApproach
import java.io.*;
import java.util.*;
public class EffectiveApproach{
static int t,n,q;
static int[] arr;
static ArrayList<Integer> queries=new ArrayList<>();
static int[] pos=new int[(int)1e5+3];
static StringBuilder ans=new StringBuilder();
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	long count1=0,count2=0;
	 	n=Integer.parseInt(br.readLine());
	 	arr=new int[n];
	 	String str[]=br.readLine().split(" ");
	 	for(int i=0;i<n;i++){
	 		arr[i]=Integer.parseInt(str[i]);
	 		pos[arr[i]]=i+1;
	 	}
	 	q=Integer.parseInt(br.readLine());
	 	str=br.readLine().split(" ");
	 	for(int i=0;i<q;i++){
	 		int num=Integer.parseInt(str[i]);
	 		count1+=pos[num];
	 		count2+=n-pos[num]+1;
	 	}
	 	ans.append(count1).append(" ").append(count2);
	 	
		 System.out.println(ans.toString());

    }
}
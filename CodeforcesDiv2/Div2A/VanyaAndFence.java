//VanyaAndFence
import java.io.*;
import java.util.*;
public class VanyaAndFence{
static long t,n,k;
static int[] arr;
static StringBuilder ans=new StringBuilder();
static long x(long n){
	return (n*(n+1))/2;
}
static long sum(long st,long end){
	if(st<=1)
		return x(end);
	return  x(end)-x(st-1);
}
static long minsplitters(){
	long st=1,end=k;
	while(st<end){
		long mid=(st+end)/2;
		long s=sum(mid,k);
		if(s==n){return k-mid+1;}
		if(st>n){st=mid+1;}
		else{end=mid;}
	}
	return k-st+2;
}
public static long solve(){
 	long pipes=0;
 	if(n==1){return 0;}
 	else if(n<=k){return 1;}
 	else{
 		--k;
 		--n;
 		return minsplitters();
 	}
 
	
}		
public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new
       FileReader("sampleinp.txt"));
    	// BufferedReader br = new BufferedReader( 
     //                         new InputStreamReader(System.in)); 
		 String str[]=br.readLine().split(" ");	
	 	n=Long.parseLong(str[0]);
	 	k=Long.parseLong(str[1]);	 
	 	ans.append(solve()+"\n");		
		
	 	System.out.println(ans.toString());

    }
}
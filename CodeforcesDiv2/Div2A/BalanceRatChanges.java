//BalanceRatChanges
import java.io.*;
import java.util.*;
public class BalanceRatChanges{
static int t,n,h;
static int[] arr;
static StringBuilder ans=new StringBuilder();
public static void  solve(){
   boolean flag=true;
   for(int i=0;i<n;i++){
   	
   	  if((Math.abs(arr[i])%2)==1){
   	  	if(flag){
   	  		ans.append((int)Math.ceil((double)arr[i]/2)+"\n");
   	  		flag=false;
   	  	}
   	  	else{
   	  		ans.append((int)Math.floor((double)arr[i]/2)+"\n");
   	  		flag=true;
   	  	}
   	  }
   	  else{
   	  	ans.append((int)Math.ceil((double)arr[i]/2)+"\n");
   	  }
   }
}		
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		
	 	n=Integer.parseInt(br.readLine());	 		
	 	arr=new int[n];	
	 	for(int i=0;i<n;i++){
	 		arr[i]=Integer.parseInt(br.readLine());
	 	}
	 	solve();				
	 	System.out.println(ans.toString());

    }
}
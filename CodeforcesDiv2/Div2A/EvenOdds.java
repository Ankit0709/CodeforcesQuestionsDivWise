//EvenOdds
//https://codeforces.com/problemset/problem/318/A

import java.io.*;
import java.util.*;
public class EvenOdds{
static long t,n,k;
static int[] arr;
static ArrayList<Integer> adj[];
static StringBuilder ans=new StringBuilder();
public static long solve(){
	boolean flag=true;
	k%=(n+1);
	if(n%2==1&&k>Math.ceil((float)n/2)){
		flag=false;
	}
	if(k>Math.ceil((float)n/2)){
		if(!flag){
			k--;
		}
		k-=n/2;
		return (2*k);
	}
	else{
		return (2*k-1);
	}

}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	t=1;
	 	while(t--!=0){
	 		String str[]=br.readLine().split(" ");
	 		n=Long.parseLong(str[0]);
	 		k=Long.parseLong(str[1]);
	 		ans.append(solve()+"\n");
	 	}	 	
		 System.out.println(ans.toString());

    }
}
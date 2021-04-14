//SumofDigits
import java.io.*;
import java.util.*;
public class SumofDigits{
static int t;
static String str;
static int[] arr;
static long n;
static long sum(long x){
	long sum=0;
	while(x>0){
		long rem=x%10;
		sum+=rem;
		x/=10;
	}
	return sum;
}
static long solve(){
	long count=1;
	if(str.length()==1){
		return 0;
	}
	for(int i=0;i<str.length();i++){
		n+=Integer.parseInt(str.charAt(i)+"");
	}
	while(n>9){
		count++;
		n=sum(n);
		
	}
	return count;
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	StringBuilder ans=new StringBuilder();
	 	str=br.readLine();
	 	ans.append(solve()+"\n");	 	
		System.out.println(ans.toString());

    }
}
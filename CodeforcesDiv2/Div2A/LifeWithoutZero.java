//LifeWithoutZero
import java.io.*;
import java.util.*;
public class LifeWithoutZero{
static int t,n,a,b;
static int[] arr;
static StringBuilder ans=new StringBuilder();
public static String solve(){
	int sum=a+b;
	String x=String.valueOf(sum);
	String x1=String.valueOf(a);
	String x2=String.valueOf(b);
	StringBuilder str1=new StringBuilder();
	StringBuilder str2=new StringBuilder();
	StringBuilder result=new StringBuilder();
	for(int i=0;i<x1.length();i++){
		if(x1.charAt(i)!='0'){str1.append(x1.charAt(i));}
	}
	for(int i=0;i<x2.length();i++){
		if(x2.charAt(i)!='0'){str2.append(x2.charAt(i));}
	}
	for(int i=0;i<x.length();i++){
		if(x.charAt(i)!='0'){result.append(x.charAt(i));}
	}
	
	if(Integer.parseInt(str1.toString())+Integer.parseInt(str2.toString())==Integer.parseInt(result.toString())){
		return "YES";
	}
	else{return "NO";}
	
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	a=Integer.parseInt(br.readLine());
	 	b=Integer.parseInt(br.readLine());
	 	ans.append(solve()+"\n");
		 System.out.println(ans.toString());

    }
}
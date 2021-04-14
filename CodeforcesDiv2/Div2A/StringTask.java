//StringTask
//https://codeforces.com/problemset/problem/118/A
import java.io.*;
import java.util.*;
public class StringTask{
static int t,n;
static int[] arr;
static String str;
static ArrayList<Integer> adj[];
static StringBuilder ans=new StringBuilder();
public static String solve(){
	StringBuilder x=new StringBuilder();
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a'||str.charAt(i)=='y'||str.charAt(i)=='i'||str.charAt(i)=='o'
			||str.charAt(i)=='u'||str.charAt(i)=='e'){
			continue;
		}
		x.append(".");
		x.append(str.charAt(i));
	}
	return x.toString();
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	t=1;
	 	while(t--!=0){
	 		str=br.readLine();
	 		ans.append(solve()+"\n");
	 	}	 	
		 System.out.println(ans.toString());

    }
}
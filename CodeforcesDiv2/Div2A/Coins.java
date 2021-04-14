//Coins
import java.io.*;
import java.util.*;
public class Coins{
static int t,n;
static int[] arr;
static ArrayList<String> list=new ArrayList<>();
static StringBuilder ans=new StringBuilder();
static void  solve(){
	int[] count=new int[3];
	for(int i=0;i<3;i++){
		String str=list.get(i);
		if(str.charAt(1)=='<'){count[str.charAt(2)-'A']++;}
		else{count[str.charAt(0)-'A']++;}
	}
	if(count[0]==1&&count[1]==1&&count[2]==1){
		ans.append("Impossible");
		return;
	}
	for(int i=0;i<3;i++){
		if(count[i]==0){ans.append((char)(i+65));}
	}
	for(int i=0;i<3;i++){
		if(count[i]==1){ans.append((char)(i+65));}
	}
	for(int i=0;i<3;i++){
		if(count[i]==2){ans.append((char)(i+65));}
	}

}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	   
	   for(int i=1;i<=3;i++){
	   		String str=br.readLine();
	   		list.add(str);
	    }
	    solve();
		System.out.println(ans.toString());

    }
}
//BurgularMatch
import java.io.*;
import java.util.*;
class Pair{
	int f,s;
	Pair(int x,int y){
		f=x;s=y;
	}
}
public class BurgularMatch{
	static int t,n,m,a,b;
	static StringBuilder ans=new StringBuilder();
	static int[] arr;
	static ArrayList<Pair> list;
	public static long solve(){
		Collections.sort(list,(p1,p2)->{return p2.s-p1.s;});
		long sticks=0;
		for(Pair rp:list){
			if(rp.f<=n){
				sticks+=rp.f*rp.s;
				n-=rp.f;
			}
			else{
				sticks+=n*rp.s;
				n=0;
				break;
			}
			
		}
		return sticks;

	}
	public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
		// 	FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		String str[]=br.readLine().split(" ");
		n=Integer.parseInt(str[0]);
		m=Integer.parseInt(str[1]);
		list=new ArrayList<>();
		for(int i=1;i<=m;i++){
			str=br.readLine().split(" ");
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
			list.add(new Pair(a,b));
		}
		ans.append(solve()+"\n");		
	 	System.out.println(ans.toString());

	}
}
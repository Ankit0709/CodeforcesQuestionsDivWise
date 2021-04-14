//VivekAndBirthdayCeleb
import java.io.*;
import java.util.*;
class Graph{
	int V;
	LinkedList<Integer> adj[];
	Graph(int v){
		V=v;
		adj=new LinkedList[v+1];
		for(int i=1;i<=v;i++){
			adj[i]=new LinkedList<>();
		}
	}
	void addEdge(int u,int v){
		adj[u].add(v);
	}
	int dfs(int node,boolean[] vis,int count){
		vis[node]=true;
		count++;
		for(Integer children:adj[node]){
			if(!vis[children]){
				count=dfs(children,vis,count);
			}
		}
		return count;
	}
	int friends(){
		int count=1005;
		boolean[] vis=new boolean[V+1];
		for(int i=1;i<=V;i++){
			count=Math.min(count,dfs(i,vis,0));
		}
		return count;
	}
}
public class VivekAndBirthdayCeleb{
static int n,d;
static int[] b=new int[10005];
public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new
       FileReader("sampleinp.txt"));
    	// BufferedReader br = new BufferedReader( 
       //                       new InputStreamReader(System.in)); 
	 	StringBuilder ans=new StringBuilder();
	 	String str[]=br.readLine().split(" ");
	 	n=Integer.parseInt(str[0]);
	 	Graph graph=new Graph(n);
	 	d=Integer.parseInt(str[1]);	 	
	 	for(int i=1;i<=d;i++){
	 		 str=br.readLine().split(" ");
	 		 graph.addEdge(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
	 	} 	
	 	ans.append(graph.friends()+"\n");
		 PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("sampleout.txt")));
        pw.write(ans.toString());
        pw.flush();
	 	System.out.println(ans.toString());

    }
}
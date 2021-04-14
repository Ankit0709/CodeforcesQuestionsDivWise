//GogB
import java.io.*;
import java.util.*;
public class GogB{
static int t,n,a,b,c,x;
static int[] arr;
static int[] heights;
static StringBuilder ans=new StringBuilder();
static void printBuilding(){
	for(int i=0;i<n;i++){ans.append(heights[i]+" ");}
		
}
public static void solve(){
	//base  case
	int a1=a,b1=b;
	int max_value=100,min_value=10;
	Arrays.fill(heights,1);
	if(n==a&&a==b&&a!=c){ans.append("IMPOSSIBLE");return;}
	if(a==b&&a==c){ans.append("IMPOSSIBLE");return;}
	if(((a+b)-n)>c){ans.append("IMPOSSIBLE");return;}
	if(a<b){
		int i=n-1;
		int indx1=-1,indx2=-1;
		//right side  higher higher so that we can see buildings from
		//right side
		while(i>=0&&b--!=1){
			heights[i]=min_value;
			min_value++;
			i--;
		}
		indx2=i+2;
		i=0;
		//we can see buildings from left side
		while(i<n&&a--!=0){
			heights[i]=min_value;
			min_value++;
			i++;
		}
		indx1=1;
		if(i<n-b1){
			int l1=i+2;
			while(a1-2!=0){
				heights[l1]=heights[l1-1];
				l1++;
				a1--;
				c--;
			}
		}
		//common right way
		int common=c;
		while(common-->1){
			heights[indx2]=heights[indx2-1];
			indx2++;
			heights[indx1]=1;
			indx1++;
		}
		// while(heights[i]==1){i++;}
		// heights[i]=1;
		printBuilding();
		

	}
	else{
		int i=0;
		min_value=10;
		int indx1=-1,indx2=-1;
		//right side  higher higher so that we can see buildings from
		//right side
		while(i<n&&a--!=1){
			heights[i]=min_value;
			min_value++;
			i++;
		}
		indx1=1;

		i=n-1;
		while(i>=0&&b--!=0){
			heights[i]=min_value;
			min_value++;
			i--;
		}
		if(i+2<a1){
			int l1=i+2;
			while(a1-2!=0){
				heights[l1]=heights[l1-1];
				l1++;
				a1--;
				c--;
			}
		}
		indx2=i+2;

		int common=c;

		while(common-->1){
			heights[indx2]=heights[indx2-1];
			indx2++;
			heights[indx1]=1;
			indx1++;
		}
		
		//we can see buildings from left side
		
		// while(heights[i]==1){i--;}
		// heights[i]=1;
		printBuilding();
		

	}


}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	t=Integer.parseInt(br.readLine());
	 	x=1;
	 	while(t--!=0){
		 	String str[]=br.readLine().split(" ");
		 	n=Integer.parseInt(str[0]);
		 	a=Integer.parseInt(str[1]);	
		 	b=Integer.parseInt(str[2]);
		 	c=Integer.parseInt(str[3]);	 	
		 	heights=new int[n];
		 	solve();
		 	
	 		// ans.append("Case #"+x+": "+solve());
		 		x++;
		 		if(t!=0){ans.append("\n");}		
	 	}	 	
		 System.out.println(ans.toString());

    }
}
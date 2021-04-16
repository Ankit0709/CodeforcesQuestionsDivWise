import java.io.*;
import java.util.*;
public class BankRequest{
static int t,n;
static int[] arr;
static ArrayList<Integer> adj[];
static StringBuilder ans=new StringBuilder();
public static int[] bankRequests(int[] balances ,String[] requests){	
	int i=1;
	for(String req : requests){
		String str[]=req.split(" ");
		int account =  Integer.parseInt(str[1])-1;
		if(str[0].equals("deposit")){
			balances[account]+=Integer.parseInt(str[2]);
			
		}
		else if(str[0].equals("withdraw")){
			if(balances[account]>=Integer.parseInt(str[2])){
				balances[account]-=Integer.parseInt(str[2]);
			}
			else{
				return new int[i*-1];
			}
		}
		else{
			if(balances[account]>=Integer.parseInt(str[3])){
				balances[account]-=Integer.parseInt(str[3]);
				balances[Integer.parseInt(str[2])-1]+=Integer.parseInt(str[3]);
			}
			else{
				return new int[i*-1];
			}
		}
		i++;
	}
	return balances;

}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	
	 	t=1;
	 	while(t--!=0){
	 		int[] balances ={10,100,20,50,30};
	 		String[] req = {"withdraw 2 10","tranfer 5 1 20","deposit 5 20","transfer 3 4 15"};
	 		int[] ans=bankRequests(balances,req);
	 		for(int i=0;i<ans.length;i++){
	 			System.out.print(ans[i]+" ");
	 		}
	 	}	 	
		 System.out.println(ans.toString());

    }
}
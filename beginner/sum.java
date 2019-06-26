import java.util.*;
public class sum
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    try{
		int x=sc.nextInt();
	    	if(x==0){
			System.out.println("0");    
	    	}else if(x<0){
	    		System.out.println("Negative");    
	    	}else{
		        System.out.println("Positive");
			}
		}
		catch(Exception e){

		}
	}
}

import java.util.*;
public class oddeven
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    try{
		int x=sc.nextInt();
	    	if(x>=0){
                if(x%2==0)
                    System.out.println("Even");    
                else
    	    		System.out.println("Odd");    
	    	}else {
	    		System.out.println("invalid");    
	    	}
		}
		catch(Exception e){

		}
		finally{
            sc.close();
        }
	}
}

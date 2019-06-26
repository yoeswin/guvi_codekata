import java.util.*;
public class MaxNumFormed
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    try{
        int x=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(); 
	    	if(x>=0){
                for(int temp = 0;temp<x;temp++){
                    list.add(sc.nextInt());
                }
            list.sort(null);
            Collections.reverse(list);

            long finalVal=0;
            for(int temp:list){
                finalVal *=10;
                finalVal+=temp;
            }
            System.out.print(finalVal);
	    	}
		}
		catch(Exception e){

		}
		finally{
            sc.close();
        }
	}
}

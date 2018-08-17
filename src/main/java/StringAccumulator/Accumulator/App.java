package StringAccumulator.Accumulator;
import java.util.*;

/**
 * @author Gaurav
 *
 */
class App
{
private static String VALID_DELIMITER = "[.,$|+:\']";
  public static void main(String args[])
  {
	  
	  System.out.println("Enter the value:");
	  Scanner scanner = new Scanner(System.in);
	  String input = scanner.nextLine();
   System.out.println("input:"+input);
  
   //"1,2|3.4$5"
	    String[] split = input.split(VALID_DELIMITER);
	    List<String> values = new ArrayList<String>();
	      for(String data: split) {
	         if(data != null && data.length()>0) {
	            values.add(data);
	         }
	      }
	      String[] target = values.toArray(new String[values.size()]);
	  System.out.println("Sum of entered number is : "+add(target));  
	}
private static int add(String[] target) {
	int sum=0;
	if( target.length<3)
	{
		
		
	for(int i=0; i < target.length; i++){
		System.out.println(target[i]);
		 try
		    {
		      int j = Integer.parseInt(target[i].trim());
		      if(j<0) {
			  System.out.println("negative  Number not allow to add: " );
			  break;
		      }
		   
		      if(j<1000)
		      sum+=j;
		    }
		    catch (NumberFormatException nfe)
		    {
		      System.out.println("NumberFormatException: " + nfe.getMessage());
		    }
		 }
	}
	else
		System.out.println("More that 2 number in input" );
	return sum;
}

}
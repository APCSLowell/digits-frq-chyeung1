import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	   String bruh = num.toString();
	   for(int i = 0; i < bruh.length; i++){
		digitList.add(bruh.chartAt(i));
	   }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
	 int comp = 0;
	for(int i = 0; i < digitList.size(); i++){
	if(comp < digitList.get(i))
	comp = digitList.get(i);
	else if (comp >= digitList.get(i))
	return false;
	}
	return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}

import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	digitList = new ArrayList<Integer)();
	 if(num == 0)
	 digitList.add(new Intger(0));
	 while(num > 0){
		digitList.add(0, new Integer(num % 10));
		num /= 10;
	 }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
	 int comp = 0;
	for(int i = 0; i < digitList.size(); i++){
	if(comp < digitList.get(i).intValue())
	comp = digitList.get(i).intValue();
	else if (comp >= digitList.get(i).intValue())
	return false;
	}
	return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}

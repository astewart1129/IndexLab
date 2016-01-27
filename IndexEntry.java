import java.util.ArrayList;


public class IndexEntry {
	
	private String  word;
	private ArrayList<Integer> numsList;
	
	public IndexEntry(String w)
	{
		word = w.toUpperCase();
		numsList = new ArrayList<Integer>();
	}
	
	public void add(int num)
	{
		if (numsList.contains(num))
		{
			numsList.add(num);
		}
		
	}
	
	public String getWord()
	{
		return word;
	}
	
	public String toString()
	{
		return "";
	}

}

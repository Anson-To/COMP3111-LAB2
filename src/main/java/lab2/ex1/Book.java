package lab2.ex1;

public class Book 
{
	private String chapters[];
	private static final int DEFAULT_CHAPTERS=10;
	
	public Book() 
	{
		chapters= new String[DEFAULT_CHAPTERS];
		for (int i=0;i<chapters.length;i++) 
		{
			chapters[i]="Chapter"+i;
			//System.out.println(chapters[i]+i);
		}
	}
	public Book(String argument[]) 
	{
		//hea version
		chapters=new String[argument.length];
		for(int i=0;i<argument.length;i++) 
		{
			chapters[i]=argument[i];
			//System.out.println(argument[i]+i);
		}
	}
	
	public String getChapter(int i) 
	{
		if(i>=chapters.length||i<0) 
		{
			return"invalid chapter";
		}
		return chapters[i];          
	}
	
	public String[]getChapters()
	{
		return chapters;
	}

}

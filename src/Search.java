import java.util.*;
import java.io.*;
public class Search 
{
	Scanner in=new Scanner(System.in);
	public void search() throws IOException
	{
		System.out.println("Enter the word to be searched in the dictionary");
		String str=new String();
		str=in.nextLine();
		boolean flag=false;
		BufferedReader br=new BufferedReader(new FileReader("C:/word.txt"));
		BufferedReader br1=new BufferedReader(new FileReader("C:/meaning.txt"));
		String line;
		int i=0;
		while((line=br.readLine())!=null)
		{
			i++;
			if(line.equalsIgnoreCase(str))
			{
				flag=true;
				int c=0;
				while(c!=i)
				{
					line=br1.readLine();
					c++;
				}
				System.out.println(line);
			}
		}
		if(flag==false)
		{
			System.out.println("Word not found");
		}
	}
}

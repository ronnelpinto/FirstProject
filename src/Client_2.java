import java.io.IOException;
import java.util.*;
public class Client
{
	public static void main(String[]args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		Insertion ins=new Insertion();
		Search find=new Search();
		while(true)
		{
		System.out.println("Availabe Options : \n1 : Insert\n2 : Search\n3 : Exit");
		int ch=in.nextInt();
		switch(ch)
		{
		case 1: ins.insert();
				break;
		case 2: find.search();
				break;
		case 3: ins.on_exit();
			    System.exit(0);
		}
		}
	}
}

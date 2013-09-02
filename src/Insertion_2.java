import java.io.*;
import java.util.*;


public class Insertion {
	public  void insert()throws IOException
	{
		Scanner in=new Scanner(System.in);  
		//Writer output = null;
		//Writer output1=null;
		String word="";
		String meaning="";
		TreeInsertion ti=new TreeInsertion();
		  File file = new File("C:/word.txt");
		  File file1=new File("C:/meaning.txt");
		  BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
		  BufferedWriter output1 = new BufferedWriter(new FileWriter(file1,true));
		  while(!(word.equalsIgnoreCase("quit")))
		  {
		  System.out.println("Enter a word with its meaning");
		  word=in.nextLine();
		
		  if(!(word.equalsIgnoreCase("quit")))
		  {
		   output.write(word);
		   output.newLine();
		  meaning=in.nextLine();
		  output1.write(meaning);
		  output1.newLine();
		  
		  }
         }
		  output.close();
		  output1.close();
		    
	        FileInputStream fstream = new FileInputStream(file);
	        FileInputStream fstream1 = new FileInputStream(file1);  
	        DataInputStream in2 = new DataInputStream(fstream);
	        DataInputStream in1 = new DataInputStream(fstream1);  
	        BufferedReader br = new BufferedReader(new InputStreamReader(in2));
	        BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
	        String str;
	        String str1;
		      while ((str = br.readLine()) != null && (str1 = br1.readLine()) != null) {
		        ti.insert(str,str1);
		      }      
		      	in2.close();
		      	in1.close();
		      	
		      ti.inorder(ti.get_root());
}
	public void on_exit()throws IOException
	{
	    BufferedWriter br=new BufferedWriter(new FileWriter("C:/word.txt"));
	    BufferedWriter br1=new BufferedWriter(new FileWriter("C:/meaning.txt"));
	    br.write("");
	    br1.write("");
	}

}

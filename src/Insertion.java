import java.io.*;
import java.util.*;


public class Insertion {
	public  void insert()throws IOException
	{
		Scanner in=new Scanner(System.in);  
		String word, meaning;
		TreeInsertion ti=new TreeInsertion();
		  BufferedWriter output = new BufferedWriter(new FileWriter("C:/word.txt"));
		  BufferedWriter output1 = new BufferedWriter(new FileWriter("C:/meaning.txt"));
		  while(!(word.equalsIgnoreCase("quit")))
		  {
		  	System.out.println("Enter a word with its meaning");
		  	word=in.nextLine();
		  	output.append(word);
		  	output.newLine();
		  	if(!(word.equalsIgnoreCase("quit")))
		  	{
		  		meaning=in.nextLine();
		  		output1.append(meaning);
		  		output1.newLine();
		  	}
		  }
		  
		  output.close();
		  output1.close();
		        	
	        
	        FileInputStream fstream = new FileInputStream("C:/word.txt");
	        FileInputStream fstream1 = new FileInputStream("C:/meaning.txt");  
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

}

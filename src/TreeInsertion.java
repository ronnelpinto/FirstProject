public class TreeInsertion {
	private TNode root=null;
	 
	 TNode create(String key,String meaning)
	 {
	    
	     TNode tnode=new TNode(key,meaning);
	     return tnode;
	     
	 }
	 public void insert(String str,String str1)
	 {
	     TNode tnode=create(str,str1);
	     boolean flag=true;
	     if(root==null)
	     {
	         root=tnode;	              
	     }
	     else
	     {
	         TNode temp=root;
	         while(flag)
	         {
	            if(tnode.word.compareTo(temp.word)<=0)
	            {
	                if(temp.left==null)
	                {
	                    temp.left=tnode;
	                    flag=false;
	                }
	                else
	                    temp=temp.left;
	            }
	            else
	            {
	                if(temp.right==null)
	                {
	                    temp.right=tnode;
	                    flag=false;
	                }
	                else
	                    temp=temp.right;
	            }
	          }
	     }
	 }
	 
	 public void inorder(TNode root)
	 {
	     if(root!=null)
	     {
	         inorder(root.left);
	         System.out.println(root.word + "---->"+root.info+"\n");
	         inorder(root.right);
	     }
	 }
	 
	 public TNode get_root()
	 {
	     return root;
	 }
	 
}


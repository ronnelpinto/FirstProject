
public class Deletion 
{
	public TNode delete_item( String item, TNode root )
	{
	        TNode cur;
	        TNode parent;
	        TNode suc;
	        TNode q;

	        if ( root == null )
	        {
	                System.out.println( "Tree is empty!" );
	                return root;
	        }

	        //obtain the position of the node to be deleted and its parent
	        parent = null;
	        cur = root;

	        while ( cur != null && item.equalsIgnoreCase(cur.info) )
	        {
	                parent = cur;
	                cur =  ( item.compareTo(cur.info)<0 ) ? cur.left : cur.right;
	        }

	        if ( cur == null )
	        {
	                System.out.println( "Item not found" );
	                return root;
	        }

	        if ( cur.left == null )          //if left subtree is empty
	                q = cur.right;         //obtain the address of non empty right subtree
	        else if ( cur.right == null )     //if subtree is empty
	                q = cur.left;         //obtain the address of non empty left subtree
	        else
	        {
	                                                //obtain the inorder successor
	                suc = cur.right;               //inorder successor lies towards right

	                while ( suc.left != null )       //and immediately keep traversing left
	                {
	                        suc = suc.left;
	                }

	                suc.left = cur.left;        //attach left node to be deleted to left
	                                                //of successor of the node to be deleted
	                q = cur.right;         //right subtree is obtained
	        }

	        if ( parent == null )      //parent does not exist return q itself as the root
	                return q;

	        //connecting parent of the node to be deleted to q
	        if ( cur == parent.left )
	                parent.left = q;
	        else
	                parent.right = q;

	        return root;
	}

}

// Tree Node class.
public class TNode
{
    String word;
    String info;
    TNode left;
    TNode right;
    
    TNode(String word,String meaning)
    {
        this.word=word;
        this.info=meaning;
        this.left=null;
        this.right=null;
    }
}

// Convert BST to doubly linked list(sorted)

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/
// This function should convert a given Binary tree to Doubly
// Linked List
// root --> Root of Binary Tree
// head --> head of created doubly linked list
class GfG
{
    Node head = new Node(100);
    Node temp = head;
    Node BToDLL(Node root)
    {
        get_list(root);  
        Node node = head.right;
        node.left = null;
	    return node;
    }
    void get_list(Node root)
    {
        if(root == null)
            return;
        else
        {
            get_list(root.left);
            Node temp1 = new Node(root.data);
            temp.right = temp1;
            temp1.left = temp;
            temp = temp.right;
            get_list(root.right);
        }
    }
}

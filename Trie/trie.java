package Trie;

import java.util.HashMap;

public class trie 
{
    private class Node
    {
        char data;
        HashMap<Character,Node> children;
        boolean isterminal;
        Node(char data, boolean isterminal)
        {   
            this.children=new HashMap<>();
            this.data=data;
            this.isterminal=isterminal;
        }
    }
    private int numWords;
    private Node root;
    trie()
    {
        this.root=new Node('\0',false);
        this.numWords=0;
    }
    public int numWords()
    {
        return this.numWords;
    }
    public void addWord(String word)
    {
        this.addWord(this.root, word);
    }
    private void addWord(Node parent, String word)
    {
    char cc=word.charAt(0);
    String ros=word.substring(1);

    }
    
     
    
}

package Hashmap;

public class hashtable<K,V> 
{
    private class HTPair
    {
        K key;
        V value;
        HTPair(K key, V value)
        {
            this.key=key;
            this.value=value; 
        }

        public boolean equals(Object other)
        {
            HTPair op=(HTPair) other;
            return this.key.equals(op.key); // checking if keys are same 

        } 
        public String toString()
        {
            return "{"+this.key+"-"+this.value; 
        }

    }
    public static final int DEFAULT_CAPACITY=10;


    private llgeneric<HTPair>[] bucketArray;
    private int size;
    public hashtable()
    {
        this(DEFAULT_CAPACITY);
    }
    public hashtable(int capacity)
    {
        this.bucketArray=(llgeneric<HTPair>[])new llgeneric[capacity];
        this.size=0;
    }
    public void put(K key,V value)
    {
         
    }
    
}

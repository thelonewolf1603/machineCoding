package lru_cache;

public class Node<K> {
    private Node<K> next;
    private Node<K> prev;
    private K key;

    public Node(K data)
    {
        this.key = data;
        this.prev = null;
        this.next = null;
    }

    public void addNext(Node<K> node)
    {
        this.next = node;
    }

    public void addPrev(Node<K> node)
    {
        this.prev = node;
    }

    public Node<K> getNext() {return this.next;}
    public Node<K> getPrev() {return this.prev;}

    public K getKey()
    {
        return this.key;
    }
    
}

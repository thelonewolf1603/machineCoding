package lru_cache;

import java.util.HashMap;

public class LruCache<K, V> {
    private HashMap<K, V> hashMap;
    Node<K> head;
    private int maxSize, currSize;


    public LruCache(int sz)
    {
        maxSize = Math.max(sz, 0);
        currSize = 0;
        head = null;
        hashMap = new HashMap<>();
    }

    public Node<K> search(K key)
    {
        Node<K> iter = head;
        while(iter != null)
        {
            if(iter.getKey() == key) return iter;
            iter = iter.getNext();
        }
        return null;
    }

    private void remove(Node<K> node)
    {
        if(node == null) return;
        else currSize --;

        Node<K> prev = node.getPrev();
        Node<K> next = node.getNext();
        if(prev == null) {head = next;}
        else {prev.addNext(next);}
        if(next != null) {next.addPrev(prev);}

        System.out.println(node.getKey() + " evicted from cache");
    }

    private void addToFront(Node<K> node)
    {
        if(head == null)
        {
            head = node;
        }
        else 
        {
            node.addNext(head);
            head.addPrev(node);
            head = node;
        }
        System.out.println(node.getKey() + " added to cache");
        currSize ++;
    }

    private void moveToHead(Node<K> node)
    {
        if(node != null)
        {
            remove(node);
            addToFront(node);
        }
    }

    private Node<K> getTail()
    {
        Node<K> iter = head;
        while(iter != null)
        {
            if(iter.getNext() == null) return iter;
            iter = iter.getNext();
        }
        return null;
    }

    public void put(K key, V value)
    {
        Node<K> node = search(key);
        moveToHead(node);

        if(node == null)
        {
            if(currSize >= maxSize)
            {
                Node<K> tail = getTail();
                remove(tail);
                hashMap.remove(tail.getKey());
            }
            addToFront(new Node<>(key));
        }
        hashMap.put(key, value);
    }

    public V get(K key)
    {
        Node<K> node = search(key);
        moveToHead(node);
        return hashMap.get(key);
    }
    
    public boolean isEmpty()
    {
        return currSize == 0;
    }

    public boolean full()
    {
        return currSize == maxSize;
    }
}

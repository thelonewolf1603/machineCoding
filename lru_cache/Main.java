package lru_cache;

public class Main {
    public static void main(String args[])
    {
        System.out.println("demo for lru cache");
        LruCache<String, Integer> cache = new LruCache<>(5);

        cache.put("tatai", 20);
        cache.put("ram", 10);
        cache.put("shyam", 11);
        cache.put("mohan", 12);
        cache.put("geeta", 13);
        cache.put("neeladri", 23);
        cache.put("ram", 100);
        cache.put("alex", 1);

        System.out.println(cache.get("neeladri"));
        System.out.println(cache.get("ram"));
        System.out.println(cache.get("shyam"));
        System.out.println(cache.get("mohan"));
        System.out.println(cache.get("geeta"));
    }
}

package ua.netrebenko.hw15;

import java.util.*;

/**
 * 1. Создать хотя бы по одному экземпляру класса (ArrayList, HashMap и тд)
 * основных интерфейсов коллекций (List, Set, Queue, Deque и Map).
 * 2. В каждый экземпляр коллекции добавить несколько элементов, вывести все элементы в консоль,
 * удалить все элементы из коллекции (не используя метод clear()).
 */
public class Main {
    public static void main(String[] args) {
        User[] users = {new User("Ivan"), new User("Someone")};
        List<User> userList = Arrays.asList(users);
        User anybody = new User("Anybody");

        // HashSet
        HashSet<User> hashSet = new HashSet<>(userList);
        hashSet.add(anybody);
        System.out.println("HashSet: " + hashSet.toString());

        Object[] users1 = hashSet.toArray();
        hashSet.removeAll(Arrays.asList(users1));
        System.out.println("HashSet: " + hashSet.toString());

        // ArrayList
        ArrayList<User> userArrayList = new ArrayList<>(userList);
        userArrayList.add(anybody);
        System.out.println("ArrayList: " + userArrayList.toString());

        while (userArrayList.size() > 0) {
            userArrayList.remove(0);
        }
        System.out.println("ArrayList: " + userArrayList);

        // HashMap
        HashMap<String, User> hashMap = new HashMap<>();
        hashMap.put("Ivan", new User("Ivan"));
        hashMap.put("Someone", new User("Someone"));
        System.out.println("HashMap: " + hashMap.toString());

        Object[] hashMapKeys = hashMap.keySet().toArray();
        for (Object key : hashMapKeys) {
            hashMap.remove(key);
        }
        System.out.println("HashMap: " + hashMap.toString());

        // ArrayDeque
        ArrayDeque<User> arrayDeque = new ArrayDeque<>(userList);
        arrayDeque.addFirst(new User("First"));
        arrayDeque.addLast(new User("Last"));
        System.out.println("ArrayDeque: " + arrayDeque.toString());

        while (arrayDeque.size() > 0) {
            arrayDeque.pollFirst();
        }
        System.out.println("ArrayDeque: " + arrayDeque.toString());

        // Queue
        Queue<User> queue = new PriorityQueue<>(userList);
        queue.offer(new User("Offered"));
        queue.add(new User("Added"));
        System.out.println("PriorityQueue: " + queue.toString());

        while (queue.size() > 0) {
            queue.poll();
        }
        System.out.println("PriorityQueue: " + queue.toString());

        // TreeMap
        TreeMap<String, User> treeMap = new TreeMap<>();
        treeMap.put("Ivan", new User("Ivan"));
        treeMap.put("Someone", new User("Someone"));
        System.out.println("TreeMap: " + treeMap);

        Object[] treeMapKeys = treeMap.keySet().toArray();
        for (Object key : treeMapKeys) {
            treeMap.remove(key);
        }
        System.out.println("TreeMap: " + treeMap);
    }
}

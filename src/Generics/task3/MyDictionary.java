package Generics.task3;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MyDictionary<T,T1>{
   Map<T,T1> map = new HashMap<>();
   public int length(){
       return map.size();
   }

    public void add(T key,T1 value){
       map.put(key,value);
    }
     public T1 getKey(T key){
       return map.get(key);
     }
     public Map<T,T1> getAll(){
         return map;
     }

    public static void main(String[] args) {
        MyDictionary<String,Integer> map = new MyDictionary<>();
        map.add("one",1);
        map.add("two",2);
        System.out.println("Length :" +map.length());
        System.out.println("Key of 1st element :"+map.getKey("one"));
        System.out.println("All elements :"+map.getAll());
        System.out.println(map);


    }
}

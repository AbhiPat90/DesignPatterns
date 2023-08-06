package src.PrototypeDesignPatternAndRegistry;

import java.util.HashMap;

public class StudentRegistry {

   private HashMap<String, Student> registry = new HashMap<>();

   public void register(String key, Student student){
       registry.put(key, student);
   }

   public Student getRegistry(String key){
       return registry.get(key);
   }
}

import java.util.*;

public class s5 {
    public static void main(String[] args) {
//        HashMap<String,String> hashMap = new HashMap<>();
//        hashMap.put("ноль","one");
//        hashMap.putIfAbsent("один","первый");
//        hashMap.put("два","второй");
//        hashMap.putIfAbsent("4","четверка");
//        hashMap.containsKey("1");
////        System.out.println(hashMap.containsKey("1"));
//
//        Set<String> keySet = hashMap.keySet();
//        Collection<String> sValues=hashMap.values();
//        Set<Map.Entry<String,String>> eSet= hashMap.entrySet();

//        for (int i = 0; i <keySet.size() ; i++) {
//            System.out.println(hashMap.get(keySet.toArray()[i]));
//        if ( ((String)keySet.toArray()[i]).length() > 3 && hashMap.get(keySet.toArray()[i]).contains("n")){
//            hashMap.remove(keySet.toArray()[i]);
//        }

//
//        for (String value: hashMap.keySet()) {
//            System.out.println(value);
//        }

//        Iterator<String> iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()){
//            String value= iterator.next();
//            System.out.println(value);
//            if (value.equals("4")) iterator.remove();
//        }

//        hashMap.forEach((k,v)-> System.out.println(k+" "+v));
//
//        hashMap.compute((String)keySet.toArray()[0],(k,v)->v=v.toLowerCase());
//        hashMap.computeIfAbsent((String)keySet.toArray()[0],(k , v)->v+"");

//        hashMap.remove("4");
//        hashMap.remove(keySet.toArray()[0]);

//        LinkedHashMap<String,String>linkedHashMap=new LinkedHashMap<>();
//        linkedHashMap.put("ноль","one");
//        linkedHashMap.putIfAbsent("один","первый");
//        linkedHashMap.put("два","второй");
//        linkedHashMap.putIfAbsent("4","четверка");
//        linkedHashMap.forEach((k,v)-> System.out.println(k+" "+v));

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(0,"zero");
        treeMap.put(1,"one");
        treeMap.put(4,"four");
        treeMap.put(3,"three");
        treeMap.put(2,"two");
        treeMap.forEach((k,v)-> System.out.println(k+" "+v));
    }
}

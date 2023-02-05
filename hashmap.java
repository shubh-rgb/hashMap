import java.util.HashMap;
import java.util.Map;

import javax.lang.model.util.ElementScanner6;

public class hashmap {
    
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        
        //insertion
        map.put("India", 140);
        map.put("china", 140);
        map.put("US", 35);

        System.out.println(map);
        map.put("USA", 350);
        System.out.println(map);

        if(map.containsKey("ussr")){
            System.out.println("present");}
            else{
            System.out.println("not present");}
            System.out.println(map.get("usa"));
            System.out.println(map.get("USA"));

            int arr[] = {12,13,14};
                for(int i=0;i<3;i++){
                    System.out.print(arr[i]+" ");
                }System.out.println();
                for(int val : arr){
                    System.out.print(val + " ");
                } System.out.println();

                for( Map.Entry<String, Integer> e : map.entrySet()){
                    System.out.println(e.getKey());
                    System.out.print(e.getValue());
                }

                //     Set<String> key = map.keySet();
                //     for(String k : key){ 
                //     System.out.print(k + " " + map.get(k));
                // }

                map.remove("china");
                System.out.println(map);
    }
        
}


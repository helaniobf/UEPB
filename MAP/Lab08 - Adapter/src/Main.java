import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "tres");
        MapAdapter<Integer, String> mapAdaptado = new MapAdapter<Integer, String>(map);
    
        List<String> values = new ArrayList<>();
        values.add("um");
        values.add("dois");
        values.add("tres");
        List<Integer> keys = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        ListAdapter<Integer, String> listAdaptado = new ListAdapter<>(keys, values);

        System.out.println("--------------Map--------------");
        ////////////////////////////Map adaptando List//////////////////////////

        System.out.println("Contains: "+ mapAdaptado.contains("um"));
        System.out.println("Equals: " + mapAdaptado.equals(values));
        System.out.println("Get: " + mapAdaptado.get(2));
        System.out.println("isEmpty(F): " + mapAdaptado.isEmpty());
        
        Iterator<String> iterator = mapAdaptado.iterator();
        System.out.println("Iterator: ");
        while (iterator.hasNext()) {
            String numero = iterator.next();
            System.out.println(numero);
        }

        mapAdaptado.remove(1);
        System.out.println("Size: " + mapAdaptado.size());
        System.out.println("ToArray: " + mapAdaptado.toArray());
        mapAdaptado.clear();
        System.out.println("IsEmpty(T): " + mapAdaptado.isEmpty());
        //mapAdaptado.add("teste");

        System.out.println("");
        System.out.println("--------------List--------------");
        ////////////////////////////List adaptando Map//////////////////////////

        System.out.println("ContainsKey: " + listAdaptado.containsKey(2));
        System.out.println("ContainsValue(T): " + listAdaptado.containsValue("tres"));
        System.out.println("ContainsValue(F): " + listAdaptado.containsValue("quatro"));
        //System.out.println("Equals: " + listAdaptado.equals(map));
        System.out.println("IsEmpty(F): " + listAdaptado.isEmpty());
        //System.out.println("Put: " + listAdaptado.put(4, "quatro"));
        System.out.println("Remove: " + listAdaptado.remove(2));
        System.out.println("Remove: " + listAdaptado.remove(3, "tres"));
        System.out.println("Size: " + listAdaptado.size());
        System.out.println("Get: " + listAdaptado.get(1));
        System.out.println("Values: " + listAdaptado.values());

    }
}

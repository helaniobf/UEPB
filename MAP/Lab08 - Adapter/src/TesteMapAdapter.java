import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class TesteMapAdapter {

    HashMap<Integer, String> map = new HashMap<>();
    MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

    @Test(expected = UnsupportedOperationException.class)
    public void TestAdd(){
        var a = "a";
        mapaAdaptado.add(a);
    }

    @Test
    public void TestClear(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

        mapaAdaptado.clear();
        assertTrue(mapaAdaptado.isEmpty());
    }

    @Test
    public void TestContains(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

        assertTrue(mapaAdaptado.contains("a"));
    }

    @Test
    public void TestEquals(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);
        List<String> lista = new ArrayList<>();
        lista.add("a"); 
        assertTrue(mapaAdaptado.equals(lista));
    }

    @Test
    public void Testget(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

        assertEquals(mapaAdaptado.get(0), "a");
    }

    @Test
    public void TestIsEmpty(){
        HashMap<Integer, String> map = new HashMap<>();
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

        assertTrue(mapaAdaptado.isEmpty());
    }

    @Test
    public void TestIterator(){
        HashMap<Integer, String> map = new HashMap<>();
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

        assertNotNull(mapaAdaptado.iterator());
    }

    @Test
    public void TestRemove(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);
        mapaAdaptado.remove(0);

        assertFalse(mapaAdaptado.contains("a"));
    }

    @Test
    public void TestSize(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);

        assertEquals(mapaAdaptado.size(), 1);
    }

    @Test
    public void TestToArray(){
        HashMap<Integer, String> map = new HashMap<>();
        MapAdapter<Integer, String> mapaAdaptado = new MapAdapter<Integer, String>(map);
        
        assertNotNull(mapaAdaptado.toArray());
    }

}

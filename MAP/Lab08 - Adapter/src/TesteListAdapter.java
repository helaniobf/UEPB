import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TesteListAdapter {

    private ListAdapter<Integer, String> listAdaptado;
    private ListAdapter<Integer, String> listAdaptadoVazia;

    @BeforeEach
    public void setUp(){
        List<String> values = new ArrayList<>();
        values.add("um");
        values.add("dois");
        values.add("tres");
        List<Integer> keys = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        listAdaptado = new ListAdapter<>(keys, values);
        List<String> valuesVazia = new ArrayList<>();
        List<Integer> keysVazia = new ArrayList<>();
        listAdaptadoVazia = new ListAdapter<>(keysVazia, valuesVazia);
    }
    
    @Test
    public void TestContainsKey(){
        setUp();
        assertTrue(listAdaptado.containsKey(2));
    }

    @Test
    public void TestContainsValue(){
        setUp();
        assertTrue(listAdaptado.containsValue("dois"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void TestEquals(){
        List<Integer> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        ListAdapter<Integer, String> listAdaptado = new ListAdapter<>(keys, values);

        HashMap<Integer, String> map = new HashMap<>();

        listAdaptado.equals(map);
    }

    @Test
    public void TestIsEmpty(){
        setUp();
        assertTrue(listAdaptadoVazia.isEmpty());
    }

    @Test
    public void TestPut(){
        setUp();   
        listAdaptado.put(4, "quatro");
        assertTrue( listAdaptado.containsKey(4) && listAdaptado.containsValue("quatro") );
    }

    @Test
    public void TestRemove(){
        setUp();
        assertEquals(listAdaptado.remove(1), "um");
    }

    @Test
    public void TestSize(){
        setUp();
        assertEquals(listAdaptado.size(), 3);
    }

    @Test
    public void TestGet(){
        setUp();
        assertEquals(listAdaptado.get(1), "um");
    }

    @Test
    public void TestValues(){
        setUp();
        assertNotNull(listAdaptado.values());
    }

}

import java.util.*;

public class ListAdapter<K, V> implements Map<K, V>{
    
    private final List<K> keys;
    private final List<V> values;

    public ListAdapter(List<K> keys, List<V> values) {
        this.keys = keys;
        this.values = values;
    }

    @Override
    public void clear() {
        keys.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        if(this.keys.contains(key)){
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return values.contains(value);
    }

    //falta
    @Override
    public boolean equals(Object objeto){
        
        /*
        LinkedHashMap<K, V> mapaOrdenado = (LinkedHashMap<K, V>) objeto;
        ArrayList<K> keysMapaOrdenado = new ArrayList<>(mapaOrdenado.keySet());
        ArrayList<V> valuesMapaOrdenado = new ArrayList<>(mapaOrdenado.values());

        if(this.keys.equals(keysMapaOrdenado) && this.values.equals(valuesMapaOrdenado)){
            return true;
        }
        */
        
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        if(keys.isEmpty() && values.isEmpty() ){
            return true;
        }
        return false;
    }

    @Override
    public V put(K key, V value) {
        if(key != null){

        }
        keys.add(key);
        values.add(value);
        return value;
    }

    @Override
    public boolean remove(Object key, Object value) {
        int index = keys.indexOf(key); //indexOf retorna o indice da key se existir ou -1 se o indice nao estiver na lista
        if (index != -1 && values.get(index).equals(value)) {
            keys.remove(index);
            values.remove(index);
            return true;
        }
        return false; // Retorna false se a chave e o valor não estiverem associados corretamente
    }

    @Override
    public V remove(Object key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            V removedValue = values.remove(index); // Remova o valor primeiro
            keys.remove(index); // Remova a chave em seguida
            return removedValue;
        }
        return null; // Retorna null se a chave não for encontrada
    }


    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public V get(Object key) {
        return values.get(keys.indexOf(key));
    }

    @Override
    public Collection<V> values() {
        return new ArrayList<>(values);
    }

    ///////////////////////////////////
    /////////DESCONSIDERADOS//////////
    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Entry<K, V>> entrySet(){
        throw new UnsupportedOperationException();
    }

    @Override
	public void putAll(Map<? extends K, ? extends V> m) {
		throw new UnsupportedOperationException();
	}
    ///////////////////////////////////

}

import java.util.*;

public class MapAdapter<K, V> implements List<V> {
    
    private Map<K, V> map;

    public MapAdapter(Map<K, V> map){
        this.map = map;
    }
    
    @Override
    public boolean add(V e){
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear(){
        this.map.clear();
    }

    @Override
    public boolean contains(Object o){
        if(this.map.containsValue(o)){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o){
        List<V> lista = new ArrayList<>(); 
        lista.addAll(map.values());
        
        if(lista.equals(o)){
            return true;
        }
        return false;
    }

    @Override
    public V get(int index){
        List<K> chaves = new ArrayList<>(map.keySet());
        return map.get(chaves.get(index));
    }

    @Override
    public boolean isEmpty(){
        if(this.map.isEmpty()){
            return true;
        }
        return false;
    }
    
    @Override
    public Iterator<V> iterator(){
        map.keySet();
        return this.map.values().iterator();
    }

    @Override
    public V remove(int index){
        List<K> chaves = new ArrayList<>(map.keySet());
        map.remove(chaves.get(index));
        return map.get(chaves.get(index));
    }

    @Override
    public int size(){
        return this.map.size();
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[map.size()];
        int i = 0;
        for(Object value : map.values()){
            array[i] = value;
            i++;
        }
        return (array);
    }

    ////////////////////////////////
    ////////DESCONSIDERADOS////////

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends V> c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends V> c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public V set(int index, V element) {
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, V element) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<V> listIterator() {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public ListIterator<V> listIterator(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<V> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}

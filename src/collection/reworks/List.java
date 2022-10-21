package collection.reworks;

import java.util.Arrays;

public class List<E> {
    private static final Object[] EMPTY_DATA = new Object[0];
    private Object[] elementData;
    private int size = 10;
    public List(int capacity){
        if(capacity > 0){
            this.elementData = new Object[capacity];
        }
        else{
            if(capacity != 0){
                throw new IllegalArgumentException("Illegal Capacity: " + capacity);
            }
            this.elementData = EMPTY_DATA;
        }
    }
//    private Object[] grow(int minCapacity){
//
//    }

    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean contains(Object o){
        return this.indexOf(o) >= 0;
    }
    public int indexOf(Object o){
        return this.indexOfRange(o, 0, this.size);
    }
    public int indexOfRange(Object o, int start, int end){
        Object[] temp = this.elementData;
        int i;
        //Since == is faster than Object.equals
        if(o == null){
            for(i = start; i <= end; i++){
                if(temp[i] == null)
                    return i;
            }
        }
        else{
            for(i = start; i <= end; i++){
                if(o.equals(temp[i]))
                    return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(Object o){
        return lastIndexOfRange(o, 0, this.size);
    }
    public int lastIndexOfRange(Object o, int start, int end){
        Object[] temp = this.elementData;
        int i;
        if(o == null){
            for(i = end - 1; i >= start; i--){
                if(temp[i] == null){
                    return i;
                }
            }
        }
        else{
            for(i = end - 1; i >= start; i--){
                if(o.equals(temp[i])){
                    return i;
                }
            }
        }
        return -1;
    }
    public Object[] toArray(){
        return Arrays.copyOf(this.elementData, this.size);
    }
    E elementData(int index){
        return (E) this.elementData[index];
    }
    public E get(int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        else{
            return elementData(index);
        }
    }
    public E set(int element, int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        else{
            E oldValue = this.elementData(index);
            this.elementData[index] = element;
            return oldValue;
        }
    }

}


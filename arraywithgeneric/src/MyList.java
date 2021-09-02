

import java.util.Arrays;
 
class Generic_Array<E> {
    private Object[] obj_array;   //object array
    // class constructor
    public int len; //field
    
    public Generic_Array()    {
        //new object array
        obj_array = new Object [0];
    }
    // get new object array(obj_array[i])
    E get(int j) {
        @SuppressWarnings("unchecked")
        final E e = (E)obj_array[j];
        return e;
    }
    // set e at new object array(obj_array[i])
    void set(int j, E e) {
        obj_array[j] = e;
    }
    public void add(E item)
    {
        Object[] tempArray = obj_array;
        obj_array = new Object[obj_array.length+1];
        for (int i = 0; i < tempArray.length; i++)
        {
        	obj_array[i] = tempArray[i];
        }

        obj_array[obj_array.length - 1] = item;
        this.len=obj_array.length;
        

    }
    @Override
    public String toString() {
        return Arrays.toString(obj_array);
    }
    public int kemallen() {
    	return this.obj_array.length;
    }
    
    
}
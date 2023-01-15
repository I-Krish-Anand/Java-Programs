package myPack;
import java.util.Arrays;
public class ArraysAsList
{
    private  int[]array=new int[5];
    private int index=0;
    private  int size=5;

    @Override
    public String toString()
    {
        int[]temp=new int[index];
        System.arraycopy(array,0,temp,0,index);
        return Arrays.toString(temp);
    }
    public void add(int value)
    {
        if(index>=array.length)
        {
            size += 5;
            int[] temp = array.clone();
            array = new int[size];
            System.arraycopy(temp,0,array,0,temp.length);
        }
        array[index]=value;
        index++;
    }
    public void delete(int position)
    {
        if(position>=index)
            throw new RuntimeException("Array Index Out Of Bound");

        int[] temp = array.clone();
        if(index%5==1)
            size-=5;
        array = new int[size];
        System.arraycopy(temp,0,array,0,position);
        System.arraycopy(temp,position+1,array,position, index-position-1);
        index--;
    }

}

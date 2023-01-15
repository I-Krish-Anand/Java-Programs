package myPack;
public class ArraysAsList {
    private  int[]array=new int[5];
    private int index=0;
    private  int size=5;
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
    public void delete()
    {
        if(index%5==1)
        {
            size -= 5;
            int[] temp = array.clone();
            array = new int[size];
            System.arraycopy(temp,0,array,0,--index);
        }
        else
            index--;
    }
    public void display()
    {
        for(int i=0;i<index;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
}

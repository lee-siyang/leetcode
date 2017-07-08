/**
 * Created by lisiyang on 17/7/7.
 */
public class ArrayShellSortTest {
    private long[] theArray;
    private int nElems;

    public ArrayShellSortTest( int max) {
        this.theArray = new long[max];
        this.nElems = 0;
    }

    public void insert(long value){
        theArray[nElems++] = value;
    }

    public void display(){
        System.out.println("A=");
        for (int i = 0;i<nElems;i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println();
    }

    public void shellsort(){
        int inner,outer;
        long temp;

        int h=1;
        while (h<=nElems/3){
            h = h*3+1;
        }

        while (h>0) {
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                while (inner>h-1 && theArray[inner-h] >= temp){
                    theArray[inner] = theArray[inner-h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h-1)/3;
        }
    }
    public static void main(String[] args){
        int maxSize = 10;
        ArrayShellSortTest arr = new ArrayShellSortTest(maxSize);
        for (int i =0;i<maxSize;i++){
            long n = (int)( Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.shellsort();
        arr.display();
    }
}

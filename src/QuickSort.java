/**
 * Created by lisiyang on 17/8/10.
 */
public class QuickSort {
    private long[] theArray;
    private int nElems;

    public QuickSort(int max){
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems++] = value;
    }

    public void display(){
        System.out.println("A = ");
        for (int i = 0; i<nElems; i++){
            System.out.print(theArray[i] + " ");
            System.out.println();
        }
    }

    public void quickSort(){
        recQuickSort(0,nElems-1);
    }

    private void recQuickSort(int left, int right){
        if (right<=left) return;
        else {
            long pivot = theArray[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }

    private int partitionIt(int left, int right, long pivot){
        int leftPtr = left-1;   //left(after++)
        int rightPtr = right;   //right-1(after--)
        while (true){
            while (theArray[++leftPtr] < pivot);
            while (rightPtr>0 && theArray[--rightPtr] > pivot);
            if (leftPtr>=rightPtr)break;
            else swap(leftPtr,rightPtr);
        }
        swap(leftPtr,right);
        return leftPtr;
    }

    private void swap(int left, int right){
        long temp = theArray[left];
        theArray[left] = theArray[right];
        theArray[right] = temp;
    }
}

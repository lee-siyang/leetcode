/**
 * Created by lisiyang on 17/7/8.
 */
public class ArrayQuickSortTest {
    private long[] theArray;
    private int nElems;

    public ArrayQuickSortTest(int n) {
        this.theArray = new long[n];
        this.nElems = 0;
    }

    public void insert(int i){
        theArray[nElems++] = i;
    }

    public void display(){
        System.out.println("A = ");
        for (int i = 0;i<nElems;i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println();
    }

    public void quickSort(){
        recQuickSort(0,nElems-1);
    }

    private void recQuickSort(int left, int right){

        if (right<=left){
            return;
        }
        else{
            long pivot = theArray[right];
            int p = partitionIt(left,right,pivot);
            recQuickSort(left, p-1);
            recQuickSort(p+1, right);
        }

    }

    private int partitionIt(int left, int right, long pivot){
        int leftPtr = left-1;
        int rightPtr = right;   //最右位置已经作为枢纽，不必进行比较
        while (true){
            while (theArray[++leftPtr]<pivot);
            while (rightPtr>0 && theArray[--rightPtr]>pivot);
            if (leftPtr>=rightPtr){
                break;
            }
            else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr,right);    //restore pivot;枢纽位置确定，一次交换后就固定，不再变更
        return leftPtr;
    }

    private void swap(int left, int right){
        long temp = theArray[left];
        theArray[left] = theArray[right];
        theArray[right] = temp;
    }

    public static void main(String[] args){
        int maxSize = 15;
        ArrayQuickSortTest arrayQuickSortTest = new ArrayQuickSortTest(maxSize);
        for (int i = 0; i< maxSize;i++){
            arrayQuickSortTest.insert((int)(Math.random()*99));
        }
        arrayQuickSortTest.display();
        arrayQuickSortTest.quickSort();
        arrayQuickSortTest.display();
    }
}

/**
 * Created by lisiyang on 17/7/10.
 */
public class ArrayQuickSortTest_II {
    public static final int CUTOFF = 10;
    private static <AnyType extends Comparable<? super AnyType>>
    AnyType median3(AnyType[] a, int left, int right){
        int center = (left + right) / 2;
        if (a[center].compareTo(a[left])<0){
            swapReferences(a, left, center);
        }
        if (a[right].compareTo(a[center])<0){
            swapReferences(a, center, right);
        }
        if (a[right].compareTo(a[left])<0){
            swapReferences(a, left, right);
        }
//        由于right位置上的元素必然大于center，将right位置上的元素固定不动
//        将center与right-1上的元素进行交换。
//        作为元素j的警戒标记。
        swapReferences(a, center, right-1);
        return a[right-1];
    }

    private static <AnyType extends Comparable<? super AnyType>>
    void swapReferences(AnyType[] a, int left, int right){
        AnyType temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    private static <AnyType extends Comparable<? super AnyType>>
    void quicksort(AnyType[] a, int left, int right){
        if (left + CUTOFF <= right){
            AnyType pivot = median3(a, left, right);

            int i = left, j = right-1;
            for (;;){
                while (a[++i].compareTo(pivot)<0){}
                while (a[--j].compareTo(pivot)>0){}
                if (i<j){
                    swapReferences(a, i, j);
                }
                else break;
            }

//            下一任pivot被保存在right-1处。
            swapReferences(a, i, right-1);

            quicksort(a, left,i-1);
            quicksort(a, i+1, right);
        }
        else{
            insertionSort(a, left, right);
        }
    }

    public static <AnyType extends Comparable<? super AnyType>>
    void quicksort(AnyType[] a){
        quicksort(a, 0, a.length-1);
    }

    private static <AnyType extends Comparable<? super AnyType>>
    void insertionSort(AnyType[] a, int left, int right){
        int j;

        for (int p = left;p < right;p++){
            AnyType tmp = a[p];
            for (j = p;j>0 && tmp.compareTo(a[j-1])<0;j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
}

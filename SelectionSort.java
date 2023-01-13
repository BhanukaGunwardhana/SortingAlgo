import java.util.Arrays;

public class SelectionSort {
    public void selectionsort(int [] arr){
        for(int i=0;i<arr.length;i++){
            boolean isHavingMin=false;
            int s;
            s=arr[i];
            int holder=i;
            
            for (int j=i+1;j<arr.length;j++){
                if(s>arr[j]){
                    s=arr[j];
                    holder=j;
                    isHavingMin=true;
                }
            //int holder= findminIndex(arr, i, isHavingMin);
                //int swapv;
                //swapv=arr[i];
                //arr[i]=arr[holder];
                //arr[holder]=swapv;
                swap(arr, i, holder);
            
            
            } 
        }
    }
    void swap(int [] arr,int i,int holder){
        int swapv;
        swapv=arr[i];
        arr[i]=arr[holder];
        arr[holder]=swapv;
    }
    int findminIndex(int [] arr,int i,boolean isHavingMin){
             int s;
            s=arr[i];
            int holder=i;
            //boolean isHavingMin=false;
            for (int j=i+1;j<arr.length;j++){
                if(s>arr[j]){
                    s=arr[j];
                    holder=j;
                    isHavingMin=true;
                }

            }
            return holder;
    }
    public static void main(String[] args) {
        int [] arr={2,3,5,3,9,56,4};
        SelectionSort ssort=new SelectionSort();
        ssort.selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

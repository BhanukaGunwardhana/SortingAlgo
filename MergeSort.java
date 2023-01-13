import java.util.Arrays;

public class MergeSort {
    public void mergesort(int [] arr){
        if(arr.length<2){
            return ;
        }
        int middle=(arr.length)/2;
        int [] left=new int [middle];
        int [] right=new int [arr.length-middle];

        for (int i=0;i<middle;i++){
            left[i]=arr[i];
        }

        for (int i=middle;i<arr.length;i++){
            right[i-middle]=arr[i];
        }
        
        mergesort(left);
        mergesort(right);

        merge(left, right, arr);



        
        
        
        
    }
    void merge(int [] left,int [] right,int [] result){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                result[k]=left[i];
                k++;
                i++;
            }else{
                result[k]=right[j];
                k++;
                i++;
            }
        }
        while(i<left.length){
            result[k]=left[i];
            k++;
            i++;

        }
        while(j<right.length){
            result[k]=right[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int [] arr={1,3};
        MergeSort msort=new MergeSort();
        msort.mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

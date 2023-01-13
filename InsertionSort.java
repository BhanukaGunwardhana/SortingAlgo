import java.util.Arrays;

public class InsertionSort {
    public void insertionsortmy(int [] arr ){
        
        for (int j=1;j<arr.length;j++){
            //if(arr[j]>=arr[i]){continue;}
            for(int k=j-1;k>=0;k--){
                
                if(arr[k+1]<arr[k]){
                    int holder;
                    holder=arr[k+1];
                    arr[k+1]=arr[k];
                    arr[k]=holder;
                    //continue;
                }
                else{break;}
            }
        }
        
    }
    public void insertionsort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int holder=arr[i];
            int j=i-1;
            while(j>=0 && holder<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=holder;
        }
    }
    public static void main(String[] args) {
        InsertionSort isort=new InsertionSort();
        int [] arr= {4,1,7,1,3};
        isort.insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

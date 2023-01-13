import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BubleSort{
    public void bubleSort(int [] arr){
        boolean isSorted;
        for (int j=arr.length;j>0;j--){
            //int a;
            isSorted=true;
            for (int i=0;i<j-1;i++){
                if(arr[i]>=arr[i+1]){
                    swap(arr,i);
                    isSorted=false;
                    //a=arr[i];
                    //arr[i]=arr[i+1];
                    //arr[i+1]=a;
                }

                
                

            }
            if(isSorted==true){return ;}



        }
        
        
    }
    void swap(int [] arr,int i){
        int holder;
        holder=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=holder;
    }
    public static void main(String[] args) {
        BubleSort sort=new BubleSort();
        int [] arr={5,3,8,1};
       
        //System.out.println(Arrays.asList(arr).toString());
        for (int i : arr){
            //System.out.println(i);
        }
        sort.bubleSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
        //System.out.println(Arrays.asList(arr).toString());
        System.out.println(Arrays.toString(arr));
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Insertionsort extends Methodsort{
    
    @Override
    public  void Sort(double[] arr){
        double tmp;
        int j;
        double lastTmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            j=i;
            tmp = arr[i];
            
            while(j>0 && arr[j-1]<tmp){
            arr[j]=arr[j-1];
            j--;
        }
            arr[j]=tmp;
        }
        
        
        
        
        
        
        
//        double[] Nonsorted = arr.clone();
//        int NonsortedCount = arr.length-2;
//        int SortedCount = 2;
//        double[] Sorted = new double[arr.length];
//       
//        if (Nonsorted[1]>Nonsorted[0]) {
//            Sorted[0]=Nonsorted[0];
//            Sorted[1]=Nonsorted[1];
//        }
//        else{
//            Sorted[0]=Nonsorted[1];
//            Sorted[1]=Nonsorted[0];
//        }
//        int iter = 2;
//        double nS;
//        double S;
//        while(NonsortedCount!=0){
//            nS = Nonsorted[iter];
//            for (int i = 0; i < SortedCount; i++) {
//                S = Sorted[i];
//                if (nS<=S) {
//                    
//                    for (int j = Sorted.length-1; j > i; j--) {
//                        Sorted[j]=Sorted[j-1];
//                    }
//                    Sorted[i]=Nonsorted[iter];
//                    
//                    SortedCount++;
//                    NonsortedCount--;
//                    iter++;
//                    break;
//                }
//            }
//            
//            
//        }
//        arr = Sorted;
//        
//        
   }
}
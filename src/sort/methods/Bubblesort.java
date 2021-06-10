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
public class Bubblesort extends Methodsort{
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort.html */

    /**
     *
     * @param arr
     * @return
     */

    
    public void Sort(double[] arr){
    Boolean ChangeFlag = true;    
    int count = arr.length;
    
    while(ChangeFlag==true){
        ChangeFlag=false;
      for (int i = count-2; i >= 0; i--) {
          
            if(arr[i+1]>arr[i]){
             double tmp1 = arr[i+1];
             double tmp2 = arr[i];
             arr[i+1]=tmp2;
             arr[i]=tmp1;
             ChangeFlag=true;
            }
            
        }  
    }
    
    
    }
    
}

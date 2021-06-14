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
public class Selectionsort extends Methodsort {
    @Override
    public  void Sort(double[] arr){
        double min;
        int indMin;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indMin = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    indMin = j;
                }
            }
            arr[indMin]=arr[i];
            arr[i] = min;
        }
    }
}

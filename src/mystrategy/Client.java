/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.strategy.SortStrategy;
import sort.methods.Methodsort;
import sort.methods.Bubblesort;
import sort.strategy.SortContext;
import sort.methods.Selectionsort;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(10000);
        //double[] dataNonSort = DataGenerator.generate(10);
       /* Wzorzec Stratega */
        //...
        SortContext context = new SortContext();
        int n = 2;
        double time = 0;
        switch(n){
            case 1:
                
                context.SetStrategy(new Bubblesort());
                
            case 2:
                
                context.SetStrategy(new Selectionsort());
                
            case 3:
            case 4:
        }
        time = context.Execute(dataNonSort);
        System.out.println("Time: ??");
        System.out.println(time);
    }
}

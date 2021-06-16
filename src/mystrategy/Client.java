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
import sort.methods.Insertionsort;

/**
 *
 * @author LeopardProMK
 */
//Odpowiedzi na pytania:
//1. Strategia pozwala na stworzenie zasady wykonywania pewnego zakresu czynności programu,
//pozwalając jednocześnie na rozbudowę (dodawanie dodatkowych metod określających dokładny sposób )
//bez konieczności modyfikacji całego kodu
//2.Istnieje możliwość zmiany algorytmu, ponieważ określony algorytm jest przypisywany 
//do określonej klasy kontekstu
//3.Zdefiniowana jest klasa abstrakcyjna reprezentująca metodę, która implementuje 
//interfejs i która jest rozszerzana przez klasy kolejnych metod
//4.Strategia jest użyteczna kiedy jedna czynność programu może być wykonanana 
//na wiele sposobów, których wariant ma być wybierany w trakcie użytkowania
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        //double[] dataNonSort = DataGenerator.generate(5);
        double[] dataNonSort = DataGenerator.generate(10000);
       /* Wzorzec Stratega */
        //...
        SortContext context = new SortContext();
        int n = 3;
        double time = 0;
        switch(n){
            case 1:
                
                context.SetStrategy(new Bubblesort());
                
            case 2:
                
                context.SetStrategy(new Selectionsort());
                
            case 3:
                
                context.SetStrategy(new Insertionsort());
                
            case 4:
        }
        time = context.Execute(dataNonSort);
        System.out.println("Time: ??");
        System.out.println(time);
    }
}

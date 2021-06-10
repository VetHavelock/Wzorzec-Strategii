/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

/**
 *
 * @author VetHa
 */
public class SortContext {
    private SortStrategy strategy;
    private Stopwatch watch;
    public void SetStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }
    public double Execute(double[] arr){
        watch = new Stopwatch();
        this.strategy.Sort(arr);
        double time =  watch.elapsedTime();
                
        return time;
    }
}

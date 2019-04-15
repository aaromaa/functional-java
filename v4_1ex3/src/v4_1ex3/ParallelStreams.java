/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_1ex3;

/**
 *
 * @author aaro
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.*;

public class ParallelStreams  {
    
    public static int hidasNelioSumma(int n) {
    //LinkedList<Integer> list = new LinkedList<>();
    //ArrayList<Integer> list = new ArrayList<>(n);
    /*    
    int i=0;
    for (i=0; i<n ; i++){
        list.add(i);
    }

        return list.parallelStream()
*/
                                  return IntStream.range(0,n).parallel().map(x -> x * x)
                                  .reduce(0, (acc, x) -> acc + x);
    }
    

    public static long iterativeSum(int n) {
        long result = 0;
        for (long i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).reduce(Long::sum).get();
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(Long::sum).get();
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n).reduce(Long::sum).getAsLong();
    }

    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(Long::sum).getAsLong();
    }

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }

    public static class Accumulator {
        private long total = 0;

        public void add(long value) {
            total += value;
        }
    }
    
     public static long sideEffectParallelSumLong(long n) {
        LongAccumulator accumulator = new LongAccumulator(Long::sum, 0);
        LongStream.rangeClosed(1, n).forEach(accumulator::accumulate);
        return accumulator.longValue();
    }
    
}
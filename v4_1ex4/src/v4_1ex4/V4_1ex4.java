/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_1ex4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author aaro
 */
public class V4_1ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("own test: " + measurePerf(V4_1ex4::count,100000) + " msecs");
    }
    public static <T, R> long measurePerf(Function<T, R> f, T input) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            R result = f.apply(input);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + result);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }
    public static Map count()throws IOException{
         Map <String, Integer > wordCounter = Files.lines(Paths.get("C://NetBeansProjects/v3_1ex5/src/v3_1ex5/kalevala.txt"), Charset.forName("ISO-8859-1")).flatMap(line -> Arrays.stream(line.split(" "))).collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
         return wordCounter;
                                 

        //System.out.println(wordCounter);
    }
    
}

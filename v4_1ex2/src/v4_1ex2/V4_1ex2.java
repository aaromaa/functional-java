/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_1ex2;

/**
 *
 * @author aaro
 */
import java.util.stream.IntStream;
public class V4_1ex2 {

  public static void main(String[] args) {
  //  sum of the triples of even integers from 2 to 10
  System.out.printf(
    "Sum of the triples of even integers from 2 to 10 is: %d%n",
    IntStream.rangeClosed(1,10)
            .map(x -> x*3).peek(System.out::println)
            .filter(x -> x%2 == 0).peek(System.out::println)
            .sum());
  }
}


// a) 5 kertaa   b) 5 kertaa c) kaikki 10 käydään läpi.
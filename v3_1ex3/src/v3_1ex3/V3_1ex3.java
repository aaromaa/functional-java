
package v3_1ex3;

import java.util.Arrays;

/**
 *
 * @author aaro
 */
import java.util.*;
import static java.util.Arrays.asList;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
public class V3_1ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = new int[20];
        int sum  = Arrays.stream(a)
                .map(x -> (int)((Math.random()*6) +1))
                .filter(b -> b == 6)
                .reduce(0,(c,b) -> c+b);
        System.out.println(sum/6);
    }
    
}

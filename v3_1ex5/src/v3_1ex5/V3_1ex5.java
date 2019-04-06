/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_1ex5;

/**
 *
 * @author aaro
 */
import java.io.IOException;
import java.util.function.IntSupplier;
import java.util.stream.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Map;
public class V3_1ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Map <String, Integer > wordCounter = Files.lines(Paths.get("C://NetBeansProjects/v3_1ex5/src/v3_1ex5/kalevala.txt"), Charset.forName("ISO-8859-1"))
                                 .flatMap(line -> Arrays.stream(line.split(" ")))
                                 .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
                                 

System.out.println(wordCounter);
    }
    
}

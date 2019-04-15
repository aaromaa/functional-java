/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_1ex1;

/**
 *
 * @author aaro
 */
import java.util.*;
import org.junit.*;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class V4_1ex1 {

    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(12, 2), null);
        points.stream().map(p -> p.getX()).forEach(System.out::println);
        Result result = JUnitCore.runClasses(Point.class);
        for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
    }

    private static class Point {

        @Test
        public void testmoveAllPointsRightBy()
                throws Exception {
            List<Point> points = Arrays.asList(new Point(5, 5), new Point(10, 5));
            List<Point> expectedPoints
                    = Arrays.asList(new Point(15, 5),
                            new Point(20, 5));
            List<Point> newPoints = Point.
                    moveAllPointsRightBy(points, 10);
            assertEquals(expectedPoints, newPoints);
        }
        private static  int x;
        private static int y;

        private Point(int x, int y) {
            Point.x = x;
            Point.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            Point.x = x;
        }

        public static Point moveRightBy(int z) {
            return new Point(x + z, y);
        }

        public static List<Point> moveAllPointsRightBy(
                List<Point> points, int x) {
            return points.stream().map(p -> moveRightBy(x)).collect(toList());
        }

    }
}

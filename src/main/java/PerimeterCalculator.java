import org.talento.tech.*;

import java.util.List;

/**
 * Este codigo permite calcular el perimetro de figuras de N >= 3 lados
 * Figuras de ejemplo:
 * - square.txt - lado de 4
 * - triangle.txt - base de 4, altura de 4
 */

public class PerimeterCalculator {

    public PerimeterCalculator () {}

    public double calculatePerimeter(Shape s) {
        // Definir la variable que acumule el perimetro
        int perimeter = 0;

        List<Point> points = s.getPoints();
        Point prevPoint = points.getLast();

        for (Point point : points) {
            // Obtener la distancia de los lados
            // Ayuda: prevPoint.distancia(point)
            double distance = prevPoint.distancia(point); // 4
            perimeter += distance;

            prevPoint = point;
        }

        // Retornar la variable del perimetro
        return perimeter;
    }

    public int getTotalPoints(Shape s) {
        // Definir la variable para el total de puntos
        int totalpoints = 0;

        for(Point point: s.getPoints()) {
            // Acumular el total de puntos
            totalpoints++; //totalpoints =totalpoints +1
        }

        // Retornas el valor de puntos
        return totalpoints;
    }

    public static void main (String[] args) {
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        // Definit el nombre del archivo
        String filename = "square.txt";
        Shape shape = new Shape();

        shape.readPoints(filename);
        // Mostrar el valor de calculatePerimeter y getTotalPoints
    }
}

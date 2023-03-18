//

import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Section[] lineSegments = {
                new Section(new Point(1, 1), new Point(4, 4)),
                new Section(new Point(2, 3), new Point(5, 0)),
                new Section(new Point(-1, 0), new Point(2, 2)),
                new Section(new Point(-3, -1), new Point(0, 4)),
                new Section(new Point(0, 2), new Point(3, -1))
        };

        TreeMap<Double, Point> intersectionPoints = new TreeMap<>();

        for (int i = 0; i < lineSegments.length; i++) {
            for (int j = i + 1; j < lineSegments.length; j++) {
                if (lineSegments[i].intersects(lineSegments[j])) {
                    Point intersectionPoint = lineSegments[i].getIntersectionPoint(lineSegments[j]);
                    intersectionPoints.put(intersectionPoint.x, intersectionPoint);
                }
            }
        }

        Point minIntersectionPoint = intersectionPoints.firstEntry().getValue();
        System.out.println("Минимальная точка пересечения: (" + minIntersectionPoint.x + ", " + minIntersectionPoint.y + ")");
    }
}
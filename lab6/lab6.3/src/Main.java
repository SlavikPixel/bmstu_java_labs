import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("points.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                points.add(new Point(x, y));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<Line, Integer> lines = new HashMap<>();
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            for (int j = i + 1; j < points.size(); j++) {
                Point p2 = points.get(j);
                Line line = new Line(p1, p2);
                if (lines.containsKey(line)) {
                    lines.put(line, lines.get(line) + 1);
                } else {
                    lines.put(line, 2);
                }
            }
        }

        try {
            PrintWriter writer = new PrintWriter(new File("lines.txt"));
            for (Line line : lines.keySet()) {
                int count = lines.get(line);
                if (count > 2) {
                    writer.println(line.toString() + " - " + count + " points");
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Point) {
                Point other = (Point) obj;
                return this.x == other.x && this.y == other.y;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.x * 31 + this.y * 17;
        }
    }

    private static class Line {
        public double a;
        public double b;
        public double c;

        public Line(Point p1, Point p2) {
            this.a = p1.y - p2.y;
            this.b = p2.x - p1.x;
            this.c = p1.x * p2.y - p2.x * p1.y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Line) {
                Line other = (Line) obj;
                return this.a == other.a && this.b == other.b && this.c == other.c;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (int) (this.a * 31 + this.b * 17 + this.c);
        }

        @Override
        public String toString() {
            return this.a + "a + " + this.b + "b" + " = - (" + this.c + ")";
        }
    }
}
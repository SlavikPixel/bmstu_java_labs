// На плоскости задано N отрезков.
// Найти точку пересечения двух отрезков, имеющую минимальную абсциссу.
// Использовать класс TreeMap.
public class Section {
    Point start;
    Point end;
    public Section(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // возвращает значение коэффициента наклона (углового коэффициента) прямой,
    // заданной отрезком, который вычисляется по формуле
    // (y2 - y1) / (x2 - x1), где (x1, y1) и (x2, y2) - координаты начальной и конечной точек отрезка.
    public double getSlope() {
        return (end.y - start.y) / (end.x - start.x);
    }

    // возвращает значение y-пересечения (смещения) прямой,
    // заданной отрезком, который вычисляется по формуле y1 - k * x1,
    // где k - значение коэффициента наклона, а (x1, y1) - координаты начальной точки отрезка.
    public double getYIntercept() {
        return start.y - getSlope() * start.x;
    }

    public boolean intersects(Section other) {
        double thisMinX = Math.min(start.x, end.x);
        double thisMaxX = Math.max(start.x, end.x);
        double otherMinX = Math.min(other.start.x, other.end.x);
        double otherMaxX = Math.max(other.start.x, other.end.x);
        if (thisMaxX < otherMinX || thisMinX > otherMaxX) {
            return false;
        }

        double thisMinY = Math.min(start.y, end.y);
        double thisMaxY = Math.max(start.y, end.y);
        double otherMinY = Math.min(other.start.y, other.end.y);
        double otherMaxY = Math.max(other.start.y, other.end.y);
        if (thisMaxY < otherMinY || thisMinY > otherMaxY) {
            return false;
        }

        double thisSlope = getSlope();
        double otherSlope = other.getSlope();
        if (thisSlope == otherSlope) {
            return false;
        }

        double x = (other.getYIntercept() - getYIntercept()) / (thisSlope - otherSlope);
        if (x < thisMinX || x > thisMaxX || x < otherMinX || x > otherMaxX) {
            return false;
        }

        return true;
    }

    public Point getIntersectionPoint(Section other) {
        double thisSlope = getSlope();
        double otherSlope = other.getSlope();
        double thisYIntercept = getYIntercept();
        double otherYIntercept = other.getYIntercept();
        double x = (otherYIntercept - thisYIntercept) / (thisSlope - otherSlope);
        double y = thisSlope * x + thisYIntercept;
        return new Point(x, y);
    }
}

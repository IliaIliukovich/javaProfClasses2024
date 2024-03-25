package lesson20240325.hometask;

import java.util.*;

public class Point implements Comparable<Point>{

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        int result = Double.compare(x, o.x);
        if (result == 0) result = Double.compare(y, o.y);
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 0);
        Point point3 = new Point(0, 1);
        Point point4 = new Point(0, 0);

        Set<Point> points = new TreeSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        System.out.println(points);

        Set<Point> pointsByY = new TreeSet<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return Double.compare(o1.y, o2.y);
            }
        });
        pointsByY.add(point1);
        pointsByY.add(point2);
        pointsByY.add(point3);
        pointsByY.add(point4);

        System.out.println(pointsByY);

        Set<Point> hashSet = new HashSet<>(); // equals(), hashCode()
        hashSet.add(point1);
        hashSet.add(point2);
        hashSet.add(point3);
        hashSet.add(point4);


        System.out.println(hashSet);

        // compareTo() must be consistent with equals(), hashCode()
    }
}

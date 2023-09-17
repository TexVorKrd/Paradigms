package HW4;

import java.util.Arrays;

public class hw4ex1 {
    public static void main(String[] args) {
        int size = 20;
        Pair[] pairs = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairs[i] = new Pair(Math.random() * 100, Math.random() * 100);
        }
        System.out.printf("Корреляция равна %.2f", correliation(pairs));
    }

    public static double correliation(Pair[] pairs) {
        double mx = Arrays
                .stream(pairs)
                .map(a -> a.getX())
                .mapToDouble(a -> a)
                .sum() / pairs.length;

        double my = Arrays
                .stream(pairs)
                .map(a -> a.getY())
                .mapToDouble(a -> a)
                .sum() / pairs.length;

        double up = Arrays
                .stream(pairs)
                .map(a -> (a.getX() - mx) * (a.getY() - my))
                .mapToDouble(a -> a)
                .sum();

        double down = Math.sqrt(Arrays
                .stream(pairs)
                .map(a -> Math.pow((a.getX() - mx), 2) * Math.pow((a.getY() - my), 2))
                .mapToDouble(a -> a)
                .sum());
        return up / down;

    }


    /**
     * Класс координат
     */
    public static class Pair {
        private double x;
        private double y;

        public Pair(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}


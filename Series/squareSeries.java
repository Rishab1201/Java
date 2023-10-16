package Series;

public class squareSeries {
    public static void generateSeries(int n) {
        System.out.println("Square Series of " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}

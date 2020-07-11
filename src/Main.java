public class Main {
    public static void main(String[] args) {
        int x = 0;
        double y = executeExpression(x);
        System.out.println(y);
        int x2 = 2;
    }

    static double executeExpression(int x) {
        return x - 5;
    }
}
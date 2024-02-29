package recursion;

public class TrianglePattern {

    public static void main(String[] args) {
        //printInverseTriangle(4, 0);
        printNormalTriangle(4,0);
    }

    private static void printInverseTriangle(int r, int c) {
        if (r < c) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            printInverseTriangle(r, c + 1);
        } else {
            System.out.println();
            printInverseTriangle(r - 1, 0);
        }
    }

    private static void printNormalTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            printNormalTriangle(r, c + 1);
            System.out.print("*");
        } else {
            printNormalTriangle(r - 1, 0);
            System.out.println();

        }
    }

}

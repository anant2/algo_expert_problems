package classes;

public class Array2D {

    public static void main(String[] args) {
        int arr [] [] = {{1,4,1},
                        {2,5,1},
                        {6,8,2},
                        {9,2,3}};

        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

}

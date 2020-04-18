import java.io.File;
import java.io.FileReader;
import  java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*BufferedReader br = null;
        try{
            File file = new File("Initializer.txt");

        }
        catch(IOException ex){
            System.out.println("no file");
        }
        Minimize minimize = new Minimize();
        System.out.println(minimize.minimumCost(minimize.allNodes));
    }*/
        int[][] arr = new int[7][7];
        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[0][2] = 0;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;
        arr[0][6] = 0;
        arr[1][0] = 2;
        arr[1][1] = 0;
        arr[1][2] = 0;
        arr[1][3] = 7;
        arr[1][4] = 6;
        arr[1][5] = 1;
        arr[1][6] = 0;
        arr[2][0] = 0;
        arr[2][1] = 0;
        arr[2][2] = 0;
        arr[2][3] = 4;
        arr[2][4] = 6;
        arr[2][5] = 9;
        arr[2][6] = 0;
        arr[3][0] = 0;
        arr[3][1] = 0;
        arr[3][2] = 0;
        arr[3][3] = 0;
        arr[3][4] = 0;
        arr[3][5] = 0;
        arr[3][6] = 3;
        arr[4][0] = 0;
        arr[4][1] = 0;
        arr[4][2] = 0;
        arr[4][3] = 0;
        arr[4][4] = 0;
        arr[4][5] = 0;
        arr[4][6] = 1;
        arr[5][0] = 0;
        arr[5][1] = 0;
        arr[5][2] = 0;
        arr[5][3] = 0;
        arr[5][4] = 0;
        arr[5][5] = 0;
        arr[5][6] = 10;
        arr[6][0] = 0;
        arr[6][1] = 0;
        arr[6][2] = 0;
        arr[6][3] = 3;
        arr[6][4] = 1;
        arr[6][5] = 10;
        arr[6][6] = 0;

        Initializer init = new Initializer();
        List<Node> l = new ArrayList<Node>();
        l=init.initialize(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        Minimize minimize = new Minimize();
        System.out.println(minimize.minimumCost(l));
    }
}

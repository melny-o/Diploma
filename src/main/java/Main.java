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
    */
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 0, 0, 0},
                {4, 0, 0, 0, 0, 0, 0},
                {0, 7, 4, 0, 0, 0, 0},
                {0, 6, 2, 0, 0, 0, 0},
                {0, 1, 9, 0, 0, 0, 0},
                {0, 0, 0, 3, 1, 10, 0}
        };

        Initializer init = new Initializer(arr);
        List<Node> l = new ArrayList<Node>();
        l = init.allNodes;
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
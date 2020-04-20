import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Reader r = new Reader();
        try {
            File file = new File("C:/Users/melny/IdeaProjects/MelnychenkoDiploma/src/main/resources/Initializer.txt");
            int[][]arr= r.readFromFile(file);
            Minimize minimize = new Minimize();
            System.out.println("Due to chosen transitions, the cheapest route cost is: "+minimize.minimumCost(Initializer.init(arr)));
        } catch (IOException ex) {
            System.out.println("File not found!");
        }
    }

}
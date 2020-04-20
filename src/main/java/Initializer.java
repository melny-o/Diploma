import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Initializer {

    public static List<Node> init(int[][] array) {
        Node node;
        Transition transition;
        List<Node> allNodes = new ArrayList<Node>();
        for (int i = array.length - 1; i >= 0; i--) {
            node = new Node(i + 1);
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    transition = new Transition(new Node(j + 1), array[i][j]);
                    node.getPossibleTransitions().add(transition);
                }
            }
            if (node.getPossibleTransitions().size() != 0) node.setPossibleTransitions(node.getPossibleTransitions());
            allNodes.add(node);
        }
         Collections.reverse(allNodes);
        return allNodes;
    }

}

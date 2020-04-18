import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Initializer {
     List<Node> allNodes=new ArrayList<Node>();
     Node node;
     Node targetNode;
     Transition transition;
     List<Transition> possibleTransitions= new ArrayList<Transition>();
    public List<Node> initialize(int [][] array) {
        for (int i = array.length-1; i>0; i--){
            for(int j = 0; j<i; j++){
                if(array[i][j]>0) {
                    node = new Node(i+1);
                    transition = new Transition(new Node(j+1), array[i][j]);
                   // possibleTransitions = new ArrayList<Transition>();
                    possibleTransitions.add(transition);
                    node.setPossibleTransitions(possibleTransitions);
                    //allNodes = new ArrayList<Node>();
                    allNodes.add(node);
                }
            }
        }
        return allNodes;
    }
}

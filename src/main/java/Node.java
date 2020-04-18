import java.util.List;
import java.util.Map;

public class Node {
    public final int index;
    public List<Transition> possibleTransitions;
    public Transition cheapestTransition;
    public Node nextNode;

    public Node(int index) {
        this.index = index;
    }

    public void setPossibleTransitions(List<Transition> transitionList) {
        if (index > 1) {
            this.possibleTransitions = transitionList;
            setCheapestTransition();
            nextNode = cheapestTransition.targetNode;
        }
    }

    private void setCheapestTransition(){
        if (possibleTransitions.size() == 1) {
            cheapestTransition = possibleTransitions.get(0);
        }
        else {
            int minCost = possibleTransitions.get(0).cost;
            Transition minTransition = possibleTransitions.get(0);
            for(int i=1; i<possibleTransitions.size(); i++){
                if(possibleTransitions.get(i).cost<minCost){
                    minCost = possibleTransitions.get(i).cost;
                    minTransition = new Transition(possibleTransitions.get(i));
                }
            }
            this.cheapestTransition=minTransition;
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Node {
    private final int index;
    private List<Transition> possibleTransitions=new ArrayList<>();
    private Transition cheapestTransition;
    private Node nextNode;

    public Node(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Node getNextNode(){
        return nextNode;
    }
    public List<Transition> getPossibleTransitions(){
        return possibleTransitions;
    }

    public void setPossibleTransitions(List<Transition> transitionList) {
        if (index > 1) {
            this.possibleTransitions = transitionList;
            setCheapestTransition();
            nextNode = cheapestTransition.targetNode;
        }
    }

    public Transition getCheapestTransition(){
        return cheapestTransition;
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

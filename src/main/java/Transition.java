import java.util.List;

public class Transition {
    public Node targetNode;
    public int cost;

    public Transition(Node targetNode, int cost){
        this.cost=cost;
        this.targetNode=targetNode;
    }

    public Transition(Transition t){
        this.cost=t.cost;
        this.targetNode=t.targetNode;
    }
}

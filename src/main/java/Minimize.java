import java.util.ArrayList;
import java.util.List;

public class Minimize {
    /*List<Transition> transitionsForN1 = new ArrayList<>();
    List<Transition> transitionsForN2 = new ArrayList<>();
    List<Transition> transitionsForN3 = new ArrayList<>();
    List<Transition> transitionsForN4 = new ArrayList<>();
    List<Transition> transitionsForN5 = new ArrayList<>();
    List<Transition> transitionsForN6 = new ArrayList<>();
    List<Transition> transitionsForN7 = new ArrayList<>();
    List<Node> allNodes = new ArrayList<>();
    public List<Node> myRoute = new ArrayList<Node>();

    public Minimize(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Transition from7to4 = new Transition(node4, 3);
        Transition from7to5 = new Transition(node5, 1);
        Transition from7to6 = new Transition(node6, 10);
        Transition from6to2 = new Transition(node2, 1);
        Transition from6to3 = new Transition(node3, 9);
        Transition from5to3 = new Transition(node3, 2);
        Transition from5to2 = new Transition(node2, 6);
        Transition from4to2 = new Transition(node2, 7);
        Transition from4to3 = new Transition(node3, 4);
        Transition from2to1 = new Transition(node1, 2);
        Transition from3to1 = new Transition(node1, 4);
        transitionsForN7.add(from7to4);
        transitionsForN7.add(from7to5);
        transitionsForN7.add(from7to6);
        transitionsForN6.add(from6to3);
        transitionsForN6.add(from6to2);
        transitionsForN5.add(from5to3);
        transitionsForN5.add(from5to2);
        transitionsForN4.add(from4to2);
        transitionsForN4.add(from4to3);
        transitionsForN3.add(from3to1);
        transitionsForN2.add(from2to1);
        node1.setPossibleTransitions(transitionsForN1);
        node2.setPossibleTransitions(transitionsForN2);
        node3.setPossibleTransitions(transitionsForN3);
        node4.setPossibleTransitions(transitionsForN4);
        node5.setPossibleTransitions(transitionsForN5);
        node6.setPossibleTransitions(transitionsForN6);
        node7.setPossibleTransitions(transitionsForN7);
        allNodes.add(node1);
        allNodes.add(node2);
        allNodes.add(node3);
        allNodes.add(node4);
        allNodes.add(node5);
        allNodes.add(node6);
        allNodes.add(node7);

    }*/

    public int minimumCost(List<Node> nodes) {
        int minSum = 0;
        Node nextTargetNode = nodes.get(nodes.size() - 1).nextNode;
        minSum += nodes.get(nodes.size() - 1).cheapestTransition.cost;
        System.out.println("min sum for step"+(nodes.get(nodes.size()-1).index)+" "+(nodes.get(nodes.size()-1).nextNode.index)+"="+minSum);
        for (int i = nodes.size() - 1; i >= 1; --i) {
            if (nodes.get(i) == nextTargetNode) {
                minSum += nodes.get(i).cheapestTransition.cost;
                nextTargetNode = nodes.get(i).nextNode;
                System.out.println("min sum for step"+(nodes.get(i).index)+" "+(nodes.get(i).nextNode.index)+"="+minSum);
            }
        }
        return minSum;
    }
}
//  public List<Node> route = new ArrayList<>();

    /*public List<Node> initializeMyRoute(List<Node> route, List<Transition> transitions, int n){
        for(int i=0; i<n;i++){
            route.add(new Node(i,));
        }
    }*/
   /* public List<Transition> setGraph(Transition... transitions){
        List<Transition> graph = new ArrayList<Transition>();
    }*/

    /*public int minimumCost(List<Node> nodes) {
        int minSum = 0;
        Node nextTargetNode = nodes.get(nodes.size()).nextNode;
        for (int i = nodes.size(); i > 0; i--) {
            if (nodes.get(i) == nextTargetNode) {
                for (int j = i - 1; j > 0; j--) {
                    if (nodes.get(j) == nodes.get(i).nextNode)
                        minSum = +nodes.get(j).cheapestTransition.cost;
                    nextTargetNode = nodes.get(j).nextNode;
                }
            }
        }
    }*/
    /*public Transition minimumTransition(Node node){
        int minCost = node.possibleTransitions.get(0).cost;
        Transition minTransition = null;
        for(int i=1; i<node.possibleTransitions.size(); i++){
            if(node.possibleTransitions.get(i).cost<minCost){
                minCost = node.possibleTransitions.get(i).cost;
                minTransition = new Transition(node.possibleTransitions.get(i));
            }
        }
        return minTransition;
    }*/
       /*for(int i=nodes.size(); i>0; i--) {
        Node nextTargetNode = nodes.get(i).nextNode;
        if (nodes.get(i) == nextTargetNode) {
            for (int j = i - 1; j > 0; j--) {
                if (nodes.get(j) == nextTargetNode)
                    minSum = +nodes.get(j).cheapestTransition.cost;
                nextTargetNode = nodes.get(j).nextNode;
            }
        }
    }*/


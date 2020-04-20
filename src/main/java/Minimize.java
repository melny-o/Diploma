import java.util.List;

public class Minimize {

    public int minimumCost(List<Node> nodes) {
        int minSum = 0;
        Node nextTargetNode = nodes.get(nodes.size() - 1).getNextNode();
        minSum += nodes.get(nodes.size() - 1).getCheapestTransition().cost;
        System.out.println(
                "While executing this program we will use the algorithm " +
                        "where we start finding cheapest transitions from the end of the route. \n" +
                        "Step1: find the cheapest transition from "+(nodes.get(nodes.size()-1).getIndex())+
                        " to "+(nodes.get(nodes.size()-1).getNextNode().getIndex())+
                        ". It's cost is "+minSum);
        for (int i = nodes.size() - 1; i >= 1; --i) {
            if (nodes.get(i).getIndex() == nextTargetNode.getIndex()) {
                minSum += nodes.get(i).getCheapestTransition().cost;
                nextTargetNode = nodes.get(i).getNextNode();
                System.out.println("Step"+i+": find the cheapest transition from "+(nodes.get(i).getIndex())+" to "+
                        (nodes.get(i).getNextNode().getIndex())+". It's cost is "+nodes.get(i).getCheapestTransition().cost);
            }
        }
        return minSum;
    }

}


package GET2018.com.metacube.DSA.Assignment6;

import java.util.List;
/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is main driver function of graph.
 * @author Chirag Jain
 *
 */
public class GraphMain
{
    public static void main(String args[]) {
        Graph graph = new Graph(4);
        
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);

        graph.printGraph();

        System.out.println(graph.isConnected());

        List<Integer> listOfReachable = graph.reachable(3);
        System.out.println(listOfReachable.toString());

        List<EdgeAndVertices> mst = graph.minimumSpanningTree();

        mst.forEach(mstList -> System.out.println(" Source: "
                + mstList.getSource() + " Destination: "
                + mstList.getDestination() + " Weight: " + mstList.getWeight()));


        List<EdgeAndVertices> spt = graph.shortestPath(0, 2);

        spt.forEach(sptList -> System.out.println(" Source : "
                + sptList.getSource() + " Destination : "
                + sptList.getDestination() + " Distance : " + sptList.getWeight()));

    }
}

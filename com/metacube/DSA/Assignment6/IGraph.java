package GET2018.com.metacube.DSA.Assignment6;

import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This interface declares functions for implementation of graph.
 * @author Chirag Jain
 *
 */
public interface IGraph
{   
    /**
     * Function to find if graph is connected or not.
     * @return true or false
     */
    public boolean isConnected();

    /**
     * Function to find list of reachable vertices from given vertex
     * @param vertex
     * @return list of reachable vertices.
     */
    public List<Integer> reachable(int vertex);

    /**
     * Function to find minimum spanning tree
     * @return list with minimum spanning tree edges and weight
     */
    public List<EdgeAndVertices> minimumSpanningTree();

    /**
     * Function to find shortest path
     * @param source from which path is to be find
     * @param destination to which path is to be traced
     * @return list of edges and their respective distance
     */
    public List<EdgeAndVertices> shortestPath(int source, int destination);
}

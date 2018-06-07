/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.dijkstra;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Tory
 * Date: 6/7/18
 * Time: 7:49 PM
 */
public class DijkstraTest {

    @Test
    public void test() {
        List<Vertex> vertexs = new ArrayList<Vertex>();
        Vertex a = new Vertex("A", 0);
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        vertexs.add(a);
        vertexs.add(b);
        vertexs.add(c);
        vertexs.add(d);
        vertexs.add(e);
        vertexs.add(f);
        int[][] edges = {
                {Integer.MAX_VALUE, 6, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {6, Integer.MAX_VALUE, 2, 5, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {3, 2, Integer.MAX_VALUE, 3, 4, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 5, 3, Integer.MAX_VALUE, 5, 3},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 5, Integer.MAX_VALUE, 5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, 5, Integer.MAX_VALUE}

        };
        Graph graph = new Graph(vertexs, edges);
        graph.printGraph();
        graph.search();

        Assert.assertEquals(5, b.getPath());
        Assert.assertEquals(3, c.getPath());
        Assert.assertEquals(6, d.getPath());
        Assert.assertEquals(7, e.getPath());
        Assert.assertEquals(9, f.getPath());
    }
}

package com.bappy4u;

import com.bappy4u.graph.graph;
import com.bappy4u.ricksGuiter.Guitar;

public class Main {

    public static void main(String[] args) {
        graph graph = new graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdges("A","B");
        graph.addEdges("B","A");
        graph.addEdges("B","C");
        graph.addEdges("A","C");

        graph.print();


        graph.removeNode("B");
        System.out.println("output after removing Node B");
        graph.addNode("A");
        graph.print();
    }
}

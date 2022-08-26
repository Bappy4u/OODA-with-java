package com.bappy4u.graph;


import java.util.*;

public class graph {
    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjancencyList = new HashMap<>();
    private class Node{
        String label;
        public Node(String label){
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }
    public graph(){
    }
    public void addNode(String label){
            var node = new Node(label);
            this.nodes.putIfAbsent(label, node);
            this.adjancencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdges(String from, String to){
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode==null || toNode==null){
            throw new IllegalArgumentException();
        }

        this.adjancencyList.get(fromNode).add(toNode);
    }

    public void print(){
        for (var source: adjancencyList.keySet()){
            var targets = adjancencyList.get(source);

            if (!targets.isEmpty()){
                System.out.println(source+" is connected to "+targets);
            }
        }
    }
    public void removeNode(String label){
        var node = this.nodes.get(label);
        if (node==null){
            return;
        }

        for (var adj : adjancencyList.keySet()){
            adjancencyList.get(adj).remove(node);
        }

        adjancencyList.remove(node);
        this.nodes.remove(node);
    }

    public void removeEdges(String from, String to){
        var fromNode = this.nodes.get(from);
        var toNode = this.nodes.get(to);

        if (fromNode==null || toNode==null){
            return;
        }

        for(var adj: adjancencyList.keySet()){
            this.adjancencyList.get(fromNode).remove(toNode);
        }
    }
}

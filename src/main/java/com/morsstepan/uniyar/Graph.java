package com.morsstepan.uniyar;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public int numberOfNodes;
    public List<Node> nodes = new ArrayList<>();

    public Graph() {

    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void setNumberOfNodes(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }
}

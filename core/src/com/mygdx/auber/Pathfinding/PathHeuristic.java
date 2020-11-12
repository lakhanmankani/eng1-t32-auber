package com.mygdx.auber.Pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;
import com.badlogic.gdx.math.Vector2;

public class PathHeuristic implements Heuristic<Node> {

    /* Returns the straight line distance from current node to the end node*/
    @Override
    public float estimate(Node node, Node endNode) {
        return Vector2.dst(node.x,node.y,endNode.x,endNode.y);
    }
}

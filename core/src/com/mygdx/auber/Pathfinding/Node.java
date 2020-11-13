package com.mygdx.auber.Pathfinding;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Node {
    public float x,y;

    public int index;

    public Node(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Setter for the index of the node, used for A* Indexed search
     * @param index The index to assign the node
     */
    public void setIndex(int index)
    {
        this.index = index;
    }

    /**
     * Renderer for the nodes, used for debugging purposes
     * @param shapeRenderer The shape renderer being used
     * @param batch The sprite batch being used
     * @param font The font to use
     */
    public void render(ShapeRenderer shapeRenderer, SpriteBatch batch, BitmapFont font){
        //Drawing the Circle which holds the node
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(.8f, .88f, .95f, 1);
        shapeRenderer.circle(x * 16, y * 16, 10);
        shapeRenderer.end();

        //Drawing the outline of the circle
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(0, 0, 0, 1);
        shapeRenderer.circle(x * 16, y * 16, 10);
        shapeRenderer.end();

        //Writing the nodes index in the circle
        batch.begin();
        font.setColor(0, 0, 0, 255);
        font.draw(batch, Integer.toString(index), x  * 16, y  * 16);
        batch.end();
    }
}
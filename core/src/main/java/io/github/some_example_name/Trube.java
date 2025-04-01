package io.github.some_example_name;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Trube {
    Texture texture;
    Vector2 position;
    int trubeHeight=935;
    int trubeWidth=250;
    Random rndOffsetY;




    boolean alive;
    private int trubSpeed=300;


    public Trube(Texture texture, Vector2 position, int trubSpeed) {

        this.rndOffsetY=new Random();
        this.texture = texture;
        this.position = position;
        this.trubSpeed = trubSpeed;

        this.position.y=rndOffsetY.nextInt(-(this.trubeHeight-100), -trubeHeight/2);



    }

//    public Trube() {
//        texture = new Texture("g1.png");
//        position = new Vector2(1900,-200);

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);



    }
    public void update(float dt) {
        position.x -= trubSpeed * dt;

        if (position.x < -(trubeWidth+50) ){
            position.x = 2300;
            this.position.y=this.rndOffsetY.nextInt(-(this.trubeHeight-100), -trubeHeight/2);
        }
    }
}

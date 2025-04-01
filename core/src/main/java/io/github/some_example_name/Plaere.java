package io.github.some_example_name;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Vector;

public class Plaere {

    static int length;
    Texture texture;
    Vector2 position;
    float t;
    boolean alive;


    public Plaere() {
        if(texture == null ) {
            texture = new Texture("r2.png");
        }
        position = new Vector2(500,500);
        t = 100;
        alive = true;


    }
    public void render(SpriteBatch batch){
        batch.draw(texture,position.x - 50,position.y - 34 );
    }
    public void update(float dt){
        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            position.y+= t * dt;
        }else{
            position.y-= t * dt;

        }
    }
    public void setup(Vector2 position){
        this.position.set(position);
        alive=true;
    }

    public void destrou(){
        alive = false;
    }


}

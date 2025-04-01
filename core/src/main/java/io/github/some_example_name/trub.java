package io.github.some_example_name;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class trub {
    Texture texture;
    Texture texture1;
    Vector2 position;
    Vector2 position2;
    Vector2 position3;
    Vector2 position4;
    Vector2 position5;
    Vector2 position6;
    Vector2 position7;
    Vector2 position8;
    boolean alive;
    private int trubSpeed=300;


    public trub() {
        texture = new Texture("g1.png");
        position = new Vector2(1900,-200);


        texture1 = new Texture("g.png");
        position2 = new Vector2(1900,900);


        texture = new Texture("g1.png");
        position3 = new Vector2(2500, 0);


        texture1 = new Texture("g.png");
        position4 = new Vector2(2500, 1100);


        texture = new Texture("g1.png");
        position5 = new Vector2(3100,-200);


        texture1 = new Texture("g.png");
        position6 = new Vector2(3100,900);


        texture = new Texture("g1.png");
        position7 = new Vector2(3700,300);


        texture1 = new Texture("g.png");
        position8 = new Vector2(3700,1400);



    }
    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x - 125, position.y - 467);
        batch.draw(texture1, position2.x - 125, position2.y- 467);
        batch.draw(texture, position3.x - 125, position3.y- 467);
        batch.draw(texture1, position4.x - 125, position4.y- 467);
        batch.draw(texture, position5.x- 125, position5.y- 467);
        batch.draw(texture1, position6.x- 125, position6.y- 467);
        batch.draw(texture, position7.x- 125, position7.y- 467);
        batch.draw(texture1, position8.x- 125, position8.y- 467);

    }
    public void update(float dt) {
        position.x-=trubSpeed * dt;
        position2.x-=trubSpeed * dt;
        position3.x-=trubSpeed * dt;
        position4.x-=trubSpeed * dt;
        position5.x-=trubSpeed * dt;
        position6.x-=trubSpeed * dt;
        position7.x-=trubSpeed * dt;
        position8.x-=trubSpeed * dt;

        if(position.x < - 100 ){
            position.x = 2300;
        }else if( position2.x < -100){
            position2.x = 2300;
        } else if ( position3.x < - 100) {
            position3.x = 2300;
        } else if ( position4.x < - 100) {
            position4.x = 2300;
        }else if ( position5.x < - 100) {
            position5.x = 2300;
        }else if ( position6.x < - 100) {
            position6.x = 2300;
        }else if ( position7.x < - 100) {
            position7.x = 2300;
        }else if ( position8.x < - 100) {
            position8.x = 2300;
        }


    }
    public void destrou(){
        alive = false;
    }

}

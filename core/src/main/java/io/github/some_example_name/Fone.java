package io.github.some_example_name;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Fone {
    Texture texture;
    Texture texture1;
    Vector2 position;
    Vector2 position1;
    //Vector2 position2;

    public Fone() {
        texture = new Texture("Fone.png");
//        texture = new Texture("backgroundRed.png");
        position = new Vector2(2860, 540);

        texture1 = new Texture("Fone1.png");
//        texture1 = new Texture("backgroundGreen.png");
        position1 = new Vector2( 960, 540);
        //position2 = new Vector2( 1, 540);
    }


    public void render(SpriteBatch batch) {
           batch.draw(texture, position.x - 960, position.y - 540  );
           batch.draw(texture1, position1.x - 960, position1.y - 540);
          // batch.draw(texture, position2.x - 960, position2.y - 540);
    }

    public void update(float dt) {
        position.x -= 500 * dt;
        position1.x -= 500 * dt;

        if (position.x <  - 960) {
            position.x = 2840;
        }
        else if( position1.x < -960) {
            position1.x = 2840;
        }
    }
}



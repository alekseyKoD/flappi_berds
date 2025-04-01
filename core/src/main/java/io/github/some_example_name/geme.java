package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** {@link ApplicationListener} implementation shared by all platforms. */
public class geme extends ApplicationAdapter {

    float g;
    float t;

    int gameSpeed=800;
    private SpriteBatch batch;
    Fone fone;
    Plaere pl;
    List<Trube> gameTrubes=new ArrayList<>();
    Trube trube1;
    Trube trube2;
    int spaceBetweenTrudes=600;
    int gamescreenWidth=1980;
    @Override
    public void create() {//инитилизация


        batch = new SpriteBatch();
        fone = new Fone();

        pl = new Plaere();

        for (int i = 0; i < gamescreenWidth/spaceBetweenTrudes+1; i++) {

            gameTrubes.add(
                new Trube(new Texture("g1.png"),new Vector2(gamescreenWidth+spaceBetweenTrudes*i,0),gameSpeed) );
     }
        System.out.println(gameTrubes.size());
    }

    @Override
    public void render() {//отрисовка
        float dt=Gdx.graphics.getDeltaTime();
        update(dt);

        ScreenUtils.clear(0, 0, 0, 1);
        g-=gameSpeed * dt;
        t-=gameSpeed * dt;

        batch.begin();
        fone.render(batch);
        pl.render(batch);

        for (Trube curTrube : gameTrubes){
            curTrube.render(batch);
        }
        batch.end();
    }

    public void update(float dt){
        fone.update(dt);
        //checkCollision();

        for (Trube curTrube : gameTrubes) {
            curTrube.update(dt);
            if (curTrube.position.x < -curTrube.trubeWidth) {
                curTrube=new Trube(new Texture("g1.png"), new Vector2(gamescreenWidth, 0), gameSpeed);
            }
        }
        pl.update(dt);
    }

    private void checkCollision() {

    }


    @Override
    public void dispose() {//освобождение ресурсов
        batch.dispose();
    }
}

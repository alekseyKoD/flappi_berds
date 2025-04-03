package io.github.some_example_name;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Trube {
    Texture texture;
    Vector2 position;
    int trubeHeight=2850;
    int trubeWidth=250;

    // расстояние от начала нижней трубы до просвета между трубами
    int bottomBorder=1380;

    // свободное расстояние между трубами по Y
    int freeSpace=210;


    // константа устанавливает примерный отрисовку текстуры по центру экрана
    final int OFFSET_Y=950;

    Random rndOffsetY=new Random();


    Vector2 tempPosition;
    Texture tempTexture;


    boolean alive;
    private int trubSpeed=300;


    public Trube(Texture texture, Vector2 position, int trubSpeed) {


        this.texture = texture;
        this.position = position;
        this.trubSpeed = trubSpeed;
        this.position.y= position.y-OFFSET_Y;

        this.tempTexture=new Texture("r2.png");
        this.tempPosition=new Vector2(this.position.x+100,position.y+bottomBorder);




    }

//    public Trube() {
//        texture = new Texture("g1.png");
//        position = new Vector2(1900,-200);

    public void render(SpriteBatch batch) {
       batch.draw(texture, position.x, position.y);
       batch.draw(tempTexture, tempPosition.x,tempPosition.y);




    }

    public void setRandomYPosition(int yCoordOffset){
        // yCoordOffset - сдвиг по координате y  для определения стартовой точки отрисовки
        this.position.y+=this.rndOffsetY.nextInt(-yCoordOffset, yCoordOffset);

    }
    public void update(float dt) {
        position.x -= trubSpeed * dt;
        tempPosition.x-=trubSpeed*dt;
        if (position.x < -(trubeWidth+50) ){
            position.x = 2300;

        }
    }
}

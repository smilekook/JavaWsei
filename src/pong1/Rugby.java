package pong1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;

public class Rugby extends Kulka{
    private double rx;
    private double ry;
    protected  double omega;
    protected  double rot;
    Rugby(double xPos, double yPos, double xSpeed, double ySpeed, double rx, double ry, double omega) {
        super(xPos, yPos, xSpeed, ySpeed);
        this.rx = rx;
        this.ry = ry;
        this.omega=omega;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.save();
        gc.setFill(color);
        gc.transform(new Affine(new Rotate(rot, xPos, yPos)));
        gc.fillOval(xPos - rx, yPos - ry, 2 * rx, 2 * ry);
        gc.restore();
    }
    @Override
    public void update(){
        super.update();
        rot += omega;
        System.out.printf("rotation: %f\n", rot);
    }
    @Override
    public void checkBoundryCollision(double xLeft, double yTop, double xRight, double yBottom) {
        if ((xPos - rx <= xLeft) || ((xPos + rx >= xRight))) {
            xSpeed = -xSpeed;
        }
        if ((yPos - ry <= yTop) || (yPos + ry >= yBottom)) {
            ySpeed = -ySpeed;
        }
    }

}

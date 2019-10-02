public class MovablePoint  extends Point{
    private float xSpeed ,ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float v, float v1, float v2, float v3) {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed =ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public float [] getSpeed(){
        float array [] = new float[2];
        array[0] =getxSpeed();
        array[1] =getySpeed();
        return array;
    }
    public String move(){
        setX(++this.xSpeed);
        setY(++this.ySpeed);
        return ( "x ="+getX()+"y = "+ getY());
    }
    public String toString(){
        return "MovablePoint : Speed X = "+getySpeed()
                + super.toString();

    }
}

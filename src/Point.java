public class Point {
    private  float x,y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public  void  setXY(float x, float y){
        this.x =x ;
        this.y =y;

    }
    public float [] getXY(){
        float [] array = new float[2];
        array[0] = getX();
        array[1] =getY();
        return  array;
    }
    public String toString(){

        return "ponit  x :"
                +getX()
                +"y : "+getY();
    }
}
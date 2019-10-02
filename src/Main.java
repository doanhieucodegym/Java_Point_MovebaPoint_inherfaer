public class Main {
    public static void main(String[] args) {
        Point point2D=new Point();
        System.out.println(point2D);

        point2D=new Point(2.5f,3.5f );
        System.out.println(point2D);

        MovablePoint moveablePoint =new MovablePoint();
        System.out.println(moveablePoint);

        moveablePoint =new MovablePoint(2f,2f);
        System.out.println(moveablePoint);

        moveablePoint =new MovablePoint(2f,2f,2f,3.5f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}

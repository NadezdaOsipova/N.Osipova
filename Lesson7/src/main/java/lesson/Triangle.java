package lesson;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("I  draw lesson.Triangle");
    }

    @Override
    public void erase() {
        System.out.println("I erase lesson.Triangle");
    }
}

package lesson;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("I  draw lesson.Circle");
    }

    @Override
    public void erase() {
        System.out.println("I erase lesson.Circle");
    }
}

package lesson;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("I  draw lesson.Square");
    }

    @Override
    public void erase() {
        System.out.println("I erase lesson.Square");
    }
}

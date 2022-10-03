package lesson_1;

public class Cat implements Team {
    private int jumpHeight;
    private int runLength;

    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height >= jumpHeight) {
            System.out.println("Я кот, я не смог перепрыгнуть!");
        } else {
            System.out.println("Я кот, я смог перепрыгнуть!");
        }
    }

    @Override
    public void run(int length) {
        if (length >= runLength) {
            System.out.println("Я кот, я не смог пробежать!");
        } else {
            System.out.println("Я кот, я смог пробежать через весь лес!");
        }
    }
}

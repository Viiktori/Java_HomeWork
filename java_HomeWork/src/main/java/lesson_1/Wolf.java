package lesson_1;

public class Wolf implements Team {
    private int jumpHeight;
    private int runLength;

    public Wolf(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height >= jumpHeight) {
            System.out.println("Я волк, я не буду перепрыгивать!");
        } else {
            System.out.println("Волк смог перепрыгнуть!");
        }
    }

    @Override
    public void run(int length) {
        if (length >= runLength) {
            System.out.println("Волк убежал за зайцем!");
        } else {
            System.out.println("Волк пробежал через весь лес!");
        }
    }
}

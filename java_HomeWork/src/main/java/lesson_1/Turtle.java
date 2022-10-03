package lesson_1;

public class Turtle implements Team {
    private int jumpHeight;
    private int runLength;

    public Turtle(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height >= jumpHeight) {
            System.out.println("Я черепаха, я лучше стену обойду, чем перепрыгну!");
        } else {
            System.out.println("Хоть я и черепаха, я перепрыгнула!");
        }
    }

    @Override
    public void run(int length) {
        if (length >= runLength) {
            System.out.println("Я черепаха, я заблудилась в лесу!");
        } else {
            System.out.println("Я черепаха и я быстро бегаю!");
        }
    }
}

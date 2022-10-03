package lesson_1;

public class Forest implements Course {
    private int length;

    public Forest(int length) {
        this.length = length;
    }

    public void overcome(Team team) {
        team.run(length);
    }
}

package lesson_1;

public class Track implements Course {
    private int height;

    public Track(int height) {
        this.height = height;
    }

    public void overcome(Team team) {
        team.jump(height);
    }
}

package lesson_1;

public class Main {

    public static void main(String[] args) {
        Team[] teams = {new Cat(15, 51), new Turtle(1, 50),
                new Wolf(17, 35)};

        Course[] courses = {new Track(15), new Forest(50)};

        String nameTeam = ("AnimalsTeam: Cat,  Wolf, Turtle") ;
        System.out.println(nameTeam);
        for (Team team : teams) {
            for (Course course : courses) {
                course.overcome(team);
            }
        }
    }
}

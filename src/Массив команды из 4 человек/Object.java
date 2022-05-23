package Lesson1;


import Lesson1.Competitor.Cat;
import Lesson1.Competitor.Dog;
import Lesson1.Competitor.Human;
import Lesson1.Competitor.Team;
import Lesson1.Course.Course;
import Lesson1.Course.Cross;
import Lesson1.Course.Wall;
import Lesson1.Course.Water;

public class Object {

    public static void main(String[] args){
        Course course1 = new Course(new Cross(300), new Wall(2),
                new Cross(800), new Water(5));

        Team team1 = new Team("Team 1", new Human("Adam"), new Cat("Pushok"),
                new Dog("Linda"), new Dog("Sharik"));

        Team team2 = new Team("Team 2", new Human("Bella"), new Cat("Frank"),
                new Dog("Tom"), new Dog("Chip"));


        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n===== RESULTS =====\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}



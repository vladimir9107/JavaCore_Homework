package Lesson1.Course;

import Lesson1.Competitor.Competitor;
import Lesson1.Course.Obstacle;

public class Cross extends Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}
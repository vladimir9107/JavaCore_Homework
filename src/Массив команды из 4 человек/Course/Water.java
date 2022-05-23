package Lesson1.Course;

import Lesson1.Competitor.Competitor;
import Lesson1.Course.Obstacle;

public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}
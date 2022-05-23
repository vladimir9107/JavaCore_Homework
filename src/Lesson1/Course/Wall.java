package Lesson1.Course;

import Lesson1.Competitor.Competitor;
import Lesson1.Course.Obstacle;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

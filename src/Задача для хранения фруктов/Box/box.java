package Lesson3.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


    public class box<T extends Fruit> {

        private ArrayList<T> list;

        public box() {
            this.list = new ArrayList<>();
        }

        @SafeVarargs
        public box(T... fruits) {
            this.list = new ArrayList<>(Arrays.asList(fruits));
        }

        public float getWeight() {
            float weight = 0.0f;

            for (T o : list) {
                weight += o.getWeight();
            }

            return weight;
        }

        public void pour(box<T> another) {
            another.list.addAll(list);
            list.clear();
        }

        public void add(T fruit) {
            list.add(fruit);
        }

        public void add(Collection<T> fruit) {
            list.addAll(fruit);
        }

        public boolean compare(box<?> o) {


            return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
        }
    }


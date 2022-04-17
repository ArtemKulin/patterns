package ru.kulinartem.patterns.state;

import java.util.ArrayList;
import java.util.List;

public class Developer {

    private List<Activity> activities = new ArrayList<>();
    private int counter;

   public Developer() {
       activities.add(new Coding());
       activities.add(new Eating());
       activities.add(new Reading());
       activities.add(new Sleeping());
   }

   public void addActivity(Activity activity) {
       activities.add(activity);
   }

    public void changeActivity() {
       if (counter < activities.size()) {
           activities.get(counter).justDoIt();
       } else {
           counter = 0;
           activities.get(counter).justDoIt();
       }
       counter++;
    }

}

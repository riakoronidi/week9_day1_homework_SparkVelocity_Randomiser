package models;

import java.util.ArrayList;
import java.util.Collections;

public class RandomName {

    private ArrayList<String> names;

    public RandomName() {
        this.names = new ArrayList<>();
        names.add("Ria");
        names.add("Maria");
        names.add("Dora");
        names.add("Georgia");
        names.add("Chris");
        names.add("Colin");
        names.add("Adam");
        names.add("Lazy");
    }

    public String getItemFromList() {
        Collections.shuffle(names);
        return names.get(0);
    }

    public String getPairFromList(){
        Collections.shuffle(names);
        ArrayList<String> pairedNames = new ArrayList<>(names.subList(0,2));
        return pairedNames.toString().replace("[","").replace("]","").replace(","," and ").trim();
    }

    public String getThreeItemsFromList(){
        Collections.shuffle(names);
        ArrayList<String> threeNames = new ArrayList<>(names.subList(0,3));
        return threeNames.toString().replace("[","").replace("]","").trim();
    }

    public String getFourItemsFromList(){
        Collections.shuffle(names);
        ArrayList<String> fourNames = new ArrayList<>(names.subList(0,4));
        return fourNames.toString().replace("[","").replace("]","").trim();
    }

    public int getSizeFromList(){
        return names.size();
    }
}

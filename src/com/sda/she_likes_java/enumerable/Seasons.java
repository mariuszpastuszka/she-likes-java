package com.sda.she_likes_java.enumerable;

// enum is class with restricted number of instances
public enum Seasons {
    WINTER(-5, "skiing"),
    SUMMER(25, "running"),
    SPRING(10, "sleeping"),
    AUTUMN(5, "walking");

    private int averageTemp;
    private String activity;

    public String getActivity() {
        return activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    private Seasons(int averageTemp, String activity) {
        this.averageTemp = averageTemp;
        this.activity = activity;
    }
}

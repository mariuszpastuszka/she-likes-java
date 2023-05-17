package com.sda.she_likes_java.enumerable;

public class ProgrammersStatesClass {
    public static final ProgrammersStatesClass GOD_MODE =
            new ProgrammersStatesClass("I can do everything:)");
    public static final ProgrammersStatesClass EXHAUSTED =
            new ProgrammersStatesClass("Bang the wall:(");
    public static final ProgrammersStatesClass NORMAL =
            new ProgrammersStatesClass("yeah it's just life");

    private static ProgrammersStatesClass[] value() {

        ProgrammersStatesClass[] values = new ProgrammersStatesClass[3];
        values[0] = GOD_MODE;
        values[1] = EXHAUSTED;
        values[2] = NORMAL;
        return values;
    }

    String description;

    public String getDescription() {
        return description;
    }

    private ProgrammersStatesClass(String description) {
        this.description = description;
    }
}

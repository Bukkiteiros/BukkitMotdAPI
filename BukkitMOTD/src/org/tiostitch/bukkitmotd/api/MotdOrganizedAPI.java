package org.tiostitch.bukkitmotd.api;

import org.tiostitch.bukkitmotd.Main;

public class MotdOrganizedAPI {
    private static String line1;
    private static String line2;
    private static MotdState state;

    public MotdOrganizedAPI(MotdState state) {
        MotdOrganizedAPI.state = state;
        Main.usingState = UsingState.ORGANIZED_API;
    }

    public static String getLine1() {
        return line1 + "\n";
    }

    public static String getLine2() {
        return line2;
    }

    public void setLine1(String line1) {
        MotdOrganizedAPI.line1 = line1;
    }

    public void setLine2(String line2) {
        MotdOrganizedAPI.line2 = line2;
    }

    public static MotdState getState() {
        return state;
    }
}

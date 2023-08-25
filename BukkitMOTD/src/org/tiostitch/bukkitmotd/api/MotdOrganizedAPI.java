package org.tiostitch.bukkitmotd.api;

import org.bukkit.Bukkit;
import org.tiostitch.bukkitmotd.Main;
import org.tiostitch.bukkitmotd.MotdEvents;

import java.util.List;

public class MotdOrganizedAPI {
    private static String line1;
    private static String line2;
    private static MotdState state;

    public MotdOrganizedAPI(MotdState state) {
        MotdOrganizedAPI.state = state;
        Main.usingState = UsingState.ORGANIZED_API;
    }

    public void setAnimatedList1(List<String> list) {
        MotdEvents.animateLine1 = list;
    }
    public void setAnimatedList2(List<String> list) {
        MotdEvents.animateLine2 = list;
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

    public static String getText(String text) {
        return text
                .replace("{online}", String.valueOf(Bukkit.getOnlinePlayers().size()))
                .replace("{version}", Bukkit.getBukkitVersion())
                .replace("{ip}", Bukkit.getIp());
    }

    public static MotdState getState() {
        return state;
    }
}

package org.tiostitch.bukkitmotd.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.ServerListPingEvent;
import org.tiostitch.bukkitmotd.Main;
import org.tiostitch.bukkitmotd.MotdEvents;

import java.util.List;

public class MotdAPI {

    private static String line1;
    private static String line2;
    private static MotdState state;

    public MotdAPI(String line1, String line2, MotdState state) {
        MotdAPI.line1 = line1;
        MotdAPI.line2 = line2;
        MotdAPI.state = state;
        Main.usingState = UsingState.GENERAL_API;
    }

    public MotdAPI(List<String> line1, List<String> line2, MotdState state) {
        if (state == MotdState.ANIMATED) {
            MotdEvents.animateLine1 = line1;
            MotdEvents.animateLine2 = line2;

            MotdAPI.state = state;
            Main.usingState = UsingState.GENERAL_API;
            return;
        }
        MotdAPI.line1 = "§cLinha mal colocada! Tipo inválido!";
        MotdAPI.line2 = "§cLinha mal colocada! Tipo inválido!";

        MotdAPI.state = state;
        Main.usingState = UsingState.GENERAL_API;
    }

    public static MotdState getState() {
        return state;
    }

    public static String getLine1() {
        return line1 + "\n";
    }

    public static String getLine2() {
        return line2;
    }

    public static String getText(String text) {
        return text
                .replace("{online}", String.valueOf(Bukkit.getOnlinePlayers().size()))
                .replace("{version}", Bukkit.getBukkitVersion())
                .replace("{ip}", Bukkit.getIp());
    }
}

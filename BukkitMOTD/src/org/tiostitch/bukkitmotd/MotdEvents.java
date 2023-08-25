package org.tiostitch.bukkitmotd;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.tiostitch.bukkitmotd.api.MotdAPI;
import org.tiostitch.bukkitmotd.api.MotdOrganizedAPI;
import org.tiostitch.bukkitmotd.api.MotdState;
import org.tiostitch.bukkitmotd.api.UsingState;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MotdEvents implements Listener {

    public static List<String> animateLine1 = new ArrayList<>();
    public static List<String> animateLine2 = new ArrayList<>();

    @EventHandler
    public void onMOTDStart(ServerListPingEvent event) {
        if (Main.usingState == UsingState.ORGANIZED_API) {
            switch (MotdOrganizedAPI.getState()) {
                case STATIC:
                    event.setMotd(MotdOrganizedAPI.getText(MotdOrganizedAPI.getLine1()) + MotdOrganizedAPI.getText(MotdOrganizedAPI.getLine2()));
                    break;
                case UNCOLOR:
                    event.setMotd(ChatColor.RESET + MotdOrganizedAPI.getText(MotdOrganizedAPI.getLine1()) + ChatColor.RESET + MotdOrganizedAPI.getText(MotdOrganizedAPI.getLine2()));
                    break;
                case ANIMATED:
                    MotdOrganizedAPI organizedAPI = new MotdOrganizedAPI(MotdState.ANIMATED);
                    organizedAPI.setLine1(generateAnimated1());
                    organizedAPI.setLine2(generateAnimated2());
                    event.setMotd(MotdOrganizedAPI.getLine1() + MotdOrganizedAPI.getLine2());
                    break;
            }
        } else if (Main.usingState == UsingState.GENERAL_API) {
            switch (MotdAPI.getState()) {
                case STATIC:
                    event.setMotd(MotdAPI.getText(MotdAPI.getLine1()) + MotdAPI.getText(MotdAPI.getLine2()));
                    break;
                case UNCOLOR:
                    event.setMotd(ChatColor.RESET + MotdAPI.getText(MotdAPI.getLine1()) + ChatColor.RESET + MotdAPI.getText(MotdAPI.getLine2()));
                    break;
                case ANIMATED:
                    event.setMotd(MotdAPI.getLine1() + MotdAPI.getLine2());
                    break;
            }
        }
    }


    public static String generateAnimated1() {
        Random rnd = new Random();

        int pos = rnd.nextInt(animateLine1.size());

        return animateLine1.get(pos);
    }

    public static String generateAnimated2() {
        Random rnd = new Random();

        int pos = rnd.nextInt(animateLine2.size());

        return animateLine2.get(pos);
    }
}

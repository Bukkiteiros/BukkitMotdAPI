package org.tiostitch.bukkitmotd;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.tiostitch.bukkitmotd.api.MotdAPI;
import org.tiostitch.bukkitmotd.api.MotdOrganizedAPI;
import org.tiostitch.bukkitmotd.api.UsingState;

public class MotdEvents implements Listener {

    @EventHandler
    public void onMOTDStart(ServerListPingEvent event) {
        if (Main.usingState == UsingState.ORGANIZED_API) {
            switch (MotdOrganizedAPI.getState()) {
                case STATIC:
                    event.setMotd(MotdOrganizedAPI.getLine1() + MotdOrganizedAPI.getLine2());
                    break;
                case UNCOLOR:
                    event.setMotd(ChatColor.RESET + MotdOrganizedAPI.getLine1() + ChatColor.RESET + MotdOrganizedAPI.getLine2());
                    break;
            }
        } else if (Main.usingState == UsingState.GENERAL_API) {
            switch (MotdAPI.getState()) {
                case STATIC:
                    event.setMotd(MotdAPI.getLine1() + MotdAPI.getLine2());
                    break;
                case UNCOLOR:
                    event.setMotd(ChatColor.RESET + MotdAPI.getLine1() + ChatColor.RESET + MotdAPI.getLine2());
                    break;
            }
        }
    }
}

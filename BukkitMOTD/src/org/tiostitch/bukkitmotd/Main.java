package org.tiostitch.bukkitmotd;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.tiostitch.bukkitmotd.api.MotdAPI;
import org.tiostitch.bukkitmotd.api.MotdOrganizedAPI;
import org.tiostitch.bukkitmotd.api.MotdState;
import org.tiostitch.bukkitmotd.api.UsingState;

public class Main extends JavaPlugin {

    private Main plugin;
    public static UsingState usingState;

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getConsoleSender().sendMessage("\na-----------------------" +
                "\n  §b§lBUKKIT MOTD" +
                "\n" +
                "\n §7State: §aON" +
                "\n §7Estado: §aLigado!" +
                "\n" +
                "\n§a-----------------------" +
                "\n");

        Bukkit.getPluginManager().registerEvents(new MotdEvents(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("\na-----------------------" +
                "\n  §b§lBUKKIT MOTD" +
                "\n" +
                "\n §7State: §cOFF" +
                "\n §7Estado: §cDesligado!" +
                "\n" +
                "\n§a-----------------------" +
                "\n");
    }

    public Main getInstance() {
        return plugin;
    }
}

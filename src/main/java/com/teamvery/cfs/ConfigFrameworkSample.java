package com.teamvery.cfs;

import com.teamvery.configframework.cfg;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ConfigFrameworkSample extends JavaPlugin {

    public static String plugin_name = "Config-Framework-Sample";
    public static String conf = "config.yml";
    public static String work = "work.yml";

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("reload")).setExecutor(new Reload());

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        cfg.makeData(plugin_name, conf);
        cfg.makeData(plugin_name, work);

        if (cfg.get(plugin_name, conf).getBoolean("활성화")) {
            getLogger().info(ChatColor.GREEN + "Config Framework Sample Plugin WORK!");
        } else {
            getLogger().info(ChatColor.RED + "Config Framework Sample Plugin NOT!!! WORK!");
        }
        if (!cfg.get(plugin_name, work).getBoolean("테스트")) {
            getLogger().info(ChatColor.RED + "Nice NOT!! Work!");
        } else {
            getLogger().info(ChatColor.GREEN + "NiceWork!");
        }
    }
}

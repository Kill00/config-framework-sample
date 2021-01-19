package com.teamvery.configframeworksample;

import com.teamvery.configframework.cfg;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigFrameworkSample extends JavaPlugin {

    String plugin_name = this.getName();
    String config = "config.yml";
    String work = "work.yml";

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        cfg.makeData(plugin_name, config);
        cfg.makeData(plugin_name, work);

        if (cfg.get(plugin_name, config).getBoolean("활성화")) {
            getLogger().info(ChatColor.GREEN + "Config Framework Sample Plugin WORK!");
        } else {
            getLogger().info(ChatColor.RED + "Config Framework Sample Plugin NOT!!! WORK!");
        }
        if (!cfg.get(plugin_name, work).getBoolean("니")) {
            getLogger().info(ChatColor.RED + "Nice NOT!! Work!");
        } else {
            getLogger().info(ChatColor.GREEN + "NiceWork!");
        }
    }
}

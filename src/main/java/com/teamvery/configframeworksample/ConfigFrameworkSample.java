package com.teamvery.configframeworksample;

import com.teamvery.configframework.cfg;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigFrameworkSample extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        cfg.makeData("Config-Framework-Sample", "config.yml");
        cfg.makeData("Config-Framework-Sample", "work.yml");

        if (cfg.get("Config-Framework-Sample", "config.yml").getBoolean("활성화")) {
            getLogger().info(ChatColor.GREEN + "Config Framework Sample Plugin WORK!");
        } else {
            getLogger().info(ChatColor.RED + "Config Framework Sample Plugin NOT!!! WORK!");
        }
        if (!cfg.get("Config-Framework-Sample", "work.yml").getBoolean("니")) {
            getLogger().info(ChatColor.RED + "Nice NOT!! Work!");
        } else {
            getLogger().info(ChatColor.GREEN + "Nice NOT!! Work!");
        }
    }
}

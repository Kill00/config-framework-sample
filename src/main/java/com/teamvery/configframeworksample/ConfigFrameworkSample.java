package com.teamvery.configframeworksample;

import com.teamvery.configframework.Conf;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigFrameworkSample extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        Conf.makeData("Config-Framework-Sample", "config.yml");
        Conf.makeData("Config-Framework-Sample", "work.yml");

        if (Conf.get("Config-Framework-Sample", "config.yml").getBoolean("활성화")) {
            getLogger().info("Config Framework Sample Plugin WORK!");
        }
        if (!Conf.get("Config-Framework-Sample", "work.yml").getBoolean("니")) {
            getLogger().info("NiceWork!");
        }
    }
}

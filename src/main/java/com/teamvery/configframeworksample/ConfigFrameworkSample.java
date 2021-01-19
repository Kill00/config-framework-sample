package com.teamvery.configframeworksample;

import com.teamvery.configframework.cfg;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigFrameworkSample extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        cfg.makeData("Config-Framework-Sample", "config.yml");
        cfg.makeData("Config-Framework-Sample", "work.yml");

        if (cfg.get("Config-Framework-Sample", "config.yml").getBoolean("활성화")) {
            getLogger().info("Config Framework Sample Plugin WORK!");
        }
        if (!cfg.get("Config-Framework-Sample", "work.yml").getBoolean("니")) {
            getLogger().info("NiceWork!");
        }
    }
}

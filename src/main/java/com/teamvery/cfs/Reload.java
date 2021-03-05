package com.teamvery.cfs;

import com.teamvery.configframework.cfg;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static com.teamvery.cfs.ConfigFrameworkSample.*;

public class Reload implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

        cfg.reload(plugin_name, conf);
        if (!(sender instanceof Player)) {
            System.out.println("§a리로드가 완료되었습니다!");
        } else {
            Player player = (Player) sender;
            player.sendMessage("§a리로드가 완료되었습니다!");
        }

        if (cfg.get(plugin_name, conf).getBoolean("활성화")) {
            System.out.println(ChatColor.GREEN + "Config Framework Sample Plugin WORK!");
        } else {
            System.out.println(ChatColor.RED + "Config Framework Sample Plugin NOT!!! WORK!");
        }
        if (!cfg.get(plugin_name, work).getBoolean("테스트")) {
            System.out.println(ChatColor.RED + "Nice NOT!! Work!");
        } else {
            System.out.println(ChatColor.GREEN + "NiceWork!");
        }
        return false;
    }
}

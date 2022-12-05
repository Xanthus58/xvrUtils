package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.XvrUtils;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.Properties;
import java.util.logging.Logger;

public class JailCommand extends SubCommand {
    Properties props = new Properties();
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    public String getName() {
        return "jail";
    }

    public String getDescription() {
        return "Teleports you to the jail!";
    }

    public String getSyntax() {
        return "/warp jail";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();
            World world = player.getWorld();

            location.setX(201);
            location.setY(68);
            location.setZ(-7322);

            player.teleport(location);
            player.sendMessage(ChatColor.GREEN + "[XVR Utils]" + " You have been teleported to the roof of the mansion!");
            logger.info(ChatColor.GREEN + "[XVR Utils]" + player.getName() + " has used the /tp roof command! Teleporting to the roof of the mansion!");
        } else {
            player.sendMessage(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "A non-player has tried to use the /tp roof command!");
        }
    }
}

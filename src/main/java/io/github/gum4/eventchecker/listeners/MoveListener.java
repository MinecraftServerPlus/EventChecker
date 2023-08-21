package io.github.gum4.eventchecker.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.permissions.Permission;

public class MoveListener implements Listener {

    public boolean activated = true;

    @EventHandler (priority = EventPriority.MONITOR)
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (activated) {
            player.sendMessage(
                    Component.text("===========[Event Checker]===========")
                            .appendNewline()
                            .append(Component.text("Name: " + event.getEventName()))
                            .appendNewline()
                            .append(Component.text("Player: " + player.getName()))
                            .appendNewline()
                            .append(Component.text("From Location: " + event.getFrom()))
                            .appendNewline()
                            .append(Component.text("To Location: " + event.getTo()))
                            .appendNewline()
                            .append(Component.text("From Block: " + event.getFrom().getBlock()))
                            .appendNewline()
                            .append(Component.text("To Block: " + event.getTo().getBlock()))
                            .appendNewline()
                            .append(Component.text("================================="))
            );
        }
    }
}

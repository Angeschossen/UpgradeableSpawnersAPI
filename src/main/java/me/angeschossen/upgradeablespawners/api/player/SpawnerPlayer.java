package me.angeschossen.upgradeablespawners.api.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface SpawnerPlayer {
    /**
     * Get the UUID of a player.
     *
     * @return UUID
     */
    @NotNull UUID getUUID();

    /**
     * Get the Bukkit player instance.
     *
     * @return Bukkit player
     */
    @NotNull
    Player getPlayer();
}

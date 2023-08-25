package me.angeschossen.upgradeablespawners.api.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface SpawnerPlayer {
    @NotNull UUID getUID();

    Player getPlayer();
}

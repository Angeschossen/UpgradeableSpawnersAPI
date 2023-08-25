package me.angeschossen.upgradeablespawners.api.spawner.world;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

public interface SpawnerWorld {
    @NotNull World getWorld();

    @NotNull String getName();
}

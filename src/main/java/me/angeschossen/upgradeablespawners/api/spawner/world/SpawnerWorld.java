package me.angeschossen.upgradeablespawners.api.spawner.world;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * Holds information about a world, where upgradeable spawners are enabled.
 */
public interface SpawnerWorld {
    /**
     * Get the Bukkit world instance.
     * @return Bukkit world
     */
    @NotNull World getWorld();

    /**
     * Get the name of this world.
     * @return same as Bukkit's world.getName()
     */
    @NotNull String getName();
}

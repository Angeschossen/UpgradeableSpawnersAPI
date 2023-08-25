package me.angeschossen.upgradeablespawners.api.blockwork;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a position in a loaded world.
 */
public interface Coordinate {
    /**
     * Get block x position.
     *
     * @return block x
     */
    int getX();

    /**
     * Get block y position.
     *
     * @return block y
     */
    int getY();

    /**
     * Get block z position.
     *
     * @return block z
     */
    int getZ();

    /**
     * Get chunk X identifier.
     * @return chunk X
     */
    int getChunkX();

    /**
     * Get chunk Z identifier.
     * @return chunk Z
     */
    int getChunkZ();

    /**
     * Get the world of this coordinate.
     * @return never null
     */
    @NotNull World getWorld();

    /**
     * Creates a new location instance.
     * @return coordinate to location
     */
    @NotNull Location toLocation();
}

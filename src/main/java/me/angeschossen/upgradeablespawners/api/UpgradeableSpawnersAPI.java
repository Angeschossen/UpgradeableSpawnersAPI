package me.angeschossen.upgradeablespawners.api;

import me.angeschossen.upgradeablespawners.api.spawner.Spawner;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class UpgradeableSpawnersAPI {

    private UpgradeableSpawnersAPI() {

    }

    /**
     * Check wheter or not an entity was spawned by an upgradeable spawner.
     * The identification is persistent.
     *
     * @param entity The entity
     * @return true, if spawned by an upgradeable spawner.
     */
    public static boolean isSpawnedBySpawner(@NotNull Entity entity) {
        Objects.requireNonNull(entity, "entity can't be null");
        return false;
    }

    /**
     * Get an upgradeable spawner by at a location.
     *
     * @param location The location
     * @return null, if the block at the given location is no upgradeable spawner.
     */
    @Nullable
    public static Spawner getSpawner(@NotNull Location location) {
        Objects.requireNonNull(location, "location can't be null");

        return null;
    }

    /**
     * Get an upgradeable spawner from a block.
     *
     * @param block The location
     * @return null, if the block is no spawner or no upgradeable spawner.
     */
    @Nullable
    public static Spawner getSpawner(@NotNull Block block) {
        Objects.requireNonNull(block, "block can't be null");

        return null;
    }
}

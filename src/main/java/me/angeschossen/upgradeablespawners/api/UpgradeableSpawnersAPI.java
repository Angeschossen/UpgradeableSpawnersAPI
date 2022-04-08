package me.angeschossen.upgradeablespawners.api;

import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

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
}

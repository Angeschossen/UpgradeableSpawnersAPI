package me.angeschossen.upgradeablespawners.api.spawner.flags;

import me.angeschossen.upgradeablespawners.api.spawner.level.UpgradeType;


/**
 * Displays the spawner's current status.
 */
public enum SpawnerStatus {
    /**
     * The spawner is spawning entities.
     */
    RUNNING(false),
    /**
     * The spawner is paused, because it reached the maximum amount of entities of level {@link UpgradeType#PERIOD_AMOUNT}.
     */
    PAUSED_PERIOD_AMOUNT(true),
    /**
     * Spawner is paused, because there are too many living entities, no matter of which type, around this spawner.
     * The server can configure a radius of chunks around the spawner for this limit. This isn't bound to a level.
     */
    PAUSED_AREA_MAX_ENTITIES(true),
    /**
     * Spawner is paused by the system. Usually if the chunk is not loaded.
     */
    PAUSED(false),
    /**
     * Spawner has been paused by a player.
     */
    PAUSED_MANUALLY(false),
    /**
     * Spawner is paused, because there are too many entities of the same time around the spawner.
     * This depends on {@link UpgradeType#NEARBY_ENTITIES}.
     */
    PAUSED_NEARBY_ENTITIES(false),
    /**
     * Spawner is paused, because it receives a redstone signal.
     */
    PAUSED_REDSTONE_SIGNAL(false);

    public final boolean holoUpd;

    SpawnerStatus(boolean holoUpd) {
        this.holoUpd = holoUpd;
    }
}

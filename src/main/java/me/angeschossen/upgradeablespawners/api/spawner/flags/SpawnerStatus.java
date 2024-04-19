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
     * Spawner is paused has been placed, but isn't initialized yet.
     * This should only appear in the first few ticks after the spawner placement or at chunk load.
     */
    PAUSED_NOT_INITIALIZED(false),
    /**
     * A new spawner instance has been loaded from the database and has replaced the current one.
     */
    PAUSED_INSTANCE_REPLACED(false),
    /**
     * Spawner is paused because the chunk is unloaded.
     */
    PAUSED_CHUNK_UNLOADED(false),
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
    PAUSED_REDSTONE_SIGNAL(false),
    /**
     * Spawner is paused, because butcher mode is configured to require an upgradeable hopper placed below it.
     */
    PAUSED_BUTCHER_HOPPER_MISSING(false);

    public final boolean holoUpd;

    SpawnerStatus(boolean holoUpd) {
        this.holoUpd = holoUpd;
    }
}

package me.angeschossen.upgradeablespawners.api.spawner.level;


/**
 * Different types of upgrades. Each level ({@link Level}) belongs to an upgade.
 */
public enum UpgradeType {

    /**
     * Defines how often the spawner spawns.
     */
    SPAWN_INTERVAL,
    /**
     * Maximum amount of nearby entities of the same type. No matter if they were spawned by UpgradeableSpawners or not.
     */
    NEARBY_ENTITIES,
    /**
     * At least one player must be within that rage in order for the spawner to spawn.
     */
    PLAYER_RANGE,
    /**
     * Amount of entities to spawn at each interval.
     */
    SPAWN_AMOUNT,
    /**
     * Maximum amount of entities that are spawned in a specific period. The period can be configured in the config.
     */
    PERIOD_AMOUNT
}

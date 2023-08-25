package me.angeschossen.upgradeablespawners.api.spawner;

import me.angeschossen.upgradeablespawners.api.blockwork.Coordinate;
import me.angeschossen.upgradeablespawners.api.events.SpawnerBreakEvent;
import me.angeschossen.upgradeablespawners.api.player.SpawnerPlayer;
import me.angeschossen.upgradeablespawners.api.spawner.flags.SpawnerStatus;
import me.angeschossen.upgradeablespawners.api.spawner.level.Level;
import me.angeschossen.upgradeablespawners.api.spawner.level.LevelType;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Spawner {
    /**
     * Delete the spawner.
     *
     * @param player      player that removes this spawner. This player will receive the spawner item if dropItem is true
     * @param removeBlock should the spawner block be removed?
     * @param giveItem    should the spawner item be given or dropped. If player is null or the inventory of the player is full, it will be dropped instead.
     * @return false, if a 3rd party plugin cancelled the deletion of this spawner
     */
    boolean delete(@Nullable SpawnerPlayer player, @NotNull SpawnerBreakEvent.Reason reason, boolean removeBlock, boolean giveItem);

    /**
     * Get the position of this spawner.
     *
     * @return position of this spawner
     */
    @NotNull Coordinate getCoordinate();

    /**
     * Get the amount of entities that the spawner will spawn at the next interval.
     * This depends on the level type {@link LevelType#SPAWN_AMOUNT} and {@link LevelType#PERIOD_AMOUNT}.
     * @return amount of entities to spawn at next interval
     */
    int getCurrentAmountToSpawn();

    /**
     * Get the type of entity that the spawner is spawing.
     * @return type of entity to spawn
     */
    @NotNull EntityType getEntityType();

    /**
     * Get a level of this spawner.
     *
     * @param levelType the type of level
     * @return current level of the provided type
     */
    @NotNull Level getLevel(@NotNull LevelType levelType);

    /**
     * Get the current status of the spawner.
     * @return status of spawner
     */
    @NotNull SpawnerStatus getStatus();
}

package me.angeschossen.upgradeablespawners.api;

import me.angeschossen.entitystacking.api.StackingAPI;
import me.angeschossen.upgradeablespawners.api.economy.EconomyProvider;
import me.angeschossen.upgradeablespawners.api.spawner.Spawner;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface UpgradeableSpawnersAPI {

    @NotNull
    static UpgradeableSpawnersAPI getInstance() {
        return null;
    }

    /**
     * Get the instance of the stacking API.
     * @return Stacking API
     */
    @NotNull StackingAPI getStackingAPI();

    /**
     * Get the current economy provider.
     * @return Economy provider
     */
    @NotNull
    EconomyProvider getEconomyProvider();

    /**
     * Set the economy provider.
     * @param economyProvider Economy provider
     */
    void setEconomyProvider(@NotNull EconomyProvider economyProvider);

    /**
     * Check wheter or not an entity was spawned by an upgradeable spawner.
     * The identification is persistent.
     *
     * @param entity The entity
     * @return true, if spawned by an upgradeable spawner.
     */
    boolean isSpawnedBySpawner(@NotNull Entity entity);

    /**
     * Get an upgradeable spawner from given coordinates.
     *
     * @param world The loaded world
     * @param x     Block x
     * @param y     Block y
     * @param z     Block z
     * @return null, if the block at the given location is no upgradeable spawner.
     */
    @Nullable Spawner getSpawner(@NotNull World world, int x, int y, int z);

    /**
     * Get an upgradeable spawner from a block.
     *
     * @param block The location
     * @return null, if the block is no spawner or no upgradeable spawner.
     */
    @Nullable Spawner getSpawner(@NotNull Block block);
}

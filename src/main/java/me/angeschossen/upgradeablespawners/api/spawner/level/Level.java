package me.angeschossen.upgradeablespawners.api.spawner.level;

import org.jetbrains.annotations.NotNull;

/**
 * Holds information about a specific level. Each level belongs to a specific upgrade type ({@link UpgradeType}).
 */
public class Level {

    private final @NotNull UpgradeType type;

    /**
     * Get the type of this level.
     * @return level type
     */
    public @NotNull UpgradeType getType() {
        return type;
    }

    private final double cost;

    /**
     * Get the amount of money needed for purchase of this level.
     * @return money needed to upgrade to this level
     */
    public double getCost() {
        return cost;
    }

    private final int value;

    /**
     * Get value defining {@link UpgradeType}.
     * @return value of level type
     */
    public int getValue() {
        return value;
    }

    private final int index;

    /**
     * Get index / order of this level.
     * @return index of level
     */
    public int getIndex() {
        return index;
    }

    /**
     * Create instance of a level.
     * @param type type of level
     * @param index index / order
     * @param cost money needed to upgrade to this level
     * @param value value defining {@link UpgradeType}
     */
    public Level(@NotNull UpgradeType type, int index, double cost, int value) {
        this.type = type;
        this.cost = cost;
        this.value = value;
        this.index = index;
    }
}

package me.angeschossen.upgradeablespawners.api.spawner;

import me.angeschossen.upgradeablespawners.api.blockwork.Coordinate;
import org.jetbrains.annotations.NotNull;

public interface Spawner {
    @NotNull Coordinate getCoordinate();
}

package me.angeschossen.upgradeablespawners.api.events.spawner;

import me.angeschossen.upgradeablespawners.api.player.SpawnerPlayer;
import me.angeschossen.upgradeablespawners.api.spawner.Spawner;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SpawnerEventCancellable extends SpawnerEvent implements Cancellable {
    protected boolean cancelled;

    protected SpawnerEventCancellable(@NotNull Spawner spawner, @Nullable SpawnerPlayer spawnerPlayer) {
        super(spawner, spawnerPlayer);
    }

    @Override
    public final boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}

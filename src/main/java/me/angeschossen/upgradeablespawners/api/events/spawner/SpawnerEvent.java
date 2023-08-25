package me.angeschossen.upgradeablespawners.api.events.spawner;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.upgradeablespawners.api.player.SpawnerPlayer;
import me.angeschossen.upgradeablespawners.api.spawner.Spawner;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SpawnerEvent extends Event {
    protected final @Nullable SpawnerPlayer spawnerPlayer;
    protected final @NotNull Spawner spawner;

    protected SpawnerEvent(@NotNull Spawner spawner, @Nullable SpawnerPlayer spawnerPlayer) {
        super(!Bukkit.isPrimaryThread());

        Checks.requireNonNull(spawner, "spawner");
        this.spawnerPlayer = spawnerPlayer;
        this.spawner = spawner;
    }

    /**
     * Get the spawner that is about to get deleted.
     *
     * @return never null
     */
    public final @NotNull Spawner getSpawner() {
        return spawner;
    }

    /**
     * Get the player that is involved in this deletion.
     *
     * @return if null, no player is involved. See {@link SpawnerDeleteEvent.Reason}
     */
    @Nullable
    public SpawnerPlayer getSpawnerPlayer() {
        return spawnerPlayer;
    }
}

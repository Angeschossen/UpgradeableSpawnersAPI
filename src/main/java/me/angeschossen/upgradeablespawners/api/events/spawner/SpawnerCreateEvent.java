package me.angeschossen.upgradeablespawners.api.events.spawner;

import me.angeschossen.upgradeablespawners.api.player.SpawnerPlayer;
import me.angeschossen.upgradeablespawners.api.spawner.Spawner;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a new spawner is being placed or a vanilla spawner is converted into a upgradeable spawner.
 */
public class SpawnerCreateEvent extends SpawnerEventCancellable {

    public static HandlerList handlerList = new HandlerList();

    /**
     * Create an instance of this event.
     * @param spawnerPlayer the player involved
     * @param spawner the spawner
     */
    public SpawnerCreateEvent(@Nullable SpawnerPlayer spawnerPlayer, @NotNull Spawner spawner) {
        super(spawner, spawnerPlayer);
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}

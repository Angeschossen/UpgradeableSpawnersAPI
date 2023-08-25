package me.angeschossen.upgradeablespawners.api.events.spawner;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.upgradeablespawners.api.player.SpawnerPlayer;
import me.angeschossen.upgradeablespawners.api.spawner.Spawner;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a spawner is about to be deleted.
 */
public class SpawnerDeleteEvent extends SpawnerEventCancellable {

    public static HandlerList handlerList = new HandlerList();
    private final @NotNull Reason reason;

    public SpawnerDeleteEvent(@NotNull Spawner spawner, @Nullable SpawnerPlayer spawnerPlayer, @NotNull Reason reason) {
        super(spawner, spawnerPlayer);

        Checks.requireNonNull(reason, "reason");
        this.reason = reason;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlerList;
    }

    /**
     * Get the reason of the deletion
     *
     * @return reason of removal
     */
    @NotNull
    public Reason getReason() {
        return reason;
    }

    /**
     * Cancel this event.
     *
     * @param cancelled true if you wish to cancel this event
     * @throws IllegalStateException if reason equals {@link Reason#BLOCK_NOT_EXIST}
     */
    @Override
    public void setCancelled(boolean cancelled) throws IllegalStateException {
        if (reason == Reason.BLOCK_NOT_EXIST) {
            throw new IllegalStateException("Can't cancel event with reason = " + reason.toString());
        }

        super.setCancelled(cancelled);
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public enum Reason {
        /**
         * The player initiated the deletion of this spawner.
         */
        PLAYER,
        /**
         * The spawner block doesn't exist any longer in the world.
         */
        BLOCK_NOT_EXIST,
        /**
         * Spawner would break because of an explosion of TNT or an entity.
         */
        EXPLOSION
    }
}

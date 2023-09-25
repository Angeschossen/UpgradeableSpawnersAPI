package me.angeschossen.upgradeablespawners.api.handler;

import com.github.angeschossen.pluginframework.api.configuration.Configuration;
import com.github.angeschossen.pluginframework.api.configuration.gui.GUIConfiguration;
import com.github.angeschossen.pluginframework.api.configuration.messages.Messages;
import com.github.angeschossen.pluginframework.api.utils.StringUtils;
import me.angeschossen.upgradeablespawners.api.UpgradeableSpawnersAPI;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * This class is not intended for direct usage and might change at any time.
 */
public class APIHandler {

    private static APIHandler instance;
    private final @NotNull Configuration config;
    private final @NotNull Plugin plugin;
    private final @NotNull Callable<GUIConfiguration> guiConfiguration;
    private final @NotNull Callable<Messages> messages;
    private final @NotNull StringUtils stringUtils;
    private final @NotNull UpgradeableSpawnersAPI api;


    public @NotNull Configuration getConfig() {
        return config;
    }

    private APIHandler(@NotNull Plugin plugin,
                       @NotNull Configuration config,
                       @NotNull Callable<Messages> messages, @NotNull Callable<GUIConfiguration> guiConfiguration,
                       @NotNull StringUtils stringUtils,
                       @NotNull UpgradeableSpawnersAPI api) {
        this.config = config;
        this.api = api;
        this.plugin = plugin;
        this.messages = messages;
        this.guiConfiguration = guiConfiguration;
        this.stringUtils = stringUtils;
    }

    public @NotNull UpgradeableSpawnersAPI getAPI() {
        return api;
    }

    public @NotNull Plugin getPlugin() {
        return plugin;
    }

    public GUIConfiguration getGUIConfiguration() {
        try {
            return guiConfiguration.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public @NotNull Messages getMessages() {
        try {
            return messages.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public @NotNull StringUtils getStringUtils() {
        return stringUtils;
    }

    public static APIHandler getInstance() {
        return instance;
    }

    public static void init(@NotNull Plugin plugin,
                            @NotNull Configuration config,
                            @NotNull Callable<Messages> messages, @NotNull Callable<GUIConfiguration> guiConfiguration,
                            @NotNull StringUtils stringUtils,
                            @NotNull UpgradeableSpawnersAPI api) {
        Objects.requireNonNull(config);
        Objects.requireNonNull(api);

        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }

        instance = new APIHandler(plugin,
                config,
                messages, guiConfiguration,
                stringUtils,
                api);
    }
}

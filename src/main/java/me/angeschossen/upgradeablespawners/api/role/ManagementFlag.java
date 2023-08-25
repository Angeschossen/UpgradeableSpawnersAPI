package me.angeschossen.upgradeablespawners.api.role;

import com.github.angeschossen.pluginframework.api.roles.settings.SettingType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Used for restricting editing spawners.
 */
public enum ManagementFlag implements com.github.angeschossen.pluginframework.api.roles.settings.ManagementSetting {

    DELETE(0, false),
    EDIT(1, true);


    private static final Map<Integer, ManagementFlag> map = new HashMap<>();

    static {
        for (ManagementFlag managementFlag : values()) {
            map.put(managementFlag.id, managementFlag);
        }
    }

    private final int id;
    public final boolean regionMembers;

    ManagementFlag(int id, boolean regionMembers) {
        this.regionMembers = regionMembers;
        this.id = id;
    }

    /**
     * Get the numerical ID of this flag.
     * @return numerical ID
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Get the bypass permission.
     * @return Bypass permission
     */
    @Override
    public String getBypassPermission() {
        return "uspawners.bypass." + toString();
    }

    /**
     * Get the name of this flag.
     * @return name of this flag without spaces or color
     */
    @Override
    public String getName() {
        return toString();
    }

    /**
     * Get the type of flag.
     * @return flag type
     */
    @Override
    public SettingType getType() {
        return SettingType.MANAGEMENT;
    }

    /**
     * Get permission needed to toggle this flag.
     * @return permission to toggle this flag
     */
    @Override
    public String getTogglePermission() {
        return "uspawners.setting." + toString();
    }

    /**
     * Get the message key of this flag.
     * @return message key
     */
    @Override
    public String getMessageKey() {
        return "noaccess.edit";
    }


    /**
     * Get flag by its ID.
     * @param id ID of flag
     * @return never null
     * @throws IllegalArgumentException no such flag with that ID
     */
    public static @NotNull ManagementFlag getById(int id) throws IllegalArgumentException {
        if (map.containsKey(id)) {
            return map.get(id);
        }

        throw new IllegalArgumentException("Could not find ManagementSetting with id " + id + ".");
    }
}

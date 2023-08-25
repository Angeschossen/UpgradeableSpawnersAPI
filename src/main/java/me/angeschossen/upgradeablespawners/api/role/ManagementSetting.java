package me.angeschossen.upgradeablespawners.api.role;

import com.github.angeschossen.pluginframework.api.roles.settings.SettingType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public enum ManagementSetting implements com.github.angeschossen.pluginframework.api.roles.settings.ManagementSetting {

    DELETE(0, false),
    EDIT(1, true);


    private static final Map<Integer, ManagementSetting> map = new HashMap<>();

    static {
        for (ManagementSetting managementSetting : values()) {
            map.put(managementSetting.id, managementSetting);
        }
    }

    private final int id;
    public final boolean regionMembers;

    ManagementSetting(int id, boolean regionMembers) {
        this.regionMembers = regionMembers;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getBypassPermission() {
        return "uspawners.bypass." + toString();
    }

    @Override
    public String getName() {
        return toString();
    }

    @Override
    public SettingType getType() {
        return SettingType.MANAGEMENT;
    }

    @Override
    public String getTogglePermission() {
        return "uspawners.setting." + toString();
    }

    @Override
    public String getMessageKey() {
        return "noaccess.edit";
    }


    public static @NotNull ManagementSetting getById(int i) throws IllegalArgumentException {
        if (map.containsKey(i)) {
            return map.get(i);
        }

        throw new IllegalArgumentException("Could not find ManagementSetting with id " + i + ".");
    }
}

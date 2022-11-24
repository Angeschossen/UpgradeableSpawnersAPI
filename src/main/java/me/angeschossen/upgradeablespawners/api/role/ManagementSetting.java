package me.angeschossen.upgradeablespawners.api.role;

public enum ManagementSetting {

    DELETE(0, false),
    EDIT(1, true);


    private final int id;
    public final boolean regionMembers;

    ManagementSetting(int id, boolean regionMembers) {
        this.regionMembers = regionMembers;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getBypassPermission() {
        return "uspawners.bypass." + toString();
    }

    public String getName() {
        return toString();
    }

    public String getTogglePermission() {
        return "uspawners.setting." + toString();
    }

    public String getMessageKey() {
        return "noaccess.edit";
    }
}

package me.angeschossen.upgradeablespawners.api.role;

public enum RoleSetting {

    OPEN(0);

    private final int id;

    RoleSetting(int id) {
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
        return "noaccess.action";
    }
}

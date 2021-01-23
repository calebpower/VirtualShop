package me.emiljimenez21.virtualshop.settings;

import org.mineacademy.fo.settings.SimpleSettings;

import java.util.UUID;

public class Settings extends SimpleSettings {
    public static Boolean databaseEnabled;
    public static String databaseHost;
    public static String databaseUser;
    public static String databasePass;
    public static String databaseName;
    public static String prefix;
    public static Boolean sound;
    public static Integer databasePort;
    public static String databasePrefix;
    public static Boolean reporting;
    public static String serverUUID;
    public static Boolean broadcastSales;
    public static Double tax;

    @Override
    protected int getConfigVersion() {
        return 4;
    }

    private static void init() {
        pathPrefix(null);
        prefix = getString("prefix");
        sound = getBoolean("sound");

        reporting = getBoolean("report_errors_to_dev");
        serverUUID = getOrSetDefault("server_uuid", UUID.randomUUID().toString());

        broadcastSales = getBoolean("broadcast_sales");
        tax = getDouble("tax");

        pathPrefix("mysql");
        databaseEnabled = getBoolean("enabled");
        databaseHost = getString("host");
        databasePort = getInteger("port");
        databaseUser = getString("user");
        databasePass = getString("pass");
        databaseName = getString("name");
        databasePrefix = getString("prefix");
    }
}

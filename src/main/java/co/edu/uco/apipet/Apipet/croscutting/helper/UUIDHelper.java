package co.edu.uco.apipet.Apipet.croscutting.helper;

import java.util.UUID;

public class UUIDHelper {
    private static final String DEFAULT_UUID_AS_STRING = "00000000-0000-0000-0000-000000000000";
    private static final UUID DEFAULT_UUID = UUID.fromString(DEFAULT_UUID_AS_STRING);

    private UUIDHelper(){
        super();
    }

    public static final UUID getDefaultUUID(){
        UUID uuid;

        do{
            uuid = UUID.randomUUID();
        } while (isDefaultUUID(uuid));
        return uuid;
    }

    public static final boolean isDefaultUUID(final UUID value){
        return DEFAULT_UUID.equals(value);
    }
}

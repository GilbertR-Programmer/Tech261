package com.sparta.grr;

public enum dbAccessKeys {
    STAGEDB("path/to/stage/datatbasekey"),
    ARCHIVEDB("path/to/archive/datatbasekey"),
    LIVEDB("path/to/live/datatbasekey");

    private final String DB_KEY;

    dbAccessKeys(String pathToDbKey) {
        //implementation that gets the key
        DB_KEY = "placeholder from implementation";
    }


}

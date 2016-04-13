package com.lsyiverson.pos_machine;

import com.google.gson.Gson;

public class PosMachine {
    private static PosMachine instance = new PosMachine();
    protected String[] barcode;

    private PosMachine() {
    }

    public static PosMachine getInstance() {
        return instance;
    }

    public void scan(String json) {
        Gson gson = new Gson();
        barcode = gson.fromJson(json, String[].class);
    }
}

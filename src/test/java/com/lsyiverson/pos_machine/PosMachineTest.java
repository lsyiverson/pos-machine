package com.lsyiverson.pos_machine;


import static org.assertj.core.api.Assertions.assertThat;

import com.lsyiverson.pos_machine.helper.FileLoader;
import org.junit.Before;
import org.junit.Test;

public class PosMachineTest {
    private PosMachine posMachine;

    @Before
    public void setUp() {
        posMachine = PosMachine.getInstance();
    }

    @Test
    public void should_get_string_array_when_scan_json_barcode() {
        posMachine.scan(FileLoader.loadFile("barcode.json"));

        assertThat(posMachine.barcode).containsExactly(
            "ITEM000001",
            "ITEM000001",
            "ITEM000001",
            "ITEM000001",
            "ITEM000001",
            "ITEM000003-2",
            "ITEM000005",
            "ITEM000005",
            "ITEM000005"
        );
    }
}
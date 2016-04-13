package com.lsyiverson.pos_machine.helper;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class FileLoader {
    public static String loadFile(String pathString) {
        Path path = FileSystems.getDefault().getPath(pathString);

        String fileContent = "";
        try {
            fileContent = Files.lines(path).collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}

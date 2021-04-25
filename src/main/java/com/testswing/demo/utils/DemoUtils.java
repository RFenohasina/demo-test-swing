package com.testswing.demo.utils;

import java.awt.*;
import java.io.File;

public class DemoUtils {
    public static void openPdfFile() {
        String filename = "[Free-scores.com]_faure-gabriel-requiem-en-re-mineur-40967.pdf";
        String pathFile = "src/main/resources/temp/";
        File file = new File(pathFile + filename);
        try {
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(new File(pathFile + filename));
                } else {
                }
            } else {
            }
        } catch (Exception exception) {
        }
    }
}

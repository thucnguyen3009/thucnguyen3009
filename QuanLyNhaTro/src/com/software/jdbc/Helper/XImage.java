package com.software.jdbc.Helper;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
//import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;

public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/com/software/icon/logo.png");
        return new ImageIcon(url).getImage();
    }
//    public static void save(File src) {
//        File dst = new File("logos", src.getName());
//        if (!dst.getParentFile().exists()) {
//            dst.getParentFile().mkdirs();
//        }
//        try {
//            Path from = Paths.get(src.getAbsolutePath());
//            Path to = Paths.get(dst.getAbsolutePath());
//            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
//
//        } catch (Exception e) {
//        }
//    }
//
//    public static ImageIcon read(String fileName) {
//        File path = new File("logos", fileName);
//        return new ImageIcon(path.getAbsolutePath());
//    }
}

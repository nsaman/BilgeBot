package com.bilgebot;

import java.awt.*;

public final class Helpers {
    static public boolean colorsClose(Color color1, Color color2) {
        return Math.abs(color1.getBlue() - color2.getBlue()) <= 3
                && Math.abs(color1.getGreen() - color2.getGreen()) <= 3
                && Math.abs(color1.getRed() - color2.getRed()) <= 3;
    }
}

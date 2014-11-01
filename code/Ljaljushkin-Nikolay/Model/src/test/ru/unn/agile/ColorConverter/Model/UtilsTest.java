package ru.unn.agile.ColorConverter.Model;

import static org.junit.Assert.*;

public final class UtilsTest {

    public static final double EPS = 0.01;

    private UtilsTest() {
    }

    protected static void expectedValuesForHsvColor(final Hsv hsvColor, final Rgb expectedColor) {
        Rgb targetColor = (Rgb) hsvColor.toColor(expectedColor.getClass());
        rgbAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForHsvColor(final Hsv hsvColor, final Lab expectedColor) {
        Lab targetColor = (Lab) hsvColor.toColor(expectedColor.getClass());
        labAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForRgbColor(final Rgb rgbColor, final Hsv expectedColor) {
        Hsv targetColor = (Hsv) rgbColor.toColor(expectedColor.getClass());
        hsvAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForRgbColor(final Rgb rgbColor, final Xyz expectedColor) {
        Xyz targetColor = (Xyz) rgbColor.toColor(expectedColor.getClass());
        xyzAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForRgbColor(final Rgb rgbColor, final Lab expectedColor) {
        Lab targetColor = (Lab) rgbColor.toColor(expectedColor.getClass());
        labAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForLabColor(final Lab labColor, final Rgb expectedColor) {
        Rgb targetColor = (Rgb) labColor.toColor(expectedColor.getClass());
        rgbAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForLabColor(final Lab labColor, final Xyz expectedColor) {
        Xyz targetColor = (Xyz) labColor.toColor(expectedColor.getClass());
        xyzAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForLabColor(final Lab labColor, final Hsv expectedColor) {
        Hsv targetColor = (Hsv) labColor.toColor(expectedColor.getClass());
        hsvAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForXyzColor(final Xyz xyzColor, final Rgb expectedColor) {
        Rgb targetColor = (Rgb) xyzColor.toColor(expectedColor.getClass());
        rgbAssert(expectedColor, targetColor);
    }

    protected static void expectedValuesForXyzColor(final Xyz xyzColor, final Lab expectedColor) {
        Lab targetColor = (Lab) xyzColor.toColor(expectedColor.getClass());
        labAssert(expectedColor, targetColor);
    }

    protected static void rgbAssert(final Rgb expectedColor, final Rgb targetColor) {
        assertTrue("(r)" + expectedColor.getR() + " != " + targetColor.getR(),
                isCloseEnough(expectedColor.getR(), targetColor.getR()));
        assertTrue("(g)" + expectedColor.getG() + " != " + targetColor.getG(),
                isCloseEnough(expectedColor.getG(), targetColor.getG()));
        assertTrue("(b)" + expectedColor.getB() + " != " + targetColor.getB(),
                isCloseEnough(expectedColor.getB(), targetColor.getB()));
    }

    protected static void hsvAssert(final Hsv expectedColor, final Hsv targetColor) {
        assertTrue("(h)" + expectedColor.getH() + " != " + targetColor.getH(),
                isCloseEnough(expectedColor.getH(), targetColor.getH()));
        assertTrue("(s)" + expectedColor.getS() + " != " + targetColor.getS(),
                isCloseEnough(expectedColor.getS(), targetColor.getS()));
        assertTrue("(v)" + expectedColor.getV() + " != " + targetColor.getV(),
                isCloseEnough(expectedColor.getV(), targetColor.getV()));
    }

    protected static void xyzAssert(final Xyz expectedColor, final Xyz targetColor) {
        assertTrue("(x)" + expectedColor.getX() + " != " + targetColor.getX(),
                isCloseEnough(expectedColor.getX(), targetColor.getX()));
        assertTrue("(y)" + expectedColor.getY() + " != " + targetColor.getY(),
                isCloseEnough(expectedColor.getY(), targetColor.getY()));
        assertTrue("(z)" + expectedColor.getZ() + " != " + targetColor.getZ(),
                isCloseEnough(expectedColor.getZ(), targetColor.getZ()));
    }

    protected static void labAssert(final Lab expectedColor, final Lab targetColor) {
        assertTrue("(l)" + expectedColor.getL() + " != " + targetColor.getL(),
                isCloseEnough(expectedColor.getL(), targetColor.getL()));
        assertTrue("(a)" + expectedColor.getA() + " != " + targetColor.getA(),
                isCloseEnough(expectedColor.getA(), targetColor.getA()));
        assertTrue("(b)" + expectedColor.getB() + " != " + targetColor.getB(),
                isCloseEnough(expectedColor.getB(), targetColor.getB()));
    }

    protected static boolean isCloseEnough(final double a, final double b) {
        double difference = Math.abs(a * EPS);
        if (a != 0.0 && b != 0.0) {
            return Math.abs(a - b) <= difference;
        } else {
            return Math.abs(a - b) <= EPS;
        }
    }


}
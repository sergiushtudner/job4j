package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
    public void distance() {
        int inx1 = 5;
        int iny1 = 5;
        int inx2 = 100;
        int iny2 = 100;
        double expected = 134.35028842544403;
        double out = Point.distance(inx1,iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

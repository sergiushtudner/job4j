package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro1() {
        int in = 70;
        int expected = 1;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void EuroToRuble1() {
        int in = 1;
        int expected = 70;
        int out = Converter.EuroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToEuro2() {
        int in = 35000;
        int expected = 500;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void EuroToRuble2() {
        int in = 500;
        int expected = 35000;
        int out = Converter.EuroToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void rubleToEuro3() {
        int in = 7000;
        int expected = 100;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void EuroToRuble3() {
        int in = 100;
        int expected = 7000;
        int out = Converter.EuroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToEuro4() {
        int in = 3850;
        int expected = 55;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void EuroToRuble4() {
        int in = 55;
        int expected = 3850;
        int out = Converter.EuroToRuble(in);
        Assert.assertEquals(expected, out);
    }


    @Test
    public void rubleToDollar1() {
        int in = 60;
        int expected = 1;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }
    @Test
    public void DollarToRuble1() {
        int in = 1;
        int expected = 60;
        int out = Converter.DollarToRuble(in);
        Assert.assertEquals(expected, out);

    }
    @Test
    public void rubleToDollar2() {
        int in = 3600;
        int expected = 60;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }
    @Test
    public void DollarToRuble2() {
        int in = 60;
        int expected = 3600;
        int out = Converter.DollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void rubleToDollar3() {
        int in = 4500;
        int expected = 75;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }
    @Test
    public void DollarToRuble3() {
        int in = 75;
        int expected = 4500;
        int out = Converter.DollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void rubleToDollar4() {
        int in = 30000;
        int expected = 500;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }
    @Test
    public void DollarToRuble4() {
        int in = 500;
        int expected = 30000;
        int out = Converter.DollarToRuble(in);
        Assert.assertEquals(expected, out);
    }



}

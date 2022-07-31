package com.wrapper.test;

public class WrapperTest {

    public static void main(String[] args) {
        Integer a = 10;
        Integer a1 = Integer.valueOf(10);
        Integer a2 = new Integer(10);
        Integer a3 = Integer.parseInt("10");

        Byte b = 10;
        Byte b1 = Byte.valueOf((byte) 10);
        Byte b2 = new Byte((byte) 10);
        Byte b3 = Byte.parseByte("10");

        Short s = 10;
        Short s1 = Short.valueOf((short) 10);
        Short s2 = new Short((short) 10);
        Short s3 = Short.parseShort("10");

        Double d = 2.2;
        Double d1 = Double.valueOf(2.2);
        Double d2 = new Double(2.2);
        Double d3 = Double.parseDouble("2.2");

        Long l = 10l;
        Long l1 = Long.valueOf(10);
        Long l2 = new Long(10);
        Long l3 = Long.parseLong("10");

        Float f = 1.1f;
        Float f1 = Float.valueOf((float) 1.1);
        Float f2 = new Float(1.1);
        Float f3 = Float.parseFloat("1.1");

        Character c = 1;
        Character c1 = Character.valueOf((char) 1);
        Character c2 = new Character((char) 1);

        Boolean q = true;
        Boolean q1 = Boolean.valueOf(true);
        Boolean q2 = new Boolean(true);
        Boolean q3 = Boolean.parseBoolean(String.valueOf(true));

        Double w = 1.23;
        byte w1 = w.byteValue();
        short w2 = w.shortValue();
        long w3 = w.longValue();
        int w4 = w.intValue();
        float w5 = w.floatValue();

        Double v = 1.23;
        Double v1 = 0.0;
        Double nanValue = v1 / v1;
        // nanValue= Double.NaN;
        Double infinityValue = v / v1;

        System.out.println(nanValue);
        System.out.println(infinityValue);

        if (Double.isNaN(nanValue)) {
            System.out.println("Переменная nanValue  " + nanValue);
        } else if (Double.isInfinite(nanValue)) {
            System.out.println("Переменная nanValue  " + nanValue);
        }
        if (Double.isNaN(infinityValue)) {
            System.out.println("Переменная infinityValue  " + infinityValue);
        } else if (Double.isInfinite(infinityValue)) {
            System.out.println("Переменная nanValue  " + infinityValue);
        }
        Long l4 = 120l;
        Long l5 = 120l;
        System.out.println(l4 == l5);
        l4 = 1200l;
        l5 = 1200l;
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l4 == l5);
    }
}

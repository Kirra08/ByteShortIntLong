package com.company;

public class Main {

    public static void main(String[] args) {
       int myValue = 10000;

       int myMinIntValue = Integer.MIN_VALUE;
       int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Interger Minimun Value =" + myMinIntValue);
        System.out.println("Interger Maximun Value =" + myMaxIntValue);
        System.out.println("Busted MAX value =" + (myMaxIntValue + 1));
        System.out.println("Busted MIN value =" + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value =" + myMinLongValue);
        System.out.println("long Maximum Value =" + myMaxLongValue);
        long bigLongLiteralValue =2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte newbyte = 120;

        short newshort = 5000;

        int newint = 10000;

        long newlong = (long) ((newbyte + newshort + newint + 50000) * 10);

        System.out.println("newlong = " + newlong);
    }
}

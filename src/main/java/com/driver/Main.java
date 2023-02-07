package com.driver;

public class Main {
    public static void main(String[] args) {
        Product obj = new Product();
        obj.product(4,5);
        obj.product(4,5,6);
        obj.product(4.5,5.2);
    }
    public static class Product{
        public static int product(int x, int y) {
            return  x*y;
        }
        public static int product(int x, int y, int z) {
            return x*y*z;
        }
        public static double product(double x, double y) {
            return x*y;
        }
    }
}
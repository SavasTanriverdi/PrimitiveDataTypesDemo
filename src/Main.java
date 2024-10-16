public class Main {
    public static void main(String[] args) {

        // byte veri tipi (-128 ile 127 arasında değer alır)
        byte byteValue = 100;
        System.out.println("Byte Değeri: " + byteValue);

        // short veri tipi (-32,768 ile 32,767 arasında değer alır)
        short shortValue = 20000;
        System.out.println("Short Değeri: " + shortValue);

        // int veri tipi (-2,147,483,648 ile 2,147,483,647 arasında değer alır)
        int intValue = 1000000;
        System.out.println("Int Değeri: " + intValue);

        // long veri tipi (-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasında değer alır)
        long longValue = 10000000000L; // 'L' harfi long olduğunu belirtir
        System.out.println("Long Değeri: " + longValue);

        // Değerlerin aritmetik işlemlerde kullanılması
        long toplam = byteValue + shortValue + intValue + longValue;
        System.out.println("Toplam Değer: " + toplam);

        // Maksimum ve minimum değerleri gösterme
        System.out.println("Byte Min Değeri: " + Byte.MIN_VALUE);
        System.out.println("Byte Max Değeri: " + Byte.MAX_VALUE);

        System.out.println("Short Min Değeri: " + Short.MIN_VALUE);
        System.out.println("Short Max Değeri: " + Short.MAX_VALUE);

        System.out.println("Int Min Değeri: " + Integer.MIN_VALUE);
        System.out.println("Int Max Değeri: " + Integer.MAX_VALUE);

        System.out.println("Long Min Değeri: " + Long.MIN_VALUE);
        System.out.println("Long Max Değeri: " + Long.MAX_VALUE);
    }
}

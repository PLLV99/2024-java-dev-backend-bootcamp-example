package fundamentals;


public class WrapperClass {
    public static void main(String[] args) {
        basicWrapper();
        parseTechnique();

    }

    public static void basicWrapper() {
        byte exampleOfByte = 127;
        Byte exampleOfByteBoxing = Byte.valueOf(exampleOfByte); // Boxing
        System.out.println(exampleOfByteBoxing.byteValue()); // Unboxing
        // Example of auto boxing
        Byte autoBoxing = exampleOfByte;
        // Example of auto unboxing
        System.out.println(exampleOfByteBoxing);

        Short shortData = 100;
        Integer integerData = 100;
        Long longData = 100L;
        Double doubleData = 25.00;
        Float floatData = 25.00f;
        Character grade = 'D';
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(grade));

        Boolean isEnabled = true;

    }

    public static void parseTechnique() {
        Integer wrapper1 = Integer.valueOf("500");
        Integer wrapper2 = Integer.valueOf("100");
        // Auto unboxing -> Integer (wrapper) => int (primitive)
        int sum = wrapper1 + wrapper2;
        System.out.println("Sum (from Integer): " + sum);
    }
}

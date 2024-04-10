public class NumberSumII {
    public Number sumNumberII(Number[] numArr) {
        Number[] sum = new Number[1];
        sum[0] = 0;

        for (int i=0; i<numArr.length; i++) {
            if (numArr[i] instanceof Byte) {
                boolean isPos = numArr[i].byteValue()>0;
                sum[0] = sum[0].byteValue() + numArr[i].byteValue();
                if (isPos && sum[0].byteValue()<0) sum[0] = Byte.MAX_VALUE;
                else if (!isPos && sum[0].byteValue()>0) sum[0] = Byte.MIN_VALUE;
            }

            else if (numArr[i] instanceof Integer) {
                boolean isPos = numArr[i].intValue()>0;
                sum[0] = sum[0].intValue() + numArr[i].intValue();
                if (isPos && sum[0].intValue()<0) sum[0] = Integer.MAX_VALUE;
                else if (!isPos && sum[0].intValue()>0) sum[0] = Integer.MIN_VALUE;
            }

            else if (numArr[i] instanceof Double) {
                sum[0] = sum[0].doubleValue() + numArr[i].doubleValue();

                if (sum[0].doubleValue() == Double.POSITIVE_INFINITY) sum[0] = Double.MAX_VALUE;
                else if (sum[0].doubleValue() == Double.NEGATIVE_INFINITY) sum[0] = Double.MIN_VALUE;
            }

            else if (numArr[i] instanceof Float) {
                sum[0] = sum[0].floatValue() + numArr[i].floatValue();
                if (sum[0].floatValue() == Float.POSITIVE_INFINITY) sum[0] = Float.MAX_VALUE;
                else if (sum[0].floatValue() == Float.NEGATIVE_INFINITY) sum[0] = Float.MIN_VALUE;
            }   

            else if (numArr[i] instanceof Short) {
                boolean isPos = numArr[i].shortValue()>0;
                sum[0] = sum[0].shortValue() + numArr[i].shortValue();
                if (isPos && sum[0].shortValue()<0) sum[0] = Short.MAX_VALUE;
                else if (!isPos && sum[0].shortValue()>0) sum[0] = Short.MIN_VALUE;
            }

            else if (numArr[i] instanceof Long) {
                boolean isPos = numArr[i].longValue()>0;
                sum[0] = sum[0].longValue() + numArr[i].longValue();
                if (isPos && sum[0].longValue()<0) sum[0] = Long.MAX_VALUE;
                if (!isPos && sum[0].longValue()>0) sum[0] = Long.MIN_VALUE;

            }
        }

        return sum[0];
    }

    // public static void main(String[] args) {
    //     Number[] numArr = new Number[5];
    //     // numArr[0] = 10; System.out.println(numArr[0].getClass());
    //     // numArr[1] = 20.5d; System.out.println(numArr[1].getClass());
    //     // numArr[2] = 1; System.out.println(numArr[2].getClass());

    //     // numArr[0] = Short.parseShort("32767"); System.out.println(numArr[0].getClass());
    //     // numArr[1] = Short.parseShort("10"); System.out.println(numArr[1].getClass());

    //     // numArr[0] = 10; System.out.println(numArr[0].getClass());
    //     // numArr[1] = 20.5d; System.out.println(numArr[1].getClass());
    //     // numArr[2] = 570.5d; System.out.println(numArr[2].getClass());
    //     // numArr[3] = Byte.parseByte("3"); System.out.println(numArr[0].getClass());
    //     // numArr[4] = 11.5d; System.out.println(numArr[1].getClass());

    //     numArr[0] = Short.parseShort("-32767"); System.out.println(numArr[0].getClass());
    //     numArr[1] = Short.parseShort("10"); System.out.println(numArr[1].getClass());

    //     // for (int i=0; i<numArr.length; i++) System.out.println(numArr[i]);

    //     System.out.println(Short.MAX_VALUE);

    //     System.out.println(sumNumberII(numArr));
    // }
}

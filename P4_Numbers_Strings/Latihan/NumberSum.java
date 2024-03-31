public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        Number[] ans = new Number[numArr.length];

        int idx = 0;

        for (int i=0; i<numArr.length; i++) {
            if (numArr[i]!=null) {
                ans[idx] = numArr[i];

                for (int j=i+1; j<numArr.length; j++) {
                    if (numArr[j].getClass().equals(ans[i].getClass())) {
                        if (ans[i] instanceof Byte) ans[i] = ans[i].byteValue() + numArr[j].byteValue();
                        else if (ans[i] instanceof Integer) ans[i] = ans[i].intValue() + numArr[j].intValue();
                        else if (ans[i] instanceof Double) ans[i] = ans[i].doubleValue() + numArr[j].doubleValue();
                        else if (ans[i] instanceof Short) ans[i] = ans[i].shortValue() + numArr[j].shortValue();
                        else if (ans[i] instanceof Long) ans[i] = ans[i].longValue() + numArr[j].longValue();
                        
                        numArr[j] = null;
                    }
                }
                idx ++;
            }
        }
        return ans;
    }
}
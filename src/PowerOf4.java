

public class PowerOf4 {
    public boolean checkIfPowerOf4(long i) {

        long a = (long) (Math.log10(i)/ (0.602));      // 0.602 = log10(4)
        if(Math.pow(4,a)==i)
            return true;
        else
            return false;
    }
}

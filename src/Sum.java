public class Sum {
    public int GetSum(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}

//Let's say we want to find the sum of numbers inclusively between a = 3 and b = 7.

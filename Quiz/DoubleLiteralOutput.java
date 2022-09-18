class DoubleLiteralOutput {
    public static void main(String[] args) {
        double[] num = {8.6, 12.4, 2.0, 5.5, 11.9, 2.6};
        double sum = 0;
        for(int i = 0; i < num.length; i++)
            sum += num[i];
        System.out.println(sum / num.length);
    }
} 


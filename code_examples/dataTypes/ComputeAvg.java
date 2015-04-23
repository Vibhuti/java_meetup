class ComputeAvg {
    public static void main(String args[]) {
        int i, sum = 0;
        float average;
        String outputText;
                
        for (i=0; i<args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        average = sum / args.length;
        System.out.println("The average is: " + average);
    }
}

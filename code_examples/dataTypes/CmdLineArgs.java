class CmdLineArgs {
    public static void main(String args[]) {
       int i;
       String outputText;
                
       for (i=0; i<args.length; i++) {
          outputText = "Argument " + i + ": " + args[i];
          System.out.println(outputText);
       }
    }
}

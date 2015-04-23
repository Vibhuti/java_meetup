class Name {
    public static void main(String args[]) {
        int lastNameIdx;
        String lastName;

        String studentName = "John Chen";
        System.out.println("Full Name: " + studentName);

        lastNameIdx = studentName.indexOf(' ') + 1;
        lastName = studentName.substring(lastNameIdx);
        System.out.println("Last Name: " + lastName);
    }
}

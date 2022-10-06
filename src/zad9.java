public class zad9 {
    public static void main(String[] args)
    {
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        firstName = "Marcin";
        middleName = "Grzegorz";
        lastName = "Lichon";

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println("First name: " + firstName + "[" + firstInitial + "]" + "\n" +
                "Middle name: " + middleName + "[" + middleInitial + "]" + "\n" +
                "Last name: " + lastName + "[" + lastInitial + "]" + "\n"
        );
    }
}


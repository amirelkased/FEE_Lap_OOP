package Week_1;

import java.util.Scanner;

public class Project_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void entryPoint() {
        System.out.print("Enter Ascii code : ");
        short asciiCode = scanner.nextShort();
        System.out.printf("The Character of %d is : %c", asciiCode, Project_1.convertAsciiToChar(asciiCode));
    }

    private static char convertAsciiToChar(int asciiValue) {
        return (char) asciiValue;
    }
}


package edu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {




            /*UserImage userImage1 = new UserImage(new File("logo.jpg"));
            UserImage userImage2 = new UserImage(new File("logo.jpg"));
            CompareImages.printDifferenceOfImages(userImage1,userImage2);
            UserImage userImage3 = new UserImage(new File("logo.jpg"));
            UserImage userImage4 = new UserImage(new File("kopia.jpg"));
            CompareImages.printDifferenceOfImages(userImage3,userImage4);*/

        System.out.println("Podaj ścieżkę dla pierwszego zdjęcia");
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        System.out.println("Podaj ścieżkę dla drugiego zdjęcia");
        String file2 = scanner.nextLine();
        UserImage userImageA = new UserImage(new File(file1));
        UserImage userImageB = new UserImage(new File(file2));
        CompareImages.printDifferenceOfImages(userImageA,userImageB);


    }
}

package edu;

public class CompareImages {


    private static boolean testDimensionOfImages(UserImage userImage1, UserImage userImage2) {
        return (userImage1.getWidth() != userImage2.getWidth()) ||
                (userImage1.getHeight() != userImage2.getHeight());
    }

    private static int getRGB(int x, int y, UserImage userImage) {
        return userImage.getRGB(x,y);
    }

    private static int getRed(int rgb) {
        return (rgb >> 16) & 0xff;
    }

    private static int getGreen(int rgb) {
        return (rgb >> 8) & 0xff;
    }

    private static int getBlue(int rgb) {
        return rgb & 0xff;
    }

    public static void printDifferenceOfImages(UserImage userImage1,UserImage userImage2) {
        System.out.println("Procentowa różnica pomiędzy zdjęciami to: "+ compare(userImage1,userImage2));
    }

    public static double compare(UserImage userImage1, UserImage userImage2) {

        if (testDimensionOfImages(userImage1, userImage2)){
            return -1;
        }else {
            long difference = 0;
            int rgbA,rgbB,redA,redB,greenA,greenB,blueA,blueB;
            for (int y = 0; y < userImage1.getHeight(); y++) {
                for (int x = 0; x < userImage1.getWidth() ; x++) {
                    rgbA = getRGB(x,y,userImage1);
                    rgbB = getRGB(x,y,userImage2);
                    redA = getRed(rgbA);
                    redB = getRed(rgbB);
                    greenA = getGreen(rgbA);
                    greenB = getGreen(rgbB);
                    blueA = getBlue(rgbA);
                    blueB = getBlue(rgbB);
                    difference += Math.abs(redA - redB);
                    difference += Math.abs(greenA - greenB);
                    difference += Math.abs(blueA - blueB);

                }
            }
            double total_pixels = userImage1.getWidth() * userImage1.getHeight() * 3;
            double avg_different_pixels = difference / total_pixels;
            return (avg_different_pixels /255)*100;
        }

    }

}

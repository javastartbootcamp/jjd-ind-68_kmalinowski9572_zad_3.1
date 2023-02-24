package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();

        monitor1.resolution = "1920x1080";
        monitor1.broken = false;
        monitor1.aspectRatio = "16:9";
        monitor1.screenSize = 23;
        monitor1.modelName = "M2350D-PZ";

        Monitor monitor2 = new Monitor();

        monitor2.resolution = "3840x2160";
        monitor2.broken = false;
        monitor2.aspectRatio = "16:9";
        monitor2.screenSize = 31.5;
        monitor2.modelName = " 32UP550N-W";

        System.out.println(monitor1);
        System.out.println(monitor2);

    }
}

package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("M2350D-PZ", 23, "16:9", "1920x1080", false);

        Monitor monitor2 = new Monitor("32UP550N-W", 31.5, "16:9", "3840x2160", false);

        System.out.println(monitor1);
        System.out.println(monitor2);

    }
}

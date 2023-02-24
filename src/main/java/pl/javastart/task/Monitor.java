package pl.javastart.task;

public class Monitor {

    String modelName;
    double screenSize;
    String aspectRatio;
    String resolution;
    boolean broken;

    @Override
    public String toString() {
        return "Monitor{" +
                "modelName='" + modelName + '\'' +
                ", screenSize=" + screenSize +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", resolution='" + resolution + '\'' +
                ", broken=" + broken +
                '}';
    }
}

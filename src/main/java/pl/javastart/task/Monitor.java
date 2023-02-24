package pl.javastart.task;

public class Monitor {

    String modelName;
    double screenSize;
    String aspectRatio;
    String resolution;
    boolean broken;

    public Monitor(String modelName, double screenSize, String aspectRatio, String resolution, boolean broken) {
        this.modelName = modelName;
        this.screenSize = screenSize;
        this.aspectRatio = aspectRatio;
        this.resolution = resolution;
        this.broken = broken;
    }

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

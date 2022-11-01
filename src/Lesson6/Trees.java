package Lesson6;

public class Trees extends Plants  {
    private int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    private String time_blooming;
    public String getTime_blooming() {
        return time_blooming;
    }
    public void setTime_blooming(String time_blooming) {
        this.time_blooming = time_blooming;
    }
    public void blooming(String time_blooming) {
        System.out.println("I'm blooming in " + time_blooming);
    }
    public void height(int height) {
        System.out.println("I'm " + height +" m "); }
    public  void  characteristics() {
        height(getHeight());
        coloring(getColor());
        family(getType());
        blooming(getTime_blooming());
    }
}

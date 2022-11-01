package Lesson6;

public abstract class Plants {


    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    private   String type;
    /* @Override
     public String hashCode() {
         return Type;
     }*/
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void coloring(String color) {
        System.out.println("I'm " + color);
    }
    public void family (String type) {
        System.out.println("I'm " + type);
    }
    @Override
    public String toString(){
        return "Trees " + type;
    }


}
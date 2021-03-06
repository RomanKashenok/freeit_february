package obj;

public class Box {

    private String color;
    private int width;
    private int heigth;
    private int length;

    public Box(String color, int width, int heigth, int length) {
        this.color = color;
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (width != box.width) return false;
        if (heigth != box.heigth) return false;
        if (length != box.length) return false;
        return color != null ? color.equals(box.color) : box.color == null;
    }
}

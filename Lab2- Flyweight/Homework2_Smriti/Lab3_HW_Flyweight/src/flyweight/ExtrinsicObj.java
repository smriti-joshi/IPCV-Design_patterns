package flyweight;


public class ExtrinsicObj {
    private int column;
    private int color;
    //setter function
    public void setState(int column, int color)
    {
        this.column = column;
        this.color = color;
    }
    //Getter functions
    public int getColumn() {
        return column;
    }
    public int getColor(){
        return color; }
}

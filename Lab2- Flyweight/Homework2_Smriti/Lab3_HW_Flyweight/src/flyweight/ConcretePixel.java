package flyweight;

public class ConcretePixel implements PixelInterface {
    //Intrinsic State
    //Row can be assigned only one integer value
    public final int row;
    public ConcretePixel(int row){
        this.row = row;
    }

    //Prints row and corresponding column and color
    public void Report(ExtrinsicObj object)
    {
        System.out.print(" "+row+","+object.getColumn()+":"+object.getColor());
    }
}

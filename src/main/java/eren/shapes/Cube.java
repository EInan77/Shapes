/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */
public class Cube extends ThreeDimensionalShape {
    
    
    public Cube(int x, int y, int side) {
        super(x, y, side, side, side);
    }
    
 
    @Override
    public String getName() {
        return "Cube";
    }
    
   
    @Override
    public int getArea() {
        int area = 6 * getDimension1() * getDimension1(); 
        return area;
    }
    
    
    @Override
    public int getVolume() {
        int vol = getDimension1() * getDimension1() * getDimension1();
        return vol;
    }
}
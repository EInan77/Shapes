/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */
public class Tetrahedron extends ThreeDimensionalShape {
    
   
    public Tetrahedron(int x, int y, int edge) {
        super(x, y, edge, edge, edge);
    }
 
    @Override
    public int getArea() {
        int area = (int) (Math.sqrt(3) * getDimension1() * getDimension1());
        return area;
    }
    
   
    @Override
    public int getVolume() {
        int vol = (int) ((Math.sqrt(2) / 12) * getDimension1() * getDimension1() * getDimension1());
        return vol;
    }
    
    
    @Override
    public String getName() {
        return "Tetrahedron";
    }
}
package eren.shapes;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ereni
 */
public class Sphere extends ThreeDimensionalShape {
    
   
    public Sphere(int x, int y, int radius) {
        super(x, y, radius, radius, radius);
    }
    

    @Override
    public int getArea() {
        int area = (int) (4 * Math.PI * getDimension1() * getDimension1());
        return area;
    }
    
    
    @Override
    public int getVolume() {
        int vol = (int) ((4.0/3.0) * Math.PI * getDimension1() * getDimension1() * getDimension1());
        return vol;
    }
    
    @Override
    public String getName() {
        return "Sphere";
    }
}
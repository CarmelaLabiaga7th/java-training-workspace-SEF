package sef.module6.activity;

/**
 * @author  John Doe
 * 
 * This class represents a point in 3D space.  The coordinates are represented by
 * a set of values x, y an z that represents the coordinates along each plane
 */
public class Point3DImpl extends Point2DImpl implements Point3D{
	//private double x;
	//private double y;
	
	private double z;
	
	/**
	 * Creates a Point3D object with the default coordinate of 0,0,0 
	 *
	 */
	public Point3DImpl(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		
	}
	
	/**
	 * Creates a Point3D object at the specified coordinates
	 * 
	 * @param x coordinate along the x axis
	 * @param y coordinate along the y axis
	 * @param z coordinate along the z axis
	 */
	public Point3DImpl(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#setZ(double)
	 */
	public final void setZ(double z){
		this.z = 0;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getZ(){
		return z;
	}
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#move(double, double, double)
	 */
	public void move(double x2, double y2, double z2){
		this.x =x2;
		this.y =y2;
		this.z =z2;
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#translate(double, double, double)
	 */
	public void translate(double x2, double y2, double z2){
		//this.x = x+x2;
		//this.y = y+y2;
        super.translate(x2, y2);
        this.z = this.z + z2;	
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#equals(double, double, double)
	 */
	public boolean equals(double x2, double y2, double z2){
		if (this.x == x2 && this.y == y2 && this.z == z2) {
			return true;
		} else {
			return false;
		}
		//return false;       
	}
	
	
	/**
	 * Compares if the coordinates are equal to the coordinates specified by the parameter
	 * 
	 * @param p the coordinates to compare
	 * 
	 * @return true if the parameter is an instance of Point3D and contain the same coordinates, false otherwise
	 */
	public boolean equals(Object p){
	
		Point3D p2 = (Point3D) p;
		if (this.x == p2.getX() && this.y == p2.getY() && this.z == p2.getZ()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getDistance(sef.module5.activity.Point3D)
	 */
	public double getDistance(Point3D p){
		double result = Math.sqrt(Math.pow(p.getX()-x, 2) + Math.pow(p.getY()-y, 2) +  Math.pow(p.getZ()-z, 2));
		//return 0;
		return result;
		//return 0;
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getDistance(double, double, double)
	 */
	public double getDistance(double x2, double y2, double z2){
		double result = Math.sqrt(Math.pow(x2-x, 2) + Math.pow(y2-y, 2) + Math.pow(z2-z, 2));
		//return 0;
		return result;
		//return 0;
	
	}
	

}

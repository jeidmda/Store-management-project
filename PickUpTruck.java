/*
 * Represents a cookie that can be sold at a food truck
 * PickupTruck is a type of vehicle
 */
public class PickupTruck extends vehicle {

  private double bedSize;   // What size the bed is
  private boolean dualCab;    // wether or not the truck is dual bed
  /*
   * Sets bedSize to true
   */
  public PickupTruck() {
    bedSize = 0;
    dualCab = false;
  }

  /*
   * Sets the carBrand to the specified carBrand, the price to the
   * specified price, and bedSize to the specified status
   */
  public PickupTruck(String carBrand, String name, double price, int year, String driveTrain, double bedSize, boolean dualCab) {
    super(carBrand, name, price, year, driveTrain);
    this.bedSize = bedSize;
    this.dualCab = dualCab;
  }

  /*
   * Returns the value assigned to bedSize
   */
  public double getBedSize() {
    return bedSize;
  }

  /*
   * Sets bedSize to newBedSize
   */
  public void setBedSize(double bedSize) {
    this.bedSize = bedSize;
  }

  public boolean getDualCab() {
    return dualCab;
  }

  /*
   * Sets bedSize to newBedSize
   */
  public void setDualCab(boolean dualCab) {
    this.dualCab = dualCab;
  }

  public String toString() {
    return("Brand: " + carBrand + "\nName: " + name + "\nDrive train type: " + driveTrain + "\nPrice: " + price + "\nYear: " + year + "\nBed Size in feet: " + bedSize + "\nIs dual cab? " + dualCab);
  }
}
/*
 * Represents the car that can be sold at a food truck
 */
public class vehicle {

  public String carBrand;    // The carBrand of the car
  public double price;     // The price of the car
  public int year;
  public String name;
  public String driveTrain;

  /*
   * Sets carBrand to "plain" and price to 0.50
   */
  public vehicle() {
    this("Unknown brand", "No Name", 0.00, 0000, "No drive train");
  }

  /*
   * Sets carBrand to the specified carBrand and
   * price to the specified price
   */
  public vehicle(String carBrand, String name, double price, int year, String driveTrain) {
    this.carBrand = carBrand;
    this.price = price;
    this.year = year;
    this.name = name;
    this.driveTrain = driveTrain + "wd";
  }

  /*
   * Returns the value assigned to carBrand
   */
  public String getBrand() {
    return carBrand;
  }

  public String getName() {
    return name;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  /*
   * Returns the value assigned to price
   */
  public double getPrice() {
    return price;
  }

   /*
   * Returns the value assigned to year
   */
  public int getYear() {
    return year;
  }

  /*
   * Sets carBrand to newBrand
   */
  public void setBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain + "wd";
  }

  /*
   * Sets Year to newYear
   */
  public void setYear(int year) {
    this.year = year;
  }
  /*
   * Sets price to newPrice
   */
  public void setPrice(double price) {
    if (price < 0) {
      price = 0;
    }
    else {
      this.price = price;
    }
  }

  public String toString() {
    return "Brand: " + carBrand + "\nName: " + name + "\nDrive train type: " + driveTrain + "\nPrice: " + price + "\nYear: " + year;
  }
  
}
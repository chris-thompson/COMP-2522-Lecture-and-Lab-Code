package code.inheritance.introToInheritance.appliances;

/**
 * Appliance.
 *
 * @author BCIT
 * @version 2020
 */
public class Appliance {

    public static final double DEFAULT_DIMENSION = 75.0;
    public static final String DEFAULT_MANUFACTURER = "Acme";
    public static final String DEFAULT_SERIAL_NUMBER = "A00000000";

    private String manufacturer;
    private String serialNumber;
    private double heightCentimetres;
    private double widthCentimetres;
    private double depthCentimetres;

    /**
     * Constructor for objects of type Appliance.
     */
    public Appliance() {
    }

    /**
     * Constructor for objects of type Appliance.
     *
     * @param manufacturer
     * @param serialNumber
     * @param heightCentimetres
     * @param widthCentimetres
     * @param depthCentimetres
     */
    public Appliance(String manufacturer,
                     String serialNumber,
                     double heightCentimetres,
                     double widthCentimetres,
                     double depthCentimetres) {
        setManufacturer(manufacturer);
        setSerialNumber(serialNumber);
        setHeightCentimetres(heightCentimetres);
        setWidthCentimetres(widthCentimetres);
        setDepthCentimetres(depthCentimetres);
    }

    /**
     * Returns the manufacturer.
     *
     * @return manufacturer as a String
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Returns the serialNumber.
     *
     * @return serialNumber as a String
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Returns the heightCentimetres.
     *
     * @return heightCentimetres as a double
     */
    public double getHeightCentimetres() {
        return heightCentimetres;
    }

    /**
     * Returns the widthCentimetres.
     *
     * @return widthCentimetres as a double
     */
    public double getWidthCentimetres() {
        return widthCentimetres;
    }

    /**
     * Returns the depthCentimetres.
     *
     * @return depthCentimetres as a double
     */
    public double getDepthCentimetres() {
        return depthCentimetres;
    }

    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the manufacturer to set
     */
    public final void setManufacturer(String manufacturer) {
        if (manufacturer != null && manufacturer.trim().length() > 0) {
            this.manufacturer = manufacturer.trim();
        }
        if (this.manufacturer == null) {
            this.manufacturer = DEFAULT_MANUFACTURER;
        }
    }

    /**
     * Sets the serialNumber.
     *
     * @param serialNumber the serialNumber to set
     */
    public final void setSerialNumber(String serialNumber) {
        if (serialNumber != null && serialNumber.trim().length() > 0) {
            this.serialNumber = serialNumber;
        }
        if (this.serialNumber == null) {
            this.serialNumber = DEFAULT_SERIAL_NUMBER;
        }
    }

    /**
     * Sets the heightCentimetres.
     *
     * @param heightCentimetres the heightCentimetres to set
     */
    public final void setHeightCentimetres(double heightCentimetres) {
        if (heightCentimetres > 0) {
            this.heightCentimetres = heightCentimetres;
        }
        if (this.heightCentimetres == 0) {
            this.heightCentimetres = DEFAULT_DIMENSION;
        }
    }

    /**
     * Sets the widthCentimetres.
     *
     * @param widthCentimetres the widthCentimetres to set
     */
    public final void setWidthCentimetres(double widthCentimetres) {
        if (widthCentimetres > 0) {
            this.widthCentimetres = widthCentimetres;
        }
        if (this.widthCentimetres == 0) {
            this.widthCentimetres = DEFAULT_DIMENSION;
        }
    }

    /**
     * Sets the depthCentimetres.
     *
     * @param depthCentimetres the depthCentimetres to set
     */
    public final void setDepthCentimetres(double depthCentimetres) {
        if (depthCentimetres > 0) {
            this.depthCentimetres = depthCentimetres;
        }
        if (this.depthCentimetres == 0) {
            this.depthCentimetres = DEFAULT_DIMENSION;
        }
    }

    /**
     * Prints the details.
     */
    public void printDetails() {
        System.out.println("Appliance [manufacturer=" + manufacturer + ", serialNumber=" + serialNumber
                + ", heightCentimetres=" + heightCentimetres + ", widthCentimetres=" + widthCentimetres
                + ", depthCentimetres=" + depthCentimetres + "]");
    }

}

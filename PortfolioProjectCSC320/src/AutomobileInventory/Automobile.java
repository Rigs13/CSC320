package AutomobileInventory;

/**
 * @author Semisi Rigby
 * A class representing an automobile with attributes of make,
 * model, color, year, and mileage.
 */
public class Automobile {

    // attributes of the AutomobileInventory.Automobile object
    private boolean integrity;
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    /**
     * Default Constructor method for an AutomobileInventory.Automobile
     */
    Automobile() {
    }

    /**
     * Parameterized Constructor for an AutomobileInventory.Automobile
     * @param make      make of the AutomobileInventory.Automobile
     * @param model     model of the AutomobileInventory.Automobile
     * @param color     color of the AutomobileInventory.Automobile
     * @param year      year of the AutomobileInventory.Automobile
     * @param mileage   mileage of the AutomobileInventory.Automobile
     */
    Automobile(String make, String model, String color, int year, int mileage) {
        // reference params to instance
        this.make = make;
        this.model = model;
        this.color = color;
        this. year = year;
        this.mileage = mileage;
    }

    /**
     * Parameterized Constructor for an AutomobileInventory.Automobile that should be used in order
     * to return a boolean relating to proper creation of the object
     * @param make          make of the AutomobileInventory.Automobile
     * @param model         model of the AutomobileInventory.Automobile
     * @param color         color of the AutomobileInventory.Automobile
     * @param year          year of the AutomobileInventory.Automobile
     * @param mileage       mileage of the AutomobileInventory.Automobile
     * @return message      determines success or failure message based on try/catch block
     */
    public String addNewAutomobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle successfully added.";
        } catch (Exception e) {
            return "Failed to create Automobile instance.";
        }

    }

    /**
     * Method used to display the information of the called Automobile object
     * using a String Array to store each attribute
     * @return new String[] String array of the attributes of the Automobile object
     */
    public String[] displayAutomobile() {
        return new String[]{
                "Make: " + make,
                "Model: " + model,
                "Color: " + color,
                "Year: " + year,
                "Mileage: " + mileage
        };
    }

    public String updateAutomobileInfo(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Automobile information has been updated.";
        } catch (Exception e) {
            return "Could not update the Automobile information.";
        }
    }

    public String removeAutomobile() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;
            return "All Automobile information has been cleared from this instance.";
        } catch (Exception e) {
            return "Unable to remove the Automobile information.";
        }
    }

} // end of class

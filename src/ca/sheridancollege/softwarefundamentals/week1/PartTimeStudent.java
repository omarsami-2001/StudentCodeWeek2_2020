package ca.sheridancollege.softwarefundamentals.week1;

/**
 *
 * @author PC
 */
public class PartTimeStudent extends Student {
    
    private int hoursOfStudy;
    public PartTimeStudent(String givenName, String givenID) {
        super(givenName, givenID);
    }

    /**
     * @return the hoursOFStudy
     */
    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    /**
     * @param hoursOFStudy the hoursOFStudy to set
     */
    public void setHoursOfStudy(int hoursOFStudy) {
        this.hoursOfStudy = hoursOFStudy;
    }
    
     
    
}

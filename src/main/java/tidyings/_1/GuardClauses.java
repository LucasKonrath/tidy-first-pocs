package tidyings._1;

import java.time.LocalDate;

public class GuardClauses {

    public boolean isDrivingAllowed(License license){
        if(license == null) return false;
        if(license.expired) return false;
        return true;
    }

    public record License(boolean expired){}

}

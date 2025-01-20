package tidyings._1;

import java.time.LocalDate;

public class GuardClauses {

    public boolean isDrivingAllowed(License license){
        if(license != null){
            if(!license.expired){
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public record License(boolean expired){}

}

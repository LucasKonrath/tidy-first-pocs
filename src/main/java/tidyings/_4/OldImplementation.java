package tidyings._4;

import java.time.Instant;

public class OldImplementation {

    public boolean isValid(){
        return Instant.now().toEpochMilli() % 2L == 0;
    }
}

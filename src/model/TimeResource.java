package model;


import java.math.BigDecimal;
import java.time.Duration;

/** holds recourse in time*/
public class TimeResource extends Resource {

    private Duration nominalResource;
    private Duration workedTime;

    @Override
    BigDecimal getUsagePercents() {
        return null;
    }
}

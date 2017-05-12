package model;


import java.math.BigDecimal;

/**
 * resource describes max amount of usages (ex. printer can have 1000 prints and then breaks)
 */
public class UsagesAmountResource extends Resource {

    private int availableAmount;
    private int usedAmount;

    @Override
    BigDecimal getUsagePercents() {
        return null;
    }
}

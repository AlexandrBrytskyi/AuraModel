package model;


import java.math.BigDecimal;

/** holds type of item resource
 * see {@link TimeResource}
 * see {@link UsagesAmountResource}*/
public abstract class Resource {

    protected int id;

    abstract BigDecimal getUsagePercents();

}

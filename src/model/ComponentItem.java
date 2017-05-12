package model;


/**
 * this type of item is used in complex items as a component part
 * such a way we can use abstract logic of counting amortization of
 * {@link ComplexItem}
 */
public class ComponentItem extends Item {

    /**
     * owner item
     */
    protected ComplexItem owner;
}

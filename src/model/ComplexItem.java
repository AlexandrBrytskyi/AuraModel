package model;


import java.util.List;

/**
 * complex item may have several {@link ComponentItem}
 * or may not have any
 * so, due to size of list logic of counting amortization may differ
 */
public abstract class ComplexItem extends Item {

    protected List<ComponentItem> components;

}

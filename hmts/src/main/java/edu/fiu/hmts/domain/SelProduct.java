package edu.fiu.hmts.domain;

/**
 * The Class SelProduct.
 */
public class SelProduct extends SelProductKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column selproduct.quantity
     *
     * 
     */
    private Integer quantity;

    /**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
    public Integer getQuantity() {
        return quantity;
    }

    /**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *            the new quantity
	 */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

    private String currency;

    private String discountCause;

    private BigDecimal value;

    public BigDecimal getDiscount() {
        return value;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public String getTotalCostCurrency() {
        return currency;
    }
}

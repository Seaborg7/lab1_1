package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Objects;

public class Discount {

    private BigDecimal value;
    private String discountCause;

    @Override
    public int hashCode() {
        return Objects.hash(discountCause, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Discount discount = (Discount) o;
        return Objects.equals(discountCause, discount.discountCause) && Objects.equals(value, discount.value);
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getDiscountCause() {
        return discountCause;
    }
}

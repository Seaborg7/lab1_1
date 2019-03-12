package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

	private String Id;

	private BigDecimal Price;

	private String Name;

	private Date SnapshotDate;

	private String Type;

	public String getId() {
		return Id;
	}

	public BigDecimal getPrice() {
		return Price;
	}

	public String getName() {
		return Name;
	}

	public Date getSnapshotDate() {
		return SnapshotDate;
	}

	public String getType() {
		return Type;
	}
}

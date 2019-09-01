package com.example.demo.beans;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Information {
	
	private String id;
	private String product;
	private LocalDateTime selldate;
	private BigDecimal price;
	
	@Override
    public String toString() {
        return "Information [id=" + this.id + ", product=" + this.product + "Sell Date,=" + this.selldate + ", price=" + price + "]";
    }
}

package mypack;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table( name =  "Products")
public class Product {
	
	private int pid;
	private String pname;
	private String category;
	private int price;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@NotEmpty(message = "not empty")

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Range(min = 0,max = 1000000,message = "pricce btwn {min} to {max}")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", category=" + category + ", price=" + price + "]";
	}

}

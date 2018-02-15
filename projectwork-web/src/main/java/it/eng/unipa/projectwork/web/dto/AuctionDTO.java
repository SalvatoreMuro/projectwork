package it.eng.unipa.projectwork.web.dto;

import java.util.Date;

public class AuctionDTO {
	
	private Long oid;
	private String title;
	private String description;
	private SupplierDTO supplier;
	private ProductDTO product;
	private Date startAuction;
	private Date endAuction;
	
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SupplierDTO getSupplier() {
		return supplier;
	}
	public void setSupplier(SupplierDTO supplier) {
		this.supplier = supplier;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public Date getStartAuction() {
		return startAuction;
	}
	public void setStartAuction(Date startAuction) {
		this.startAuction = startAuction;
	}
	public Date getEndAuction() {
		return endAuction;
	}
	public void setEndAuction(Date endAuction) {
		this.endAuction = endAuction;
	}

}

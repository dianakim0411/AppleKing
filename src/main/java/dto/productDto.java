package dto;

public class productDto {

	// Filed
	String 	product_code;
	String 	product_name;
	int 	product_qty;
	String 	origin;
	String 	manufacture_date;
	int 	weight;
	String 	size;
	String 	detail_image_name;
	int 	view_count;
	String 	product_reg_date;
	String 	kind;
	String 	product_image_names;

	// Constructor
	public productDto() {
		// TODO Auto-generated constructor stub
	}

	public productDto(
			String product_code, String product_name, int product_qty,
			String origin, String manufacture_date,
			int weight, String size, String detail_image_name,
			int view_count, String product_reg_date, String kind,
			String product_image_names) {
		super();
		
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_qty = product_qty;
		this.origin = origin;
		this.manufacture_date = manufacture_date;
		this.weight = weight;
		this.size = size;
		this.detail_image_name = detail_image_name;
		this.view_count = view_count;
		this.product_reg_date = product_reg_date;
		this.kind = kind;
		this.product_image_names = product_image_names;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDetail_image_name() {
		return detail_image_name;
	}

	public void setDetail_image_name(String detail_image_name) {
		this.detail_image_name = detail_image_name;
	}

	public int getView_count() {
		return view_count;
	}

	public void setView_count(int view_count) {
		this.view_count = view_count;
	}

	public String getProduct_reg_date() {
		return product_reg_date;
	}

	public void setProduct_reg_date(String product_reg_date) {
		this.product_reg_date = product_reg_date;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getProduct_image_names() {
		return product_image_names;
	}

	public void setProduct_image_names(String product_image_names) {
		this.product_image_names = product_image_names;
	}


	

	// Method
}
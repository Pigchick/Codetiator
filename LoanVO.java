package kr.co.creator.loan;

public class LoanVO {
	private int loan_num;
	private String loan_price;
	private String loan_period;
	private String loan_amount;
	private String loan_class;
	private String loan_purpose;
	private String repay_method;
	private int user_num;
	private int busi_num;
	
	public int getLoan_num() {
		return loan_num;
	}
	public void setLoan_num(int loan_num) {
		this.loan_num = loan_num;
	}
	public String getLoan_price() {
		return loan_price;
	}
	public void setLoan_price(String loan_price) {
		this.loan_price = loan_price;
	}
	public String getLoan_period() {
		return loan_period;
	}
	public void setLoan_period(String loan_period) {
		this.loan_period = loan_period;
	}
	public String getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_class() {
		return loan_class;
	}
	public void setLoan_class(String loan_class) {
		this.loan_class = loan_class;
	}
	public String getLoan_purpose() {
		return loan_purpose;
	}
	public void setLoan_purpose(String loan_purpose) {
		this.loan_purpose = loan_purpose;
	}
	public String getRepay_method() {
		return repay_method;
	}
	public void setRepay_method(String repay_method) {
		this.repay_method = repay_method;
	}
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public int getBusi_num() {
		return busi_num;
	}
	public void setBusi_num(int busi_num) {
		this.busi_num = busi_num;
	}

}

package in.anil.binding;

import java.time.LocalDateTime;


public class PlansResponseDto {
	
	private Integer planId;
	
	private String planName;
	
	private String status;
	
	private LocalDateTime planStartDate;
	
	private LocalDateTime planEndDate;

	public PlansResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDateTime planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDateTime getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDateTime planEndDate) {
		this.planEndDate = planEndDate;
	}

	@Override
	public String toString() {
		return "Plans [planId=" + planId + ", planName=" + planName + ", status=" + status + ", planStartDate="
				+ planStartDate + ", planEndDate=" + planEndDate + "]";
	}
	
	
}

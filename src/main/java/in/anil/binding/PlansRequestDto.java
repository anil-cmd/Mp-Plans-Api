package in.anil.binding;


public class PlansRequestDto {
	
	private Integer planId;
		
	private String planName;
	
	private String status;

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

	@Override
	public String toString() {
		return "PlansRequestDto [planId=" + planId + ", planName=" + planName + ", status=" + status + "]";
	}
	
	
}

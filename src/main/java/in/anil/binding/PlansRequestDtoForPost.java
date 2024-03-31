package in.anil.binding;


public class PlansRequestDtoForPost {
	
	private String planName;
	
	private String status;

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
		return "PlansRequestDto [planName=" + planName + ", status=" + status + "]";
	}
	
	
}

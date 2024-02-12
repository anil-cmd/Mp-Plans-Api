package in.anil.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planId;
	
	private String planName;
	
	private String status;
	
	private LocalDateTime planStartDate;
	
	private LocalDateTime planEndDate;

	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plans(Integer planId, String planName, String status, LocalDateTime planStartDate,
			LocalDateTime planEndDate) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.status = status;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
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

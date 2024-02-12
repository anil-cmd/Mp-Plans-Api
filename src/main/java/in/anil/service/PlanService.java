package in.anil.service;

import in.anil.binding.PlansRequestDto;
import in.anil.binding.PlansResponseDto;

public interface PlanService {
	
	public boolean createPlan(PlansRequestDto plansRequestDto);
	
	public PlansResponseDto getPlan(Integer planId);
	
	public boolean updatePlan(PlansResponseDto plansResponseDto);
	
	public boolean deletePlan(Integer planId);
	

}

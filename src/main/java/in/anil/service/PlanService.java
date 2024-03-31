package in.anil.service;

import java.util.List;

import in.anil.binding.PlansRequestDto;
import in.anil.binding.PlansRequestDtoForPost;
import in.anil.binding.PlansResponseDto;

public interface PlanService {
	
	public boolean createPlan(PlansRequestDtoForPost plansRequestDto);
	
	public PlansResponseDto getPlan(Integer planId);
	
	public List<PlansResponseDto> getPlans();
	
	public boolean updatePlan(PlansRequestDto plansRequestDto);
	
	public boolean deletePlan(Integer planId);
	

}

package in.anil.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anil.binding.PlansRequestDto;
import in.anil.binding.PlansResponseDto;
import in.anil.entity.Plans;
import in.anil.repo.PlansRepo;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlansRepo plansRepo;

	@Override
	public boolean createPlan(PlansRequestDto plansRequestDto) {
		Plans plans = new Plans();
		BeanUtils.copyProperties(plansRequestDto, plans);
		Plans savedPlans = plansRepo.save(plans);
		
		if(savedPlans.getPlanId() != 0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public PlansResponseDto getPlan(Integer planId) {
		Optional<Plans> planDetails = plansRepo.findById(planId);
		PlansResponseDto plans = new PlansResponseDto();
		BeanUtils.copyProperties(planDetails.get(), plans);
		if(planDetails.isPresent()) {
			return plans;
		}else {
			return null;
		}
	}

	@Override
	public boolean updatePlan(PlansResponseDto plansResponseDto) {
		Optional<Plans> plansDetails = plansRepo.findById(plansResponseDto.getPlanId());
		if(plansDetails.isPresent()) {
			BeanUtils.copyProperties(plansResponseDto, plansDetails.get());
			plansRepo.save(plansDetails.get());
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deletePlan(Integer planId) {
		plansRepo.deleteById(planId);
		return true;
	}

}

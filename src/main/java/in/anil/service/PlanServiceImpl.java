package in.anil.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anil.binding.PlansRequestDto;
import in.anil.binding.PlansRequestDtoForPost;
import in.anil.binding.PlansResponseDto;
import in.anil.entity.Plans;
import in.anil.repo.PlansRepo;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlansRepo plansRepo;

	@Override
	public boolean createPlan(PlansRequestDtoForPost plansRequestDto) {
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
	public boolean deletePlan(Integer planId) {
		plansRepo.deleteById(planId);
		return true;
	}

	@Override
	public boolean updatePlan(PlansRequestDto plansRequestDto) {
		if(plansRequestDto != null) {
			Optional<Plans> plan = plansRepo.findById(plansRequestDto.getPlanId());
			Plans planEntity = plan.get();
			BeanUtils.copyProperties(plansRequestDto, planEntity);
			Plans savedObject = plansRepo.save(planEntity);
			return (savedObject.getPlanId() == plansRequestDto.getPlanId()) ? true : false;
		}
		return false;
	}

	@Override
	public List<PlansResponseDto> getPlans() {
		List<PlansResponseDto> plansResponseDto = new ArrayList<>();
		List<Plans> allPlans = plansRepo.findAll();
		allPlans.stream().forEach(plan -> {
			PlansResponseDto plansResponseobject = new PlansResponseDto();
			BeanUtils.copyProperties(plan, plansResponseobject);
			plansResponseDto.add(plansResponseobject);
		});
		return plansResponseDto;
	}

}

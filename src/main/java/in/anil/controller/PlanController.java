package in.anil.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.anil.binding.PlansRequestDto;
import in.anil.binding.PlansRequestDtoForPost;
import in.anil.binding.PlansResponseDto;
import in.anil.service.PlanService;

@RestController
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	@PostMapping("/plan")
	public ResponseEntity<String> savePlans(@RequestBody PlansRequestDtoForPost plansRequestDto) {
		boolean status = planService.createPlan(plansRequestDto);
		
		if(status) {
			return new ResponseEntity<String>("your plan is created", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("your plan is not created", HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/plan")
	public ResponseEntity<PlansResponseDto> retrivePlan(@RequestParam("planId") Integer planId) {
		System.out.println("PLAN-ID ::" + planId);
		PlansResponseDto plan = planService.getPlan(planId);
		return new ResponseEntity<PlansResponseDto>(plan, HttpStatus.OK);
		}
	
	@PutMapping("/plan")
	public ResponseEntity<String> updatePlan(@RequestBody PlansRequestDto plansRequestDto) {
		
		boolean status = planService.updatePlan(plansRequestDto);
		
		if(status) {
			return new ResponseEntity<String>("your plan is updated", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("your plan is not updated", HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@DeleteMapping("/plan")
	public ResponseEntity<String>  deletePlan(@RequestParam("planId") Integer planId) {
		boolean status = planService.deletePlan(planId);
		
		if(status) {
			return new ResponseEntity<String>("your plan is deleted", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("your plan is not deleted", HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/plans")
	public ResponseEntity<List<PlansResponseDto>> getPlans() {
		List<PlansResponseDto> plans = planService.getPlans();
		return new ResponseEntity<List<PlansResponseDto>>(plans, HttpStatus.OK);
		}

}

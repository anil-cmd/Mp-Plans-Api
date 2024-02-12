package in.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anil.entity.Plans;

public interface PlansRepo extends JpaRepository<Plans, Integer>{

}

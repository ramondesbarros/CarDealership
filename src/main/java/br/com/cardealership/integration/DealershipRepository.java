package br.com.cardealership.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cardealership.system.domain.Dealership;

@Repository
public interface DealershipRepository extends JpaRepository<Dealership, Long> {

}

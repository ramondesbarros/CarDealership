package br.com.cardealership.integration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cardealership.system.domain.Sale;

@Repository
public interface SaleRepository extends MongoRepository<Sale, String> {

}

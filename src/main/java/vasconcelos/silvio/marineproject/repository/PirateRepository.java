package vasconcelos.silvio.marineproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vasconcelos.silvio.marineproject.data.Pirate;

@Repository
public interface PirateRepository extends CrudRepository<Pirate, String> {
}

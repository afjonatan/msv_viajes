package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Vuelo;

@Repository
public interface VuelosRepository extends JpaRepository<Vuelo, Integer> {

}

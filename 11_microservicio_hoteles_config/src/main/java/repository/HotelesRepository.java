package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Hotel;

@Repository
public interface HotelesRepository extends JpaRepository<Hotel, Integer> {

}

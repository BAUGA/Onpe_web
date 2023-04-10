package OnpeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import OnpeModel.Provincia;

@Repository
public interface IProvincia extends JpaRepository<Provincia, Integer>{
	
	@Query(value = "{call sp_getProvincia (:id)}", nativeQuery = true )
	Provincia getProvincia (int id);

}

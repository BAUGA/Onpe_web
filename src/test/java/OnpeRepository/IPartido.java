package OnpeRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import OnpeModel.Partido;

@Repository
public interface IPartido extends JpaRepository<Partido ,Integer> {
	
	@Query(value = "{call sp_getPartido(:id)}", nativeQuery = true)
	Partido getPartido(int id);

}

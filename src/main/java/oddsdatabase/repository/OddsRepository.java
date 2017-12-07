package oddsdatabase.repository;

import oddsdatabase.model.OddsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OddsRepository extends CrudRepository<OddsEntity, Long> {

    OddsEntity findByCardsInHand(@Param("cardsInHand") String cardsInHand);

}

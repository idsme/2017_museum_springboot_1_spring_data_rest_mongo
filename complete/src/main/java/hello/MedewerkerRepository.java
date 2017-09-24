
package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "medewerkers", path = "medewerkers")
public interface MedewerkerRepository extends MongoRepository<Medewerker, String> {

	List<Medewerker> findByAchterNaam(@Param("name") String name);


	//List<Medewerker> findByEmailAddressAndAchterNaam(EmailAddress emailAddress, String achterNaam);

	// Enables the distinct flag for the query
	List<Medewerker> findDistinctMedewerkersByAchterNaamOrVoorNaam(String achterNaam, String voorNaam);
	List<Medewerker> findMedewerkersDistinctByAchterNaamOrVoorNaam(String achterNaam, String voorNaam);

	// Enabling ignoring case for an individual property
	List<Medewerker> findByAchterNaamIgnoreCase(String achterNaam);
	// Enabling ignoring case for all suitable properties
	List<Medewerker> findByAchterNaamAndVoorNaamAllIgnoreCase(String achterNaam, String voorNaam);

	// Enabling static ORDER BY for a query
	List<Medewerker> findByAchterNaamOrderByVoorNaamAsc(String achterNaam);
	List<Medewerker> findByAchterNaamOrderByVoorNaamDesc(String achterNaam);

}

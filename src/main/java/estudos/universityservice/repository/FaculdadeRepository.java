package estudos.universityservice.repository;

import estudos.universityservice.model.Faculdade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculdadeRepository extends PagingAndSortingRepository<Faculdade, String> {


}


package estudos.universityservice.repository;

import estudos.universityservice.model.Professor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends PagingAndSortingRepository<Professor,String> {



}


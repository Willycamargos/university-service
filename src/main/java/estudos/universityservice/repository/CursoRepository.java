package estudos.universityservice.repository;

import estudos.universityservice.model.Curso;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends PagingAndSortingRepository<Curso,String> {



}


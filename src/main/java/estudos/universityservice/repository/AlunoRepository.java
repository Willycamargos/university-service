package estudos.universityservice.repository;

import estudos.universityservice.model.Aluno;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends PagingAndSortingRepository<Aluno,String> {



}


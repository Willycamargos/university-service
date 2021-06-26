package estudos.universityservice.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "faculdade")
public class Faculdade {

    @Id
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid2")
    @Column(name = "id_faculdade", columnDefinition = "VARCHAR(36)")
    private String idFaculdade;
    private String nome;
    private String cnpj;

    @OneToMany(orphanRemoval = true)
    private List<Professor> professores;

    @OneToMany
    private List<Curso> cursos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", columnDefinition = "VARCHAR(36)")
    private Endereco endereco;

    public String getIdFaculdade() {
        return idFaculdade;
    }

    public void setIdFaculdade(String idFaculdade) {
        this.idFaculdade = idFaculdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

package bean;
// Generated 04/12/2024 10:52:45 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuarios"
    ,catalog="aulas"
)
public class Usuarios  implements java.io.Serializable {


     private int idusuarios;
     private String nome;
     private String apelido;
     private String cpf;
     private Date dataNascimento;
     private String senha;
     private int nivel;
     private String ativo;

    public Usuarios() {
    }

	
    public Usuarios(int idusuarios, String nome, String apelido, String senha, int nivel, String ativo) {
        this.idusuarios = idusuarios;
        this.nome = nome;
        this.apelido = apelido;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = ativo;
    }
    public Usuarios(int idusuarios, String nome, String apelido, String cpf, Date dataNascimento, String senha, int nivel, String ativo) {
       this.idusuarios = idusuarios;
       this.nome = nome;
       this.apelido = apelido;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
       this.senha = senha;
       this.nivel = nivel;
       this.ativo = ativo;
    }
   
     @Id 

    
    @Column(name="idusuarios", unique=true, nullable=false)
    public int getIdusuarios() {
        return this.idusuarios;
    }
    
    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="apelido", nullable=false, length=45)
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    
    @Column(name="cpf", length=15)
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento", length=10)
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    @Column(name="senha", nullable=false, length=15)
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Column(name="nivel", nullable=false)
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    @Column(name="ativo", nullable=false, length=1)
    public String getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }




}


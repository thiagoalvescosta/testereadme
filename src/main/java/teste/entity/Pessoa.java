package teste.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PESSOA
* @generated
*/
@Entity
@Table(name = "\"PESSOA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("teste.entity.Pessoa")
public class Pessoa implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_cidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Cidade cidade;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="class1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Class1 class1;

    /**
    * Construtor
    * @generated
    */
    public Pessoa(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Pessoa setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Pessoa setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    
    public Cidade getCidade(){
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public Pessoa setCidade(Cidade cidade){
        this.cidade = cidade;
        return this;
    }
    /**
    * Obtém class1
    * return class1
    * @generated
    */
    
    public Class1 getClass1(){
        return this.class1;
    }

    /**
    * Define class1
    * @param class1 class1
    * @generated
    */
    public Pessoa setClass1(Class1 class1){
        this.class1 = class1;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pessoa object = (Pessoa)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
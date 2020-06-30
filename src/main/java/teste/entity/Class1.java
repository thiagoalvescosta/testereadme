package teste.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiCloud;


/**
* Classe que representa a tabela CLASS1
* @generated
*/
@Entity
@Table(name = "\"CLASS1\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("teste.entity.Class1")
public class Class1 implements Serializable {

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
    @Column(name = "attribute01", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute01;

    /**
    * @generated
    */
    @Column(name = "attribute02", nullable = false, unique = false, insertable=true, updatable=true)
    @CronapiCloud(type = "dropbox", value="rqo0dohq8hn0jja", id="", secret="")
        
        private java.lang.String attribute02;

    /**
    * Construtor
    * @generated
    */
    public Class1(){
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
    public Class1 setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém attribute01
    * return attribute01
    * @generated
    */
    
    public java.lang.String getAttribute01(){
        return this.attribute01;
    }

    /**
    * Define attribute01
    * @param attribute01 attribute01
    * @generated
    */
    public Class1 setAttribute01(java.lang.String attribute01){
        this.attribute01 = attribute01;
        return this;
    }
    /**
    * Obtém attribute02
    * return attribute02
    * @generated
    */
    
    public java.lang.String getAttribute02(){
        return this.attribute02;
    }

    /**
    * Define attribute02
    * @param attribute02 attribute02
    * @generated
    */
    public Class1 setAttribute02(java.lang.String attribute02){
        this.attribute02 = attribute02;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Class1 object = (Class1)obj;
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
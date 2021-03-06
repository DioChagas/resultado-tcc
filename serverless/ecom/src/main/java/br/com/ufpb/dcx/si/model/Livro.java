package br.com.ufpb.dcx.si.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "PLACEHOLDER_ECOM_LIVRO_TABLE_NAME")

public class Livro{
    
    private String idLivro;

    
/**
* Titulo.
*/
    private String titulo;

/**
* Autor.
*/
    private String autor;

/**
* Edicao.
*/
    private Integer edicao;


    public Livro(){
    // TODO Auto-generated constructor stub
    }

    @DynamoDBHashKey(attributeName="idlivro")
    
    @DynamoDBAutoGeneratedKey 
    public String getIdLivro(){
        return this.idLivro;
    }

    public void setIdLivro(String idLivro){
        this.idLivro=idLivro;
    }

        /**
    * Gets the titulo.
    *
    * @return titulo.
    */
    @DynamoDBAttribute(attributeName = "titulo")
    public String getTitulo() {
        return titulo;
    }
    /**
    * Gets the autor.
    *
    * @return autor.
    */
    @DynamoDBAttribute(attributeName = "autor")
    public String getAutor() {
        return autor;
    }
    /**
    * Gets the edicao.
    *
    * @return edicao.
    */
    @DynamoDBAttribute(attributeName = "edicao")
    public Integer getEdicao() {
        return edicao;
    }

    
        /**
    * Sets the titulo.
    *
    * @param name titulo.
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
    * Sets the autor.
    *
    * @param name autor.
    */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
    * Sets the edicao.
    *
    * @param name edicao.
    */
    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }


    public String toString(){
        
        return null;
        /*
         * for example:
         * return String.format("Entity [id=%s, name=%s, price=$%f]", this.id, this.name, this.price);
         */
    }
}

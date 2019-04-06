package br.com.ufpb.dcx.si.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "PLACEHOLDER_ECOM_PRODUTO_TABLE_NAME")

public class Produto{
    
    private String idProduto;

    
/**
* Name.
*/
    private String name;

/**
* Price.
*/
    private Double price;


    public Produto(){
    // TODO Auto-generated constructor stub
    }

    @DynamoDBHashKey(attributeName="idproduto")
    
    @DynamoDBAutoGeneratedKey 
    public String getIdProduto(){
        return this.idProduto;
    }

    public void setIdProduto(String idProduto){
        this.idProduto=idProduto;
    }

        /**
    * Gets the name.
    *
    * @return name.
    */
    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }
    /**
    * Gets the price.
    *
    * @return price.
    */
    @DynamoDBAttribute(attributeName = "price")
    public Double getPrice() {
        return price;
    }

    
        /**
    * Sets the name.
    *
    * @param name name.
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * Sets the price.
    *
    * @param name price.
    */
    public void setPrice(Double price) {
        this.price = price;
    }


    public String toString(){
        
        return null;
        /*
         * for example:
         * return String.format("Entity [id=%s, name=%s, price=$%f]", this.id, this.name, this.price);
         */
    }
}
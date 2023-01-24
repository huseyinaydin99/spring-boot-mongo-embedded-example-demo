package tr.com.huseyinaydin.spring.mongo.embeded.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot MongoDB Embedded
 * 
 */

@Data
@AllArgsConstructor
@Document(collection = "order_DB")
public class User {
	@Id
	private int id;
	private String name;
	private String gender;
	private List<Product> products;
	private Address address;

}

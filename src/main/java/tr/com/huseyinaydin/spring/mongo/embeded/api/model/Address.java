package tr.com.huseyinaydin.spring.mongo.embeded.api.model;

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
public class Address {
	private String city;
	private String state;
	private String pincode;
}

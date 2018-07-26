/**
 * 
 */
package com.barebones.prototype.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author e043057
 *
 */
@Entity
public class Keyval {
	
	@Id
    @GeneratedValue
    Integer id;

	String key;
	
	String data;

	
	
	
	public Integer getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public String getData() {
		return data;
	}
	
}

/**
 * 
 */
package com.barebones.prototype.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.barebones.prototype.pojo.Keyval;

/**
 * @author e043057
 *
 */
@Repository
public interface KeyvalRepository extends PagingAndSortingRepository<Keyval, Long> {
	
	
	

}

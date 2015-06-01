/**
 * 
 */
package com.humanbooster.zobi.dao;

import javax.ejb.Stateless;

import com.humanbooster.zobi.business.Species;

/**
 * @author humanbooster
 *
 */
@Stateless
public class SpeciesDaoJpa extends DaoJpa<Integer, Species> implements SpeciesDaoInterface {
	

}

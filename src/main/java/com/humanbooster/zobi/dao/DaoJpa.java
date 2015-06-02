/**
 * 
 */
package com.humanbooster.zobi.dao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author humanbooster
 *
 */
public abstract class DaoJpa<K, E> implements Dao<K, E> {

	protected Class<E> entityClass;
	@Inject
	@PersistenceContext
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public DaoJpa() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
	}

	/**
	 * @param entity E the entity to save.
	 * @see com.humanbooster.zobi.dao.Dao#persist(java.lang.Object)
	 */
	public void persist(E entity) {
		entityManager.persist(entity);
	}

	/**
	 * @param entity E the entity to delete.
	 * @see com.humanbooster.zobi.dao.Dao#remove(java.lang.Object)
	 */
	public void remove(E entity) {
		entityManager.remove(entity);
	}

	/**
	 * @param id K the index of the entity.
	 * @return E an entity.
	 * @see com.humanbooster.zobi.dao.Dao#findById(java.lang.Object)
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public E findById(K id) {
		return entityManager.find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	/**
	 * @return a collection of entities.
	 * @see com.humanbooster.zobi.dao.Dao#findAll()
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Collection<E> findAll() {
		return entityManager.createNamedQuery(entityClass.getSimpleName() + ".findAll").getResultList();
	}

}

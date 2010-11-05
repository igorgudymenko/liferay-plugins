/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.workflow.kaleo.model.KaleoCondition;

import java.util.List;

/**
 * The persistence utility for the kaleo condition service. This utility wraps {@link KaleoConditionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoConditionPersistence
 * @see KaleoConditionPersistenceImpl
 * @generated
 */
public class KaleoConditionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(KaleoCondition kaleoCondition) {
		getPersistence().clearCache(kaleoCondition);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KaleoCondition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KaleoCondition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KaleoCondition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static KaleoCondition remove(KaleoCondition kaleoCondition)
		throws SystemException {
		return getPersistence().remove(kaleoCondition);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static KaleoCondition update(KaleoCondition kaleoCondition,
		boolean merge) throws SystemException {
		return getPersistence().update(kaleoCondition, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static KaleoCondition update(KaleoCondition kaleoCondition,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(kaleoCondition, merge, serviceContext);
	}

	/**
	* Caches the kaleo condition in the entity cache if it is enabled.
	*
	* @param kaleoCondition the kaleo condition to cache
	*/
	public static void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition) {
		getPersistence().cacheResult(kaleoCondition);
	}

	/**
	* Caches the kaleo conditions in the entity cache if it is enabled.
	*
	* @param kaleoConditions the kaleo conditions to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> kaleoConditions) {
		getPersistence().cacheResult(kaleoConditions);
	}

	/**
	* Creates a new kaleo condition with the primary key. Does not add the kaleo condition to the database.
	*
	* @param kaleoConditionId the primary key for the new kaleo condition
	* @return the new kaleo condition
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition create(
		long kaleoConditionId) {
		return getPersistence().create(kaleoConditionId);
	}

	/**
	* Removes the kaleo condition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoConditionId the primary key of the kaleo condition to remove
	* @return the kaleo condition that was removed
	* @throws com.liferay.portal.workflow.kaleo.NoSuchConditionException if a kaleo condition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition remove(
		long kaleoConditionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		return getPersistence().remove(kaleoConditionId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kaleoCondition, merge);
	}

	/**
	* Finds the kaleo condition with the primary key or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchConditionException} if it could not be found.
	*
	* @param kaleoConditionId the primary key of the kaleo condition to find
	* @return the kaleo condition
	* @throws com.liferay.portal.workflow.kaleo.NoSuchConditionException if a kaleo condition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition findByPrimaryKey(
		long kaleoConditionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		return getPersistence().findByPrimaryKey(kaleoConditionId);
	}

	/**
	* Finds the kaleo condition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kaleoConditionId the primary key of the kaleo condition to find
	* @return the kaleo condition, or <code>null</code> if a kaleo condition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition fetchByPrimaryKey(
		long kaleoConditionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(kaleoConditionId);
	}

	/**
	* Finds all the kaleo conditions where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Finds a range of all the kaleo conditions where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of kaleo conditions to return
	* @param end the upper bound of the range of kaleo conditions to return (not inclusive)
	* @return the range of matching kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Finds an ordered range of all the kaleo conditions where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of kaleo conditions to return
	* @param end the upper bound of the range of kaleo conditions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Finds the first kaleo condition in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo condition
	* @throws com.liferay.portal.workflow.kaleo.NoSuchConditionException if a matching kaleo condition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Finds the last kaleo condition in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo condition
	* @throws com.liferay.portal.workflow.kaleo.NoSuchConditionException if a matching kaleo condition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Finds the kaleo conditions before and after the current kaleo condition in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoConditionId the primary key of the current kaleo condition
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo condition
	* @throws com.liferay.portal.workflow.kaleo.NoSuchConditionException if a kaleo condition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition[] findByCompanyId_PrevAndNext(
		long kaleoConditionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(kaleoConditionId, companyId,
			orderByComparator);
	}

	/**
	* Finds the kaleo condition where className = &#63; and classPK = &#63; or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchConditionException} if it could not be found.
	*
	* @param className the class name to search with
	* @param classPK the class p k to search with
	* @return the matching kaleo condition
	* @throws com.liferay.portal.workflow.kaleo.NoSuchConditionException if a matching kaleo condition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition findByC_C(
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		return getPersistence().findByC_C(className, classPK);
	}

	/**
	* Finds the kaleo condition where className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param className the class name to search with
	* @param classPK the class p k to search with
	* @return the matching kaleo condition, or <code>null</code> if a matching kaleo condition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition fetchByC_C(
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_C(className, classPK);
	}

	/**
	* Finds the kaleo condition where className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param className the class name to search with
	* @param classPK the class p k to search with
	* @return the matching kaleo condition, or <code>null</code> if a matching kaleo condition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoCondition fetchByC_C(
		java.lang.String className, long classPK, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_C(className, classPK, retrieveFromCache);
	}

	/**
	* Finds all the kaleo conditions.
	*
	* @return the kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the kaleo conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo conditions to return
	* @param end the upper bound of the range of kaleo conditions to return (not inclusive)
	* @return the range of kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the kaleo conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo conditions to return
	* @param end the upper bound of the range of kaleo conditions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the kaleo conditions where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes the kaleo condition where className = &#63; and classPK = &#63; from the database.
	*
	* @param className the class name to search with
	* @param classPK the class p k to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_C(java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchConditionException {
		getPersistence().removeByC_C(className, classPK);
	}

	/**
	* Removes all the kaleo conditions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the kaleo conditions where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the kaleo conditions where className = &#63; and classPK = &#63;.
	*
	* @param className the class name to search with
	* @param classPK the class p k to search with
	* @return the number of matching kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C(java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C(className, classPK);
	}

	/**
	* Counts all the kaleo conditions.
	*
	* @return the number of kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KaleoConditionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KaleoConditionPersistence)PortletBeanLocatorUtil.locate(com.liferay.portal.workflow.kaleo.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					KaleoConditionPersistence.class.getName());

			ReferenceRegistry.registerReference(KaleoConditionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(KaleoConditionPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(KaleoConditionUtil.class,
			"_persistence");
	}

	private static KaleoConditionPersistence _persistence;
}
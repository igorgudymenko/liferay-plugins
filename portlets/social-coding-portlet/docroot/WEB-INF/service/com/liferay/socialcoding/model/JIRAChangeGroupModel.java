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

package com.liferay.socialcoding.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JIRAChangeGroup service. Represents a row in the &quot;changegroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialcoding.model.impl.JIRAChangeGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.socialcoding.model.impl.JIRAChangeGroupImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAChangeGroup
 * @see com.liferay.socialcoding.model.impl.JIRAChangeGroupImpl
 * @see com.liferay.socialcoding.model.impl.JIRAChangeGroupModelImpl
 * @generated
 */
public interface JIRAChangeGroupModel extends BaseModel<JIRAChangeGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a j i r a change group model instance should use the {@link JIRAChangeGroup} interface instead.
	 */

	/**
	 * Gets the primary key of this j i r a change group.
	 *
	 * @return the primary key of this j i r a change group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this j i r a change group
	 *
	 * @param pk the primary key of this j i r a change group
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the jira change group id of this j i r a change group.
	 *
	 * @return the jira change group id of this j i r a change group
	 */
	public long getJiraChangeGroupId();

	/**
	 * Sets the jira change group id of this j i r a change group.
	 *
	 * @param jiraChangeGroupId the jira change group id of this j i r a change group
	 */
	public void setJiraChangeGroupId(long jiraChangeGroupId);

	/**
	 * Gets the jira user id of this j i r a change group.
	 *
	 * @return the jira user id of this j i r a change group
	 */
	@AutoEscape
	public String getJiraUserId();

	/**
	 * Sets the jira user id of this j i r a change group.
	 *
	 * @param jiraUserId the jira user id of this j i r a change group
	 */
	public void setJiraUserId(String jiraUserId);

	/**
	 * Gets the create date of this j i r a change group.
	 *
	 * @return the create date of this j i r a change group
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this j i r a change group.
	 *
	 * @param createDate the create date of this j i r a change group
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the jira issue id of this j i r a change group.
	 *
	 * @return the jira issue id of this j i r a change group
	 */
	public long getJiraIssueId();

	/**
	 * Sets the jira issue id of this j i r a change group.
	 *
	 * @param jiraIssueId the jira issue id of this j i r a change group
	 */
	public void setJiraIssueId(long jiraIssueId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(JIRAChangeGroup jiraChangeGroup);

	public int hashCode();

	public JIRAChangeGroup toEscapedModel();

	public String toString();

	public String toXmlString();
}
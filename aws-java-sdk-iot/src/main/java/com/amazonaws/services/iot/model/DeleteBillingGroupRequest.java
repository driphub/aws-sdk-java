/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBillingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the billing group.
     * </p>
     */
    private String billingGroupName;
    /**
     * <p>
     * The expected version of the billing group. If the version of the billing group does not match the expected
     * version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group.
     */

    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * 
     * @return The name of the billing group.
     */

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBillingGroupRequest withBillingGroupName(String billingGroupName) {
        setBillingGroupName(billingGroupName);
        return this;
    }

    /**
     * <p>
     * The expected version of the billing group. If the version of the billing group does not match the expected
     * version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the billing group. If the version of the billing group does not match the expected
     *        version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     *        <code>VersionConflictException</code>.
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the billing group. If the version of the billing group does not match the expected
     * version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @return The expected version of the billing group. If the version of the billing group does not match the
     *         expected version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     *         <code>VersionConflictException</code>.
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * The expected version of the billing group. If the version of the billing group does not match the expected
     * version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the billing group. If the version of the billing group does not match the expected
     *        version specified in the request, the <code>DeleteBillingGroup</code> request is rejected with a
     *        <code>VersionConflictException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBillingGroupRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBillingGroupName() != null)
            sb.append("BillingGroupName: ").append(getBillingGroupName()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBillingGroupRequest == false)
            return false;
        DeleteBillingGroupRequest other = (DeleteBillingGroupRequest) obj;
        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBillingGroupRequest clone() {
        return (DeleteBillingGroupRequest) super.clone();
    }

}

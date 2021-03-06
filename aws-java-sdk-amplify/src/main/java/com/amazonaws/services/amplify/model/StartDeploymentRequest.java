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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request structure for the start a deployment request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The job ID for this deployment, generated by the create deployment request.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The source URL for this deployment, used when calling start deployment without create deployment. The source URL
     * can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     * </p>
     */
    private String sourceUrl;

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @return The unique ID for an Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * 
     * @param branchName
     *        The name for the branch, for the job.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * 
     * @return The name for the branch, for the job.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name for the branch, for the job.
     * </p>
     * 
     * @param branchName
     *        The name for the branch, for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The job ID for this deployment, generated by the create deployment request.
     * </p>
     * 
     * @param jobId
     *        The job ID for this deployment, generated by the create deployment request.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for this deployment, generated by the create deployment request.
     * </p>
     * 
     * @return The job ID for this deployment, generated by the create deployment request.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for this deployment, generated by the create deployment request.
     * </p>
     * 
     * @param jobId
     *        The job ID for this deployment, generated by the create deployment request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The source URL for this deployment, used when calling start deployment without create deployment. The source URL
     * can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     * </p>
     * 
     * @param sourceUrl
     *        The source URL for this deployment, used when calling start deployment without create deployment. The
     *        source URL can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     */

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * <p>
     * The source URL for this deployment, used when calling start deployment without create deployment. The source URL
     * can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     * </p>
     * 
     * @return The source URL for this deployment, used when calling start deployment without create deployment. The
     *         source URL can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     */

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * <p>
     * The source URL for this deployment, used when calling start deployment without create deployment. The source URL
     * can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     * </p>
     * 
     * @param sourceUrl
     *        The source URL for this deployment, used when calling start deployment without create deployment. The
     *        source URL can be any HTTP GET URL that is publicly accessible and downloads a single .zip file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withSourceUrl(String sourceUrl) {
        setSourceUrl(sourceUrl);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getSourceUrl() != null)
            sb.append("SourceUrl: ").append(getSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeploymentRequest == false)
            return false;
        StartDeploymentRequest other = (StartDeploymentRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getSourceUrl() == null ^ this.getSourceUrl() == null)
            return false;
        if (other.getSourceUrl() != null && other.getSourceUrl().equals(this.getSourceUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public StartDeploymentRequest clone() {
        return (StartDeploymentRequest) super.clone();
    }

}

/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DescribeLocationS3Request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationS3Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     * </p>
     */
    private String locationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Request withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationS3Request == false)
            return false;
        DescribeLocationS3Request other = (DescribeLocationS3Request) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationS3Request clone() {
        return (DescribeLocationS3Request) super.clone();
    }

}

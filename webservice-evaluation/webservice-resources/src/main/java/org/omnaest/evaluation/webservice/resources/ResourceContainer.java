/*******************************************************************************
 * Copyright 2011 Danny Kunz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.omnaest.evaluation.webservice.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.omnaest.evaluation.webservice.datastore.DataStore;
import org.omnaest.utils.xml.JAXBMap;

/**
 * Container for direct access of the {@link DataStore} and to access resources via subresource location.
 * 
 * @author Omnaest
 */
@Path("ResourceContainer")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public interface ResourceContainer
{
  
  @GET
  public JAXBMap<String, String> getContent();
  
  @PUT
  @MatrixParam("param")
  public void setContent( JAXBMap<String, String> map );
  
  @Path("ResourceAccessorPathParam")
  @GET
  public ResourceAccessorPathParam resourceAccessorPathParam();
  
}

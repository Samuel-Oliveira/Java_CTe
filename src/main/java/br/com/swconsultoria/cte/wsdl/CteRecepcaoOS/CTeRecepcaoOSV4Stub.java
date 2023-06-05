
/**
 * CTeRecepcaoOSV4Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package br.com.swconsultoria.cte.wsdl.CteRecepcaoOS;

/*
*  CTeRecepcaoOSV4Stub java implementation
*/

public class CTeRecepcaoOSV4Stub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("CTeRecepcaoOSV4" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[1];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4",
				"cteRecepcaoOS"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public CTeRecepcaoOSV4Stub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public CTeRecepcaoOSV4Stub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient.getOptions()
				.setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Default Constructor
	 */
	public CTeRecepcaoOSV4Stub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "https://cte-homologacao.svrs.rs.gov.br/ws/CTeRecepcaoOSV4/CTeRecepcaoOSV4.asmx");

	}

	/**
	 * Default Constructor
	 */
	public CTeRecepcaoOSV4Stub() throws org.apache.axis2.AxisFault {

		this("https://cte-homologacao.svrs.rs.gov.br/ws/CTeRecepcaoOSV4/CTeRecepcaoOSV4.asmx");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public CTeRecepcaoOSV4Stub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see br.inf.portalfiscal.www.cte.wsdl.cterecepcaoosv4.CTeRecepcaoOSV4#cteRecepcaoOS
	 * @param cteDadosMsg0
	 * 
	 */

	public br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult cteRecepcaoOS(

			br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg cteDadosMsg0)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions()
					.setAction("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4/cteRecepcaoOS");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), cteDadosMsg0,
					optimizeContent(new javax.xml.namespace.QName(
							"http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4", "cteRecepcaoOS")),
					new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4",
							"cteDadosMsg"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult.class);

			return (br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoOS"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoOS"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoOS"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see br.inf.portalfiscal.www.cte.wsdl.cterecepcaoosv4.CTeRecepcaoOSV4#startcteRecepcaoOS
	 * @param cteDadosMsg0
	 * 
	 */
	public void startcteRecepcaoOS(

			br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg cteDadosMsg0,

			final br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4CallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions()
				.setAction("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4/cteRecepcaoOS");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), cteDadosMsg0,
				optimizeContent(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4",
						"cteRecepcaoOS")),
				new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4",
						"cteDadosMsg"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult.class);
					callback.receiveResultcteRecepcaoOS(
							(br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorcteRecepcaoOS(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoOS"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoOS"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoOS"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorcteRecepcaoOS(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcteRecepcaoOS(f);
							}
						} else {
							callback.receiveErrorcteRecepcaoOS(f);
						}
					} else {
						callback.receiveErrorcteRecepcaoOS(f);
					}
				} else {
					callback.receiveErrorcteRecepcaoOS(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcteRecepcaoOS(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// https://cte-homologacao.svrs.rs.gov.br/ws/CTeRecepcaoOSV4/CTeRecepcaoOSV4.asmx
	public static class CteRecepcaoOSResult implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4", "cteRecepcaoOSResult", "ns1");

		/**
		 * field for ExtraElement
		 */

		protected org.apache.axiom.om.OMElement localExtraElement;

		/**
		 * Auto generated getter method
		 * 
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getExtraElement() {
			return localExtraElement;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ExtraElement
		 */
		public void setExtraElement(org.apache.axiom.om.OMElement param) {

			this.localExtraElement = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":cteRecepcaoOSResult", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "cteRecepcaoOSResult",
							xmlWriter);
				}

			}

			if (localExtraElement != null) {
				localExtraElement.serialize(xmlWriter);
			} else {
				throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if (namespace.equals("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {
			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
					.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static CteRecepcaoOSResult parse(javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				CteRecepcaoOSResult object = new CteRecepcaoOSResult();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					currentQName = reader.getName();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						java.lang.String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"cteRecepcaoOSResult".equals(type)) {
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (CteRecepcaoOSResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()) {

						// use the QName from the parser as the name for the builder
						javax.xml.namespace.QName startQname1 = reader.getName();

						// We need to wrap the reader so that it produces a fake START_DOCUMENT event
						// this is needed by the builder classes
						org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(
								new org.apache.axis2.util.StreamWrapper(reader), startQname1);
						object.setExtraElement(builder1.getOMElement());

						reader.next();

					} // End of if for expected property start element

					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was
						// passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// 2 - A start element we are not expecting indicates a trailing invalid
						// property

						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class CteDadosMsg implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4", "cteDadosMsg", "ns1");

		/**
		 * field for String
		 */

		protected java.lang.String localString;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getString() {
			return localString;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param String
		 */
		public void setString(java.lang.String param) {

			this.localString = param;

		}

		public java.lang.String toString() {

			return localString.toString();

		}

		/**
		 * field for ExtraAttributes This was an Attribute! This was an Array!
		 */

		protected org.apache.axiom.om.OMAttribute[] localExtraAttributes;

		/**
		 * Auto generated getter method
		 * 
		 * @return org.apache.axiom.om.OMAttribute[]
		 */
		public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
			return localExtraAttributes;
		}

		/**
		 * validate the array for ExtraAttributes
		 */
		protected void validateExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

			if ((param != null) && (param.length > 1)) {
				throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
			}

			if ((param != null) && (param.length < 1)) {
				throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
			}

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ExtraAttributes
		 */
		public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

			validateExtraAttributes(param);

			this.localExtraAttributes = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param org.apache.axiom.om.OMAttribute
		 */
		public void addExtraAttributes(org.apache.axiom.om.OMAttribute param) {
			if (localExtraAttributes == null) {
				localExtraAttributes = new org.apache.axiom.om.OMAttribute[] {};
			}

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraAttributes);
			list.add(param);
			this.localExtraAttributes = (org.apache.axiom.om.OMAttribute[]) list
					.toArray(new org.apache.axiom.om.OMAttribute[list.size()]);

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":cteDadosMsg", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "cteDadosMsg",
							xmlWriter);
				}

			}

			if (localExtraAttributes != null) {
				for (int i = 0; i < localExtraAttributes.length; i++) {
					writeAttribute(localExtraAttributes[i].getNamespace().getName(),
							localExtraAttributes[i].getLocalName(), localExtraAttributes[i].getAttributeValue(),
							xmlWriter);
				}
			}

			if (localString == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("string cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localString);

			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if (namespace.equals("http://www.portalfiscal.inf.br/cte/wsdl/CTeRecepcaoOSV4")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {
			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
					.getLog(Factory.class);

			public static CteDadosMsg fromString(java.lang.String value, java.lang.String namespaceURI) {
				CteDadosMsg returnValue = new CteDadosMsg();

				returnValue.setString(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

				return returnValue;
			}

			public static CteDadosMsg fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
					java.lang.String content) {
				if (content.indexOf(":") > -1) {
					java.lang.String prefix = content.substring(0, content.indexOf(":"));
					java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
					return CteDadosMsg.Factory.fromString(content, namespaceUri);
				} else {
					return CteDadosMsg.Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static CteDadosMsg parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
				CteDadosMsg object = new CteDadosMsg();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					currentQName = reader.getName();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						java.lang.String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"cteDadosMsg".equals(type)) {
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (CteDadosMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					// now run through all any or extra attributes
					// which were not reflected until now
					for (int i = 0; i < reader.getAttributeCount(); i++) {
						if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
							// this is an anyAttribute and we create
							// an OMAttribute for this
							org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory
									.getOMFactory();
							org.apache.axiom.om.OMAttribute attr = factory.createOMAttribute(
									reader.getAttributeLocalName(i),
									factory.createOMNamespace(reader.getAttributeNamespace(i),
											reader.getAttributePrefix(i)),
									reader.getAttributeValue(i));

							// and add it to the extra attributes

							object.addExtraAttributes(attr);

						}
					}

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							if (reader.isStartElement() || reader.hasText()) {

								nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
										"nil");
								if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
									throw new org.apache.axis2.databinding.ADBException(
											"The element: " + "string" + "  cannot be null");
								}

								java.lang.String content = reader.getElementText();

								object.setString(
										org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							} // End of if for expected property start element

							else {
								// 3 - A start element we are not expecting indicates an invalid parameter was
								// passed

								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());

							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ExtensionMapper {

		public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
				javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

			throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg param,
			boolean optimizeContent, javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
			throws org.apache.axis2.AxisFault {

		try {

			if (br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg.class.equals(type)) {

				return br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteDadosMsg.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult.class
					.equals(type)) {

				return br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub.CteRecepcaoOSResult.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}

<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:strip-space elements="*"/>	
	<xsl:output method="xml" indent="yes" encoding="UTF-8" cdata-section-elements="dependenciesScript"  doctype-system="mp.dtd" />
			
	<xsl:param name ="current-date" />
	<xsl:param name ="current-time" />
	<xsl:param name ="title" />
	<xsl:param name ="subtitle" />
	<xsl:param name ="docnum" />
	<xsl:param name ="docrev" />
	<xsl:param name ="doclang" />
	<xsl:param name ="docdate" />
	<xsl:param name ="createdby" />
	<xsl:param name ="approvedby" />
	
	<xsl:template match="/">	
	<xsl:comment>
	Copyright (c) 2013 Ericsson AB. 
	All rights reserved 

	MpXmlMerge generated this file on <xsl:value-of  select="$current-date"/> at <xsl:value-of  select="$current-time"/>.
	Merged files:<xsl:for-each select="/contents/mpfile">
	 * <xsl:value-of select="@name"/>
		
	</xsl:for-each>
	
	</xsl:comment>
<models>
    <dtdVersion>G</dtdVersion>
    <momMetaData>
        <momTitle><xsl:value-of  select="$title"/></momTitle>
        <momSubTitle><xsl:value-of  select="$subtitle"/></momSubTitle>
        <momIdentity>
            <docNum><xsl:value-of  select="$docnum"/></docNum>
            <docLang><xsl:value-of  select="$doclang"/></docLang>
            <docRev><xsl:value-of  select="$docrev"/></docRev>
            <docDate><xsl:value-of  select="$docdate"/></docDate>
        </momIdentity>
        <createdBy>
            <signature><xsl:value-of  select="$createdby"/></signature>
       	</createdBy>
        <approvedBy>
            <signature><xsl:value-of  select="$approvedby"/></signature>
        </approvedBy>
    </momMetaData>
		<xsl:for-each select="/contents/mpfile">	
			<xsl:apply-templates select="document(@name)/models"/> 
		</xsl:for-each>	
	<mim name="EcimCommon" release="1" version="1">
				<class name="ManagedObject">
					<description>The ManagedObject MO represents a generic MO type. It does not represent any real resource in the system and can therefore not be instanciated. It is used as a MO-reference that can refer to multiple MO types.</description>
				</class>
	</mim>	
</models>	
	</xsl:template>
	
	<xsl:template match="@*|node()">
		<xsl:copy-of select="mim[@name!='EcimCommon']"/>
		<xsl:copy-of select="mib"/>
		<xsl:copy-of select="interMim"/>
	</xsl:template>

</xsl:stylesheet>
    
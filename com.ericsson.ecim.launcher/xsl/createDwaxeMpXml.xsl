<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" cdata-section-elements="dependenciesScript rule"  doctype-system="mp.dtd" />
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="models">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />		
			<mim name="EcimCommon" release="1" version="1">
				<class name="ManagedObject">
					<description>The ManagedObject MO represents a generic MO type. It does not represent any real resource in the system and can therefore not be instanciated. It is used as a MO-reference that can refer to multiple MO types.</description>
				</class>
			</mim>
		</xsl:copy>
	</xsl:template>
	<xsl:template match="moRef[@name='ManagedObject']">
		<xsl:copy>
			<xsl:copy-of select="@*|node()[local-name() != 'mimName']"/> <!-- Copy everything except for the mimName element -->
			<mimName>EcimCommon</mimName>	<!-- Hardcoded special mimName element -->	
		</xsl:copy>
	</xsl:template>	
</xsl:stylesheet>
<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:param name="mimName" />
	<xsl:strip-space elements="*"/>	
	<xsl:output method="xml" indent="yes" encoding="UTF-8" cdata-section-elements="dependenciesScript rule"  doctype-system="mp.dtd" />
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="mim[@name!=$mimName]" />
	<xsl:template
		match="interMim[relationship/containment/child/hasClass[mimName!=$mimName]]" />
	<xsl:template match="mib" />

</xsl:stylesheet>
    
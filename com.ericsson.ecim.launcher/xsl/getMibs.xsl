<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text"/>
    <xsl:variable name="space" select="'&#32;'"/>

<xsl:template match="/">
  <xsl:for-each select="models/mib/@name">
      <xsl:value-of select="." />
      <xsl:value-of select="$space" />
    </xsl:for-each>        
</xsl:template>
</xsl:stylesheet>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="xml" indent="yes" encoding="UTF-8" doctype-system="mp.dtd"/>
  <xsl:strip-space elements="*"/>
  <xsl:template match="@* | node()">
    <xsl:copy>
      <xsl:apply-templates select="@* | node()"/>
    </xsl:copy>
  </xsl:template>
  <!-- In UML packaged elements, like class, are not in an ordered group. This means they can be serialized in any order. Here we predefine an order. -->
  <xsl:template match="mim">
    <xsl:copy>
      <!--sort by the attribute names-->
      <xsl:apply-templates select="@*">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <!--we don't specifically sort the elements not listed in the expression below -->
      <xsl:apply-templates select="node()[not(local-name()='struct' or local-name()='enum' or local-name()='exception' or local-name()='derivedDataType' or local-name()='class' or local-name()='relationship')]">
      </xsl:apply-templates>
      <!--we specifically sort the elements listed in the templates below by their name attribute -->
      <xsl:apply-templates select="struct">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <xsl:apply-templates select="enum">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <xsl:apply-templates select="exception">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <xsl:apply-templates select="derivedDataType">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <xsl:apply-templates select="class">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <xsl:apply-templates select="relationship">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>

    </xsl:copy>
  </xsl:template>

  <!-- In UML attributes are in an ordered group. However, if a struct inherits from other classes the order becomes non-deterministic. Here we predefine an order. -->
  <xsl:template match="struct">
    <xsl:copy>
      <!--sort by the attribute names-->
      <xsl:apply-templates select="@*">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <!--we don't specifically sort the elements not listed in the expression below -->
      <xsl:apply-templates select="node()[not(local-name()='structMember')]">
      </xsl:apply-templates>
      <!--we specifically sort the elements listed in the templates below by their name attribute -->
      <xsl:apply-templates select="structMember">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
    </xsl:copy>
  </xsl:template>

  <!-- In UML attributes are in an ordered group. However, if a class inherits from other classes the order becomes non-deterministic. Here we predefine an order. -->
  <xsl:template match="class">
    <xsl:copy>
      <!--sort by the attribute names-->
      <xsl:apply-templates select="@*">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <!--we don't specifically sort the elements not listed in the expression below -->
      <xsl:apply-templates select="node()[not(local-name()='attribute')]">
      </xsl:apply-templates>
      <!--we specifically sort the elements listed in the templates below by their name attribute -->
      <xsl:apply-templates select="attribute">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
    </xsl:copy>
  </xsl:template>

  <!-- In UML enumerations are in an ordered group. However, if an enumeration inherits from other enumeration the order becomes non-deterministic. Here we predefine an order. -->
  <xsl:template match="enum">
    <xsl:copy>
      <!--sort by the attribute names-->
      <xsl:apply-templates select="@*">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <!--we don't specifically sort the elements not listed in the expression below -->
      <xsl:apply-templates select="node()[not(local-name()='enumMember')]">
      </xsl:apply-templates>
      <!--we specifically sort the elements listed in the templates below by their name attribute -->
      <xsl:apply-templates select="enumMember">
        <xsl:sort select="value" data-type="number"/>
      </xsl:apply-templates>
    </xsl:copy>
  </xsl:template>

 <xsl:variable name="lower">
   abcdefghijklmnopqrstuvwxyz
 </xsl:variable>
 <xsl:variable name="UPPER">
   ABCDEFGHIJKLMNOPQRSTUVWXYZ
 </xsl:variable>

 <!-- In UML packaged elements, like InstanceSpecification, are not in an ordered group. This means they can be serialized in any order. Here we predefine an order. -->
  <xsl:template match="mib">
    <xsl:copy>
      <!--sort by the attribute names-->
      <xsl:apply-templates select="@*">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <!--we don't specifically sort the elements not listed in the expression below -->
      <xsl:apply-templates select="node()[not(local-name()='object')]">
      </xsl:apply-templates>
      <!--we specifically sort the elements listed in the templates below by their parentDn and slot value attribute -->
      <xsl:apply-templates select="object">
        <xsl:sort select="@parentDn"/>
        <!-- Keep this select expression. IBM JRE XSL Library take 'object' as current node in below xpath predicates expression, will be ignored automatically in standard java env -->
		<xsl:sort select="slot[@name=concat(concat(translate(substring(hasClass/@name, 1, 1), $UPPER, $lower),substring(hasClass/@name, 2)),'Id')]/value" />
        <!-- Keep this select expression. Oracle JRE XSL Library take slot as current node in below xpath predicates expression, will be ignored automatically in IBM RSA java env -->
        <xsl:sort select="slot[@name=concat(concat(translate(substring(../hasClass/@name, 1, 1), $UPPER, $lower), substring(../hasClass/@name, 2)),'Id')]/value" />
        <xsl:sort select="hasClass/@name"/>
        <xsl:sort select="count(slot)" data-type="number"/>
      </xsl:apply-templates>
    </xsl:copy>
  </xsl:template>

	
  <!-- In UML elements, like Slot, are not in an ordered group. This means they can be serialized in any order. Here we predefine an order. -->
  <xsl:template match="object|complexValue">
    <xsl:copy>
      <!--sort by the attribute names-->
      <xsl:apply-templates select="@*">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
      <!--we don't specifically sort the elements not listed in the expression below -->
      <xsl:apply-templates select="node()[not(local-name()='slot')]">
      </xsl:apply-templates>
      <!--we specifically sort the elements listed in the templates below by their name attribute -->
      <xsl:apply-templates select="slot">
        <xsl:sort select="@name"/>
      </xsl:apply-templates>
    </xsl:copy>
  </xsl:template>

</xsl:stylesheet>

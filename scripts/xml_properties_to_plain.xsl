<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<!-- xsltproc -novalid xml_properties_to_plain.xsl file.xml -->

<xsl:output method="xml" omit-xml-declaration="yes" />

<xsl:template match="/properties">
	<xsl:for-each select='entry/.'>
		<xsl:value-of select="@key" />=<xsl:value-of select="." />
		<xsl:text>&#xa;</xsl:text>
	</xsl:for-each>
</xsl:template>

</xsl:stylesheet>

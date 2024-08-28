#!/bin/sh

PAPYRUS_UPDATE_SITE="http://download.eclipse.org/modeling/mdt/papyrus/updates/releases/mars/1.1.2/"
PAPYRUS_EXTRA_SITE="http://download.eclipse.org/modeling/mdt/papyrus/updates/releases/luna/extra/"
ECLIPSE_UPDATE_SITE="http://download.eclipse.org/releases/mars/"
COMMON_DEPENDENCY_UPDATE_SITE="http://download.eclipse.org/recommenders/updates/stable/"
OCL_UPDATE_SITE="http://download.eclipse.org/modeling/mdt/ocl/updates/maintenance/6.0.2/M201511032349/"

wget http://eclipse.mirror.garr.it/mirrors/eclipse/technology/epp/downloads/release/mars/1/eclipse-java-mars-1-linux-gtk-x86_64.tar.gz

tar xzf eclipse-java-mars-1-linux-gtk-x86_64.tar.gz
rm -f eclipse-*.tar.gz

set -x
java -jar eclipse/plugins/org.eclipse.equinox.launcher_1.3.100.v20150511-1540.jar -application org.eclipse.equinox.p2.director -noSplash -repository ${PAPYRUS_UPDATE_SITE},${PAPYRUS_EXTRA_SITE},${ECLIPSE_UPDATE_SITE},${COMMON_DEPENDENCY_UPDATE_SITE},http://download.eclipse.org/tools/cdt/releases/8.6 -installIU org.eclipse.papyrus.sdk.feature.feature.group,org.eclipse.papyrus.migration.rsa.feature.feature.group,org.eclipse.cdt.feature.group

java -jar eclipse/plugins/org.eclipse.equinox.launcher_1.3.100.v20150511-1540.jar -application org.eclipse.equinox.p2.director -noSplash -repository ${ECIM_TOOLCHAIN_REPOSITORY},${PAPYRUS_UPDATE_SITE},${OCL_UPDATE_SITE},${ECLIPSE_UPDATE_SITE},${COMMON_DEPENDENCY_UPDATE_SITE} -installIU com.ericsson.ecim.feature.feature.group,com.ericsson.ecim.coremw.feature.feature.group,com.ericsson.ecim.mmas.feature.feature.group,com.ericsson.ecim.cpp.feature.feature.group,com.ericsson.ecim.vdicos.feature.feature.group,com.ericsson.ecim.yang.feature.feature.group,com.ericsson.ecim.mgc.feature.feature.group,com.ericsson.ecim.stn.feature.feature.group

java -jar eclipse/plugins/org.eclipse.equinox.launcher_1.3.100.v20150511-1540.jar -application org.eclipse.equinox.p2.director -noSplash -clean -purgeHistory
set +x

# Update eclipse.ini
sed -i 's/Xms40m/Xms128m/g' eclipse/eclipse.ini
sed -i 's/Xmx1024m/Xmx2G/g' eclipse/eclipse.ini

tar cf ecim_toolchain_${ET_VERSION}_mars_linux-gtk-x86_64.tar eclipse/
rm -rf eclipse/
gzip ecim_toolchain_${ET_VERSION}_mars_linux-gtk-x86_64.tar

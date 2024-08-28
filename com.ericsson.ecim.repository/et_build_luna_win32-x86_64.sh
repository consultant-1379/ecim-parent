#!/bin/sh

PAPYRUS_UPDATE_SITE="http://download.eclipse.org/modeling/mdt/papyrus/updates/releases/luna/1.0.2c/"
LUNA_UPDATE_SITE="http://download.eclipse.org/releases/luna/"
COMMON_DEPENDENCY_UPDATE_SITE="http://download.eclipse.org/recommenders/updates/stable/"
OCL_UPDATE_SITE="http://download.eclipse.org/modeling/mdt/ocl/updates/milestones/5.0.5/S201510060617/"

wget http://ftp.acc.umu.se/mirror/eclipse.org/technology/epp/downloads/release/luna/SR2/eclipse-standard-luna-SR2-win32-x86_64.zip
unzip eclipse-standard-luna-SR2-win32-x86_64.zip
rm -f eclipse-*.zip

set -x
java -jar eclipse/plugins/org.eclipse.equinox.launcher_1.3.0.v20140415-2008.jar -application org.eclipse.equinox.p2.director -noSplash -repository ${PAPYRUS_UPDATE_SITE},${LUNA_UPDATE_SITE},${COMMON_DEPENDENCY_UPDATE_SITE},http://download.eclipse.org/tools/cdt/releases/8.6 -installIU org.eclipse.papyrus.sdk.feature.feature.group,org.eclipse.papyrus.migration.rsa.feature.feature.group,org.eclipse.cdt.feature.group

java -jar eclipse/plugins/org.eclipse.equinox.launcher_1.3.0.v20140415-2008.jar -application org.eclipse.equinox.p2.director -noSplash -repository ${ECIM_TOOLCHAIN_REPOSITORY},${PAPYRUS_UPDATE_SITE},${OCL_UPDATE_SITE},${LUNA_UPDATE_SITE},${COMMON_DEPENDENCY_UPDATE_SITE} -installIU com.ericsson.ecim.feature.feature.group,com.ericsson.ecim.coremw.feature.feature.group,com.ericsson.ecim.mmas.feature.feature.group,com.ericsson.ecim.cpp.feature.feature.group,com.ericsson.ecim.vdicos.feature.feature.group,com.ericsson.ecim.yang.feature.feature.group,com.ericsson.ecim.mgc.feature.feature.group,com.ericsson.ecim.stn.feature.feature.group

java -jar eclipse/plugins/org.eclipse.equinox.launcher_1.3.0.v20140415-2008.jar -application org.eclipse.equinox.p2.director -noSplash -clean -purgeHistory
set +x

# Update eclipse.ini
sed -i 's/Xms40m/Xms128m/g' eclipse/eclipse.ini
sed -i 's/Xmx512m/Xmx2G/g' eclipse/eclipse.ini

zip -q -r ecim_toolchain_${ET_VERSION}_luna_win32-x86_64.zip eclipse/
rm -rf eclipse/

#!/bin/sh

###########################
##  Versions
###########################

PRA="3.1.1"
VER="$PRA"_PRELIMINARY
if [ "$ET_VERSION" = "$PRA" ]; then
	VER="$PRA"
fi	
echo "Upload ET $VER to EECS"

########FIX THE KEY FOR LOG ONTO UPDATE SITE #######
rm -rf /home/$USER/.ssh/us/
mkdir "/home/$USER/.ssh/us/"
cp "/home/$USER/.ssh/updatesite/id_rsa" "/home/$USER/.ssh/us/id_rsa"
chmod 700 "/home/$USER/.ssh/us/id_rsa"
#############################################

DATE=$(date +"%Y%m%d");

ET_RELEASE="et_${VER}"
ET_BUILD="${ET_RELEASE}_${DATE}"

SNAPSHOTS_FOLDER="/proj/eecsuser/root/customer/dx/snapshots/et_papyrus/"
BUILD_PATH="${SNAPSHOTS_FOLDER}/$ET_BUILD"

RELEASE_DIR="/proj/eecsuser/root/customer/dx/releases/et_papyrus/"
PRA_PATH="${RELEASE_DIR}/${ET_BUILD}"

LOCAL_WORKSPACE_PATH="/home/$USER/ei_jenkins/workspace/ET_Papyrus/"

ECIM_REPO_ZIP="com.ericsson.ecim.repository.zip"
LOCAL_ECIM_REPO_PATH="${LOCAL_WORKSPACE_PATH}/com.ericsson.ecim.repository/target/${ECIM_REPO_ZIP}"

MP_XML_MERGE_BINARY="dxet-mpxmlmerge-bin.zip"
LOCAL_MP_XML_MERGE_BINARY_PATH="${LOCAL_WORKSPACE_PATH}/com.ericsson.ecim.tools/target/${MP_XML_MERGE_BINARY}"

YANG2XSD_BINARY="dxet-yang2xsd-bin.zip"
LOCAL_YANG2XSD_BINARY_PATH="${LOCAL_WORKSPACE_PATH}/com.ericsson.ecim.yang.xsd/${YANG2XSD_BINARY}"


#====================================================================================================#
echo "[+] Upload ET to EECS server"
sftp -o "IdentityFile=/home/$USER/.ssh/us/id_rsa" eecscustom@copyserver.rnd.ki.sw.ericsson.se <<WWW

#get into the snapshots folder
cd $SNAPSHOTS_FOLDER

#copy the new release files to the dir
put $LOCAL_ECIM_REPO_PATH
put $LOCAL_MP_XML_MERGE_BINARY_PATH
put $LOCAL_YANG2XSD_BINARY_PATH
bye
WWW

echo "[+] Unpack and set up links"
ssh -i /home/$USER/.ssh/us/id_rsa eecscustom@copyserver.rnd.ki.sw.ericsson.se <<QQQ

rm -rf $BUILD_PATH
mkdir -p $BUILD_PATH/bin
cd $BUILD_PATH

mv $SNAPSHOTS_FOLDER/${ECIM_REPO_ZIP} .

unzip -n "${ECIM_REPO_ZIP}"
rm -f ${ECIM_REPO_ZIP}

mv $SNAPSHOTS_FOLDER/${MP_XML_MERGE_BINARY} ./bin
rm -f $SNAPSHOTS_FOLDER/${MP_XML_MERGE_BINARY}

mv $SNAPSHOTS_FOLDER/${YANG2XSD_BINARY} ./bin
rm -f $SNAPSHOTS_FOLDER/${YANG2XSD_BINARY}

#Create symbolic link
rm -f "/proj/eecsuser/root/customer/dx/et_papyrus_latest"
ln -s "${BUILD_PATH}" "/proj/eecsuser/root/customer/dx/et_papyrus_latest"

if ($VER == $PRA) then
    rm -rf $PRA_PATH
	rm -f "/proj/eecsuser/root/customer/dx/et_papyrus"
	rm -f "/proj/eecsuser/root/customer/dx/et_papyrus_latest"
	rm -f "/proj/eecsuser/root/customer/dx/et_allreleases/${ET_RELEASE}"
	cp -r "$BUILD_PATH" "${RELEASE_DIR}"
	echo "[-] Clean up the Snapshots folder...."
	rm -rf ${SNAPSHOTS_FOLDER}	
	mkdir -p ${SNAPSHOTS_FOLDER}
	echo "[-] Link all the targets...."
	ln -s "$PRA_PATH" "/proj/eecsuser/root/customer/dx/et_papyrus"
	ln -s "$PRA_PATH" "/proj/eecsuser/root/customer/dx/et_papyrus_latest"
	ln -s "$PRA_PATH" "/proj/eecsuser/root/customer/dx/et_allreleases/${ET_RELEASE}"
endif
QQQ
echo "[+] Connection Closed"

if [ "$VER" = "$PRA" ]; then
	echo "[+] Create PRA release SRC and RUNTIME files" 
	ET_RUNTIME_ZIP=et_${VER}_runtime.zip
	ET_RUNTIME_GZ_TAR=DXET_RUNTIME_CXP9017709_2.tar.gz

	ET_SRC_ZIP=et_${VER}_src.zip
	ET_SRC_GZ_TAR=DXET_SRC_CAA9012643_2.tar.gz

	cd $LOCAL_WORKSPACE_PATH

	rm -f $ET_RUNTIME_ZIP
	rm -f $ET_RUNTIME_GZ_TAR
	rm -f $ET_SRC_ZIP
	rm -f $ET_SRC_GZ_TAR

	zip -r $ET_SRC_ZIP com.ericsson.* -x \*/target/**\*
	tar -zcf $ET_SRC_GZ_TAR $ET_SRC_ZIP

	zip -j $ET_RUNTIME_ZIP $LOCAL_YANG2XSD_BINARY_PATH $LOCAL_MP_XML_MERGE_BINARY_PATH $LOCAL_ECIM_REPO_PATH
	tar -zcf $ET_RUNTIME_GZ_TAR $ET_RUNTIME_ZIP

	echo "[+] Upload PRA release files to EECS server"
	sftp -o "IdentityFile=/home/$USER/.ssh/us/id_rsa" eecscustom@copyserver.rnd.ki.sw.ericsson.se <<RRR
	#get into the releases folder
	cd $PRA_PATH
	#copy the new release files to the dir
	put $ET_RUNTIME_GZ_TAR
	put $ET_SRC_GZ_TAR
	bye
RRR
fi
exit

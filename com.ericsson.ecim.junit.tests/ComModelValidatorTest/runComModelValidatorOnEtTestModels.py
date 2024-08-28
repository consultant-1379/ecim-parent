#!/usr/bin/python

from subprocess import call

testModels = {'BiDirAssociationModel': 'MiscComplex/BiDirAssociationModel_output/BiDirAssociationModel_mp.xml',
'FullCoreMWModel': 'MiscComplex/FullCoreMWModel_output/FullCoreMWModel_mp.xml',
			  'ECIMMMRevB_Inheritance': 'MiscComplex/ECIMMMRevB_Inheritance_output/CIWOM_UML_mp.xml',
              'Mom2HtmlTest': ['MiscComplex/Mom2HtmlTest_output/RootMom_mp.xml','MiscComplex/Mom2HtmlTest_output/SubMom_mp.xml'],
	          'COM2': ['COMng/ComTop_output/ComTop_mp.xml','COMng/ComFm_output/ComFm_mp.xml'],
	          'TSP/VDicos': ['vDicos/VDicosModel_output/VDicosModel_mp.xml'],
	          'MMAS': 'MMAS/MMAS_Model_output/MMAS_Model_mp.xml',
	          'EcimLibrary': ['EcimLibrary/MyLibraryUser_output/MyLibraryUser_mp.xml'],
	          'EcimSwm': ['EcimSwm/ECIM_Top_1.0_output/ECIM_Top_mp.xml','EcimSwm/ECIM_FileM_1.0_output/ECIM_FileM_mp.xml','EcimSwm/ECIM_SwM_1.0_output/ECIM_SwM_mp.xml','EcimSwm/ECIM_SwIM_1.0_output/SwIM_mp.xml'],
	          'MixingGuidelines': ['MixingGuidelines/ECIM_Top_1.1_output/ECIM_Top_mp.xml','MixingGuidelines/ECIM_FM_2.0_output/ECIM_FM_2.0_mp.xml','MixingGuidelines/CmwApplX_output/CmwApplX_mp.xml'],
			  'Yang': ['Yang/EricssonDmx_output/EricssonDmx_mp.xml'],
			  'MGC': ['MGC/MGCWorkingTestModel_output/MGCWorkingTestModel_mp.xml','MGC/MGCModel3_output/MGCModel3_mp.xml'],
			  'EPG': ['EPG/Epg_output/Epg_mp.xml']
	          }

def flatten(x):
    result = []
    for el in x:
        if hasattr(el, "__iter__") and not isinstance(el, basestring):
            result.extend(flatten(el))
        else:
            result.append(el)
    return result


for model in testModels.iterkeys():
    print "\nChecking: " + model
    command = flatten(["maf_model_validator", testModels[model]])
    retcode = call(command)
    if retcode == 0:
       print model,"is OK!"
    else:
       print model,"is NOT ACCEPTED!!!!!"






usage: java -cp <path/to/mpxmlmergetool/>dxet-mpxmlmerge.jar com.ericsson.ecim.tools.MpXmlMerge
    --approvedby <approvedby>   signature in approved by tag in mp.dtd
    --createdby <createdby>     signature in created by tag in mp.dtd
 -d,--directory <arg>           directory with MP XML files to be merged
                                (not allowed with -f)
    --docdate <docdate>         docDate tag in mp.dtd
    --doclang <doclang>         docLang tag in mp.dtd
    --docnum <docnum>           docNum tag in mp.dtd
    --docrev <docrev>           docRev tag in mp.dtd
 -f,--files <arg>               list of MP XML files to be merged
 -h,--help                      print this message
 -o,--outputfile <outputfile>   use given file for output
 -s,--subtitle <subtitle>       momSubtitle tag in mp.dtd
 -t,--title <title>             momTitle tag in mp.dtd
 -v,--version                   print the version information and exit
 
 Note: A copy of the mp.dtd file must be present in the directory where input MP XML files are located.
package com.ericsson.ecim.headlesslauncher;

import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.*;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import com.ericsson.ecim.core.exceptions.EcimException;

public class HeadlessCommandLine {

    private String[] arguments;

    HeadlessCommandLine(String... args) {
        this.arguments = args;
    }

    @SuppressWarnings("static-access")
    CommandLine parseCommands() throws ParseException, EcimException {
        Options opts = new Options();
        Option modelpath = OptionBuilder.withDescription("Workspace-relative path to the Model file that should be transformed").hasArgs().create(MODEL_PATH);
        opts.addOption(modelpath);

        Option outputPath = OptionBuilder
                .withDescription(
                        "Output Folder for the Transformation result, defaults to the "
                                + "\"Output_Models\" folder in the same folder as the Model file lies in").hasOptionalArg().create(OUTPUT_PATH);
        opts.addOption(outputPath);

        Option validationOutput = OptionBuilder.withDescription("This option will log into a file all error messages related with model validation").hasArgs()
                .create(MODEL_VALIDATION_ERRORS);
        opts.addOption(validationOutput);

        Option noMMA = OptionBuilder.withDescription("This option will turn off MMA Validation").create(NO_MMA);
        opts.addOption(noMMA);

        Option noDecisionOption = OptionBuilder.withDescription("This option will turn off optionality decisions").create(NO_DECISION);
        opts.addOption(noDecisionOption);

        Option continueOnFail = OptionBuilder.withDescription(
                "This option will make headless session continously working and ignore any failure actions on a certain model").create(CONTINUE_ON_FAILURE);
        opts.addOption(continueOnFail);

        @SuppressWarnings("deprecation")
        Option rsaValidation = OptionBuilder.withDescription("Deprecated options only for backward compatible").create(RSA_VALIDATION);
        opts.addOption(rsaValidation);

        Option rempPath = OptionBuilder
                .withDescription(
                        "This option will reverse engineer a MP xml file into an emx model.\n" + "It is mandatory to specify the file path to the MP xml file.")
                .hasArgs().create(REMP_PATH);
        opts.addOption(rempPath);

        Option reyangPath = OptionBuilder
                .withDescription(
                        "This option will reverse engineer a YANG file into an emx model.\n" + "It is mandatory to specify the file path to the YANG file.")
                .hasArgs().create(REYANG_PATH);
        opts.addOption(reyangPath);

        Option tranformations = OptionBuilder.withDescription("This option will turn on only the provided tranformations").hasArgs().create(TRANSFORMATIONS);
        opts.addOption(tranformations);

        Option decisions = OptionBuilder.withDescription("This option will only launch the given decisions in headless mode").hasArgs().create(DECISIONS);
        opts.addOption(decisions);

        Option umlutilities = OptionBuilder.withDescription("This option will launch the specified uml utilities").hasArgs().create(UMLUTILITIES);
        opts.addOption(umlutilities);

        Option preUtilities = OptionBuilder.withDescription("This option will launch the specified uml utilities before transformation").hasArgs()
                .create(PRE_UTILITIES);
        opts.addOption(preUtilities);

        Option postUtilities = OptionBuilder.withDescription("This option will launch the specified uml utilities after transformation").hasArgs()
                .create(POST_UTILITIES);
        opts.addOption(postUtilities);

        Option configureFile = OptionBuilder.withDescription("Headless configure file which defines all tasks to be launch in one session").hasArgs()
                .create(HEADLESS_CONFIGURATION);
        opts.addOption(configureFile);

        PosixParser parser = new PosixParser();
        CommandLine cli = parser.parse(opts, arguments);

        commadLineValidate(cli);

        return cli;
    }

    private void commadLineValidate(CommandLine cli) throws EcimException {
        // run additional validations to ensure that particular option
        // combinations do not happen
        // rule 1 - can only use one of the following options, MODEL_PATH or
        // REMP_PATH
        if (cli.hasOption(HEADLESS_CONFIGURATION)) {
            System.out.println("Headless mode will execute with the specified configure file."); // NOSONAR
            if (hasIgnoreOptionsInHeadless(cli)) {
                System.out.println("Options 'model path, remp path, reyang path, transformations, umlutilities' will be ignored if exists."); // NOSONAR
            }
        }

        avoidTwoOptionsTogether(cli, MODEL_PATH, REMP_PATH);

        avoidTwoOptionsTogether(cli, MODEL_PATH, REYANG_PATH);

        avoidTwoOptionsTogether(cli, REMP_PATH, REYANG_PATH);

        avoidTwoOptionsTogether(cli, TRANSFORMATIONS, UMLUTILITIES);

    }

    private boolean hasIgnoreOptionsInHeadless(CommandLine cli) {
        String[] ignoreOptions = { MODEL_PATH, REMP_PATH, REYANG_PATH, TRANSFORMATIONS, UMLUTILITIES };
        boolean has = false;
        for (String option : ignoreOptions) {
            has |= cli.hasOption(option);
        }
        return has;
    }

    private void avoidTwoOptionsTogether(CommandLine cli, String option1, String option2) throws EcimException {
        if (cli.hasOption(option1) && cli.hasOption(option2)) {
            throw new EcimException("Cannot use " + option1 + " and " + option2 + " options at the same time.");
        }
    }

}

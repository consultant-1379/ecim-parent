package com.ericsson.ecim.core.uml.commands;

import org.eclipse.papyrus.uml.diagram.common.commands.CreateUMLModelCommand;

public class EcimModelCreationCommand extends CreateUMLModelCommand {

    @Override
    protected String getModelName() {
        return "EcimModel";
    }

}

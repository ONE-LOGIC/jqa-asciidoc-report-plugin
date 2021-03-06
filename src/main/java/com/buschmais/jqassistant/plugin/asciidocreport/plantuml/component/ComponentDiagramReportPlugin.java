package com.buschmais.jqassistant.plugin.asciidocreport.plantuml.component;

import com.buschmais.jqassistant.core.report.api.graph.SubGraphFactory;
import com.buschmais.jqassistant.plugin.asciidocreport.plantuml.AbstractDiagramRenderer;
import com.buschmais.jqassistant.plugin.asciidocreport.plantuml.AbstractPlantUMLReportPlugin;
import com.buschmais.jqassistant.plugin.asciidocreport.plantuml.RenderMode;

public class ComponentDiagramReportPlugin extends AbstractPlantUMLReportPlugin {

    @Override
    protected AbstractDiagramRenderer getRenderer(RenderMode renderMode) {
        return new ComponentDiagramRenderer(new SubGraphFactory(), renderMode);
    }

    @Override
    protected String getReportLabel() {
        return "Component Diagram";
    }
}

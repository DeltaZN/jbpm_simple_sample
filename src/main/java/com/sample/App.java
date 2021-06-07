package com.sample;

import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        KieHelper kieHelper = new KieHelper();
        KieBase kieBase = kieHelper.addResource(ResourceFactory.newClassPathResource("sample.bpmn")).build();

        KieSession ksession = kieBase.newKieSession();
        ProcessInstance processInstance = ksession.startProcess("com.sample.bpmn.hello");
    }
}

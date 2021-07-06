package com.drools;

import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;

/**
 * @author zhufeng
 */
public class MainTest7 {

    public static void main(String[] args) {

//        String rule = "package com.drools;\r\n";
        String rule = "";
        rule += "import com.drools.Message;\r\n";
        rule += "rule \"rule1\"\r\n";
        rule += "when\r\n";
//        rule+= "eval(true)\r\n";
        rule += "\t com.drools.Message(status == 1)";
        rule += "\r\nthen\r\n";
        rule += "\tSystem.out.println(\"hello\");\r\n";
        rule += "end\r\n";

        System.out.println(rule);

        KieHelper helper = new KieHelper();
        helper.addContent(rule, ResourceType.DRL);
        KieSession kSession = helper.build().newKieSession();

        Message message1 = new Message();
        message1.setStatus(1);

        kSession.insert(message1);
        kSession.fireAllRules();
        kSession.dispose();

        System.out.println("OK");

    }

}

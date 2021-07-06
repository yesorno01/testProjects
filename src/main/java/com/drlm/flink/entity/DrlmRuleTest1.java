package com.drlm.flink.entity;

//import com.drlm.flink.entity.Order;
//import org.kie.api.KieServices;
//import org.kie.api.builder.*;
//import org.kie.api.builder.model.KieBaseModel;
//import org.kie.api.builder.model.KieModuleModel;
//import org.kie.api.builder.model.KieSessionModel;
//import org.kie.api.conf.EqualityBehaviorOption;
//import org.kie.api.conf.EventProcessingOption;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.api.runtime.conf.ClockTypeOption;
//import org.kie.api.runtime.rule.FactHandle;
//
//import java.io.IOException;
//import java.util.List;

/**
 * 新增
 *
 * @author guanyq
 * @date 2021/1/22
 */
public class DrlmRuleTest1 {

//    public static void main(String[] args) throws IOException {
//        KieServices kieServices = KieServices.Factory.get();
//        KieModuleModel kieModuleModel = kieServices.newKieModuleModel();
//        KieBaseModel kieBaseModel1 = kieModuleModel.newKieBaseModel( "KBase1 ")
//                .setDefault( true )
//                .setEqualsBehavior( EqualityBehaviorOption.EQUALITY )
//                .setEventProcessingMode( EventProcessingOption.STREAM );
//        kieBaseModel1.newKieSessionModel( "KSession1" )
//                .setDefault( true )
//                .setType( KieSessionModel.KieSessionType.STATEFUL )
//                .setClockType( ClockTypeOption.get("realtime") );
//        KieFileSystem kfs = kieServices.newKieFileSystem();
//        kfs.writeKModuleXML(kieModuleModel.toXML());
//        String stringContainingAValidDRL = "package order.discount rule rule_01 when $order:com.drlm.flink.entity.Order(originalPrice < 100 && originalPrice > 0) then $order.setRealPrice($order.getOriginalPrice()*0.8); end rule rule_02 when $order:com.drlm.flink.entity.Order(originalPrice >= 100) then $order.setRealPrice($order.getOriginalPrice()*0.7); end";
//        kfs.write( "src/main/resources/ruleSet1.drl", stringContainingAValidDRL );
//        kieServices.getResources();
//        System.out.println(kieModuleModel.toXML());
//        KieBuilder kieBuilder = kieServices.newKieBuilder(kfs);
//        kieBuilder.buildAll();
//        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
//        System.out.println("kieContainer");
//        KieSession kieSession = kieContainer.newKieSession();
//
//        Order order = new Order(55d,55d);
//        FactHandle insert = kieSession.insert(order);
//        int i = kieSession.fireAllRules();
//        System.out.println(i);
//        System.out.println(order.toString());
//
//
//    }
}

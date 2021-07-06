package com.drlm.flink.entity;

//import org.kie.api.KieServices;
//import org.kie.api.builder.KieBuilder;
//import org.kie.api.builder.KieFileSystem;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.api.runtime.rule.FactHandle;

/**
 * 新增
 *
 * @author guanyq
 * @date 2021/1/22
 */
public class DrlmRuleTest2 {

//    public static void main(String[] args) {
//
//
//        KieServices kieServices = KieServices.Factory.get();
//        KieFileSystem kfs = kieServices.newKieFileSystem();
//
//        String ruleStr = "package order.discount rule rule_01 when $order:com.drlm.flink.entity.Order(originalPrice < 100 && originalPrice > 0) then $order.setRealPrice($order.getOriginalPrice()*0.8); end rule rule_02 when $order:com.drlm.flink.entity.Order(originalPrice >= 100) then $order.setRealPrice($order.getOriginalPrice()*0.7); end";
//
//        kfs.write( "src/main/resources/ruleSet1.drl", ruleStr);
//        KieBuilder kieBuilder = kieServices.newKieBuilder(kfs);
//        kieBuilder.buildAll();
//        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
//        KieSession kieSession = kieContainer.newKieSession();
//
//
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

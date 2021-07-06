package com.drlm.flink.entity;
//
//import org.drools.core.impl.InternalKnowledgeBase;
////import org.drools.core.impl.KnowledgeBaseFactory;
//import org.kie.api.io.ResourceType;
//import org.kie.api.runtime.KieSession;
//import org.kie.internal.builder.KnowledgeBuilder;
//import org.kie.internal.builder.KnowledgeBuilderFactory;
//import org.kie.internal.io.ResourceFactory;
//
//import java.io.IOException;

public class DrlmRuleTest6 {

//    public static void main(String[] args) throws IOException {
//        String drl = "package order.discount rule rule_01 when $order:com.drlm.flink.entity.Order(originalPrice < 100 && originalPrice > 0) then $order.setRealPrice($order.getOriginalPrice()*0.8); end rule rule_02 when $order:com.drlm.flink.entity.Order(originalPrice >= 100) then $order.setRealPrice($order.getOriginalPrice()*0.7); end";
////        try{
//System.out.println("drl="+drl);
//System.out.println("drl2="+drl.getBytes("utf-8"));
//            KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
//System.out.println("kb"+kb);
//            kb.add(ResourceFactory.newByteArrayResource(drl.getBytes("utf-8")), ResourceType.DRL);
//System.out.println("kb"+kb);
//            if (kb.hasErrors()) {
//                String errorMessage = kb.getErrors().toString();
//                System.out.println("规则语法异常---\n"+errorMessage);
//                return;
//            }
////            InternalKnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase();
////            kBase.addPackages(kb.getKnowledgePackages());
////            KieSession kieSession = kBase.newKieSession();
//            Order order = new Order(55d,55d);
////            kieSession.insert(order);
////            int i = kieSession.fireAllRules();
////            System.out.println(i);
//            System.out.println(order.toString());
//
////        }catch(Exception e){
////            System.out.println(e.getMessage());
////        }
//
//    }
}

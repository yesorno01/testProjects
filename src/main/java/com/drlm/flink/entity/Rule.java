package com.drlm.flink.entity;

/**
 * 新增
 *
 * @author guanyq
 * @date 2021/1/23
 */
public class Rule {
    private String rule;
    private Long ts;

    public Rule() {
    }

    public Rule(String rule) {
        this.rule = rule;
    }

    public Rule(String rule, Long ts) {
        this.rule = rule;
        this.ts = ts;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "rule='" + rule + '\'' +
                ", ts=" + ts +
                '}';
    }
}

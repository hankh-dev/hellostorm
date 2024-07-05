package com.terry.storm.hellostorm;



import backtype.storm.topology.BasicOutputCollector;

import backtype.storm.topology.OutputFieldsDeclarer;

import backtype.storm.topology.base.BaseBasicBolt;

import backtype.storm.tuple.Tuple;



public class HelloBolt extends BaseBasicBolt{



    public void execute(Tuple tuple, BasicOutputCollector collector) {

        // TODO Auto-generated method stub

        String value = tuple.getStringByField("say");

        System.out.println("Tuple value is"+value);

    }



    public void declareOutputFields(OutputFieldsDeclarer declarer) {

        // TODO Auto-generated method stub



    }



}


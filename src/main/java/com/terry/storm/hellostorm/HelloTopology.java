package com.terry.storm.hellostorm;



import backtype.storm.Config;

import backtype.storm.StormSubmitter;

import backtype.storm.generated.AlreadyAliveException;

import backtype.storm.generated.InvalidTopologyException;

import backtype.storm.topology.TopologyBuilder;



public class HelloTopology {

    public static void main(String args[]){

        TopologyBuilder builder = new TopologyBuilder();

        builder.setSpout("HelloSpout", new HelloSpout(),2);

        builder.setBolt("HelloBolt", new HelloBolt(),4).shuffleGrouping("HelloSpout");



        Config conf = new Config();

        // Submit topology to cluster

        try{

            StormSubmitter.submitTopology(args[0], conf, builder.createTopology());

        }catch(AlreadyAliveException ae){

            System.out.println(ae);

        }catch(InvalidTopologyException ie){

            System.out.println(ie);

        }



    }



}
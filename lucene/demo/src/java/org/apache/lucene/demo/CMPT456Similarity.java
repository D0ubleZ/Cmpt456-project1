package org.apache.lucene.demo;

import org.apache.lucene.search.similarities.ClassicSimilarity;

import java.lang.Math;

public class CMPT456Similarity extends ClassicSimilarity{
	
	// @Override
	// public float tf(float freq) {
	//     return (float)Math.sqrt(freq);
 //    } from ClassicSimilarity.java
	@Override
	public float tf(float freq){
		return (float) (Math.sqrt(1+freq));
	}

	// @Override
 //  public float idf(long docFreq, long docCount) {
 //    return (float)(Math.log((docCount+1)/(double)(docFreq+1)) + 1.0);
 //  } from ClassicSimilarity.java

	@Override
	public float idf(long docFreq,long docCount){
		return (float) (1.0 + Math.log((docCount+2) / (docFreq+2)));
	}

}
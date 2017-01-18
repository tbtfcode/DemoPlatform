/*
 * Copyright © 2017 TIBCO Software Inc. All rights reserved.
 */
package test.tbtf.demo.batch.helloworld;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

/**
 * @project DemoBatch
 * @package test.tbtf.demo.batch.helloworld
 * @file HelloWorldPartitioner.java
 * @date Jan 18, 2017
 * @author minlee@tibco.com
 * @description
 */
public class HelloWorldPartitioner implements Partitioner {

	private Long requestThreadGroup;
	private Long requestTotalValue;

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.partition.support.Partitioner#partition(int)
	 */
	@Override
	public java.util.Map<String, ExecutionContext> partition(int gridSize) {

		if (requestThreadGroup != null) {
			gridSize = requestThreadGroup.intValue();
		}

		java.util.Map<String, ExecutionContext> partMap = new java.util.HashMap<String, ExecutionContext>();

		int stx_idx = 1;
		int etx_idx = gridSize;

		for (int i = 1; i <= gridSize; i++) {
			ExecutionContext executionContext = new ExecutionContext();

			executionContext.putString("request_group_name", "group_" + i);
			executionContext.putInt("request_stx_idx", stx_idx);
			executionContext.putInt("request_etx_idx", etx_idx);
			
			// System.out.println(String.format("%d ~ %d", stx_idx, etx_idx));

			partMap.put(String.format("partition%d", i), executionContext);

			stx_idx = etx_idx + 1;
			etx_idx += gridSize;
		}

		return partMap;
	}

	/**
	 * @return the requestThreadGroup
	 */
	public Long getRequestThreadGroup() {
		return requestThreadGroup;
	}

	/**
	 * @param requestThreadGroup the requestThreadGroup to set
	 */
	public void setRequestThreadGroup(Long requestThreadGroup) {
		this.requestThreadGroup = requestThreadGroup;
	}

	/**
	 * @return the requestTotalValue
	 */
	public Long getRequestTotalValue() {
		return requestTotalValue;
	}

	/**
	 * @param requestTotalValue the requestTotalValue to set
	 */
	public void setRequestTotalValue(Long requestTotalValue) {
		this.requestTotalValue = requestTotalValue;
	}

}

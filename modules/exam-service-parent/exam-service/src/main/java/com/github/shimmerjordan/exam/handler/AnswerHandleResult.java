package com.github.shimmerjordan.exam.handler;

import lombok.Data;

/**
 * 计算结果
 * @author shimmerjordan
 * @date 2021/12/8 9:56 下午
 */
@Data
public class AnswerHandleResult {

	/**
	 * 总分
	 */
	private double score;

	/**
	 * 正确题目数
	 */
	private int correctNum;

	/**
	 * 错误题目数
	 */
	private int inCorrectNum;
}

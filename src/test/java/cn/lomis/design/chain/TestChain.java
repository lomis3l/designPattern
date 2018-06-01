package cn.lomis.design.chain;

import org.junit.Test;

import cn.lomis.pattern.chain.AbstractLogger;
import cn.lomis.pattern.chain.impl.ConsoleLogger;
import cn.lomis.pattern.chain.impl.ErrorLogger;
import cn.lomis.pattern.chain.impl.FileLogger;

public class TestChain {

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger 	 = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger 	 = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	@Test
	public void test01() {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "info 日志");
		loggerChain.logMessage(AbstractLogger.DEBUG, "debug 日志");
		loggerChain.logMessage(AbstractLogger.ERROR, "error 日志");
	}

}

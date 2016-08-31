package org.opensource.myzone.modules.commons.exception;

/**
 * 基本的异常
 * @author king
 *
 */
public abstract class BaseException extends Exception{

	private static final long serialVersionUID = 8438352687003227460L;

	public BaseException(){
		super();
	}

	public BaseException(String message) {
		super(message);
	}
	
}

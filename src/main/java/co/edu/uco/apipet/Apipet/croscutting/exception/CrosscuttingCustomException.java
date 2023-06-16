package co.edu.uco.apipet.Apipet.croscutting.exception;

import static co.edu.uco.apipet.Apipet.croscutting.helper.StringHelper.EMPTY;

public class CrosscuttingCustomException extends ApipetCustomException{

    private static final long serialVersionUID = 1L;

    protected CrosscuttingCustomException(Exception rootException, String technicalMessage, String userMessage){
        super(rootException,technicalMessage,userMessage,LayerException.CROSSCUTTING);
    }

    public static final ApipetCustomException createTechnicalException(final String technicalMessage, final Exception rootException){
        return new CrosscuttingCustomException(rootException,technicalMessage,EMPTY);
    }

    public static final ApipetCustomException createUserException(final String userMessage, final Exception rootException){
        return new CrosscuttingCustomException(rootException,userMessage,userMessage);
    }

    public static final ApipetCustomException create(final String userMessage, final String technicalMessage, final Exception rootException){
        return new CrosscuttingCustomException(rootException,technicalMessage,userMessage);
    }

    public static CrosscuttingCustomException create(String userMessage, String technicalMessage){
        return new CrosscuttingCustomException(new Exception(), userMessage, technicalMessage);
    }
}

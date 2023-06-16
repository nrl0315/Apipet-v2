package co.edu.uco.apipet.Apipet.croscutting.exception;

import java.io.Serial;

import static co.edu.uco.apipet.Apipet.croscutting.helper.StringHelper.EMPTY;

public class ServiceCustomException extends ApipetCustomException{

    @Serial
    private static final long serialVersionUID = -7581138972968503560L;

    private ServiceCustomException(Exception rootException, String technicalMessage, String userMessage){
        super(rootException, technicalMessage, userMessage, LayerException.SERVICE);
    }

    public static final ApipetCustomException create(final String userMessage, final String technicalMessage) {
        return new ServiceCustomException(new Exception(), technicalMessage, userMessage);
    }

    public static final ApipetCustomException create(final Exception rootException, final String userMessage, final String technicalMessage){
        return new ServiceCustomException(rootException, technicalMessage, userMessage);
    }

    public static final ApipetCustomException createTechnicalException(final String technicalMessage){
        return new ServiceCustomException(new Exception(), technicalMessage, EMPTY);
    }

    public static final ApipetCustomException createTechnicalException(final Exception rootException, final String technicalMessage){
        return new ServiceCustomException(rootException, technicalMessage, EMPTY);
    }

    public static final ApipetCustomException createBusinessException(final String businessMessage, final Exception rootException){
        return new ServiceCustomException(rootException, businessMessage, EMPTY);
    }

    public static final ApipetCustomException createUserException(final String userMessage){
        return new ServiceCustomException(null,userMessage,userMessage);
    }

    public static final ApipetCustomException wrapException(final String message, final ApipetCustomException exception){
        if(exception.isTechnicalException()){
            return ServiceCustomException.createBusinessException(message, exception);
        }
        return exception;
    }

}

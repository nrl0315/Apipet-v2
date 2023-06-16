package co.edu.uco.apipet.Apipet.croscutting.exception;

import static co.edu.uco.apipet.Apipet.croscutting.helper.ObjectHelper.getDefaultIfNull;
import static co.edu.uco.apipet.Apipet.croscutting.helper.StringHelper.isEmpty;

public class ApipetCustomException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String userMessage;
    private LayerException layer;

    protected ApipetCustomException(final Throwable rootException, final String technicalMessage, final String userMessage, final LayerException layer){
        super(technicalMessage, getDefaultIfNull(rootException,new Exception()));
        setUserMessage(userMessage);
        setLayer(layer);
    }

    public String getUserMessage() {
        return userMessage;
    }

    private void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public LayerException getLayer() {
        return layer;
    }

    private void setLayer(LayerException layer) {
        this.layer = getDefaultIfNull(layer, LayerException.APPLICATION);
    }

    public final boolean isTechnicalException(){
        return isEmpty(getUserMessage());
    }
}

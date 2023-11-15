package unam.diplomado.pixup.notificacionservice.api;

import unam.diplomado.pixup.notificacionservice.dto.ErrorResponse;
import unam.diplomado.pixup.notificacionservice.dto.NotificacionRequest;
import unam.diplomado.pixup.notificacionservice.dto.NotificacionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link NotificacionApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-15T00:07:00.598125237Z[Etc/UTC]")
public interface NotificacionApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/notificaciones/usuario : Enviar Notificacion
     *
     * @param notificacionRequest  (required)
     * @return Notificacion Enviada Exitosamente (status code 201)
     *         or No se encontro el tipo de notificacion para el evento registrar usuario (status code 500)
     * @see NotificacionApi#enviarNotificacionAltaUsuario
     */
    default ResponseEntity<NotificacionResponse> enviarNotificacionAltaUsuario(NotificacionRequest notificacionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"idUsuario\" : \"idUsuario\", \"id\" : \"id\", \"fechaNotificacion\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/notificaciones/id : Obtiene una notificacion por id
     *
     * @return Obtiene una Notificacion por identificador (status code 200)
     *         or Ha ocurrido un errror al recuperar la notificacion (status code 500)
     * @see NotificacionApi#getNotificacionById
     */
    default ResponseEntity<NotificacionResponse> getNotificacionById() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"idUsuario\" : \"idUsuario\", \"id\" : \"id\", \"fechaNotificacion\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/notificaciones : Listar Notificaciones
     *
     * @return Listado de Notificaciones (status code 200)
     *         or Ha ocurrido un errror al recuperar las notificaciones (status code 500)
     * @see NotificacionApi#getNotificaciones
     */
    default ResponseEntity<List<NotificacionResponse>> getNotificaciones() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"idUsuario\" : \"idUsuario\", \"id\" : \"id\", \"fechaNotificacion\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\" }, { \"idUsuario\" : \"idUsuario\", \"id\" : \"id\", \"fechaNotificacion\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

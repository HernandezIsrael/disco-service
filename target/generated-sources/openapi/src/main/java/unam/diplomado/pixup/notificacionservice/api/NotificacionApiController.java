package unam.diplomado.pixup.notificacionservice.api;

import unam.diplomado.pixup.notificacionservice.dto.ErrorResponse;
import unam.diplomado.pixup.notificacionservice.dto.NotificacionRequest;
import unam.diplomado.pixup.notificacionservice.dto.NotificacionResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-15T00:07:00.598125237Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.pixupNotificacionMicroserviceEndpoints.base-path:}")
public class NotificacionApiController implements NotificacionApi {

    private final NotificacionApiDelegate delegate;

    public NotificacionApiController(@Autowired(required = false) NotificacionApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new NotificacionApiDelegate() {});
    }

    @Override
    public NotificacionApiDelegate getDelegate() {
        return delegate;
    }

}

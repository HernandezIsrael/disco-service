package unam.diplomado.pixup.notificacionservice.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificacionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-15T00:07:00.598125237Z[Etc/UTC]")
public class NotificacionResponse {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaNotificacion;

  private String idUsuario;

  private String email;

  public NotificacionResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NotificacionResponse fechaNotificacion(OffsetDateTime fechaNotificacion) {
    this.fechaNotificacion = fechaNotificacion;
    return this;
  }

  /**
   * Get fechaNotificacion
   * @return fechaNotificacion
  */
  @Valid 
  @Schema(name = "fechaNotificacion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fechaNotificacion")
  public OffsetDateTime getFechaNotificacion() {
    return fechaNotificacion;
  }

  public void setFechaNotificacion(OffsetDateTime fechaNotificacion) {
    this.fechaNotificacion = fechaNotificacion;
  }

  public NotificacionResponse idUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Get idUsuario
   * @return idUsuario
  */
  
  @Schema(name = "idUsuario", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idUsuario")
  public String getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
  }

  public NotificacionResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacionResponse notificacionResponse = (NotificacionResponse) o;
    return Objects.equals(this.id, notificacionResponse.id) &&
        Objects.equals(this.fechaNotificacion, notificacionResponse.fechaNotificacion) &&
        Objects.equals(this.idUsuario, notificacionResponse.idUsuario) &&
        Objects.equals(this.email, notificacionResponse.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fechaNotificacion, idUsuario, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fechaNotificacion: ").append(toIndentedString(fechaNotificacion)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


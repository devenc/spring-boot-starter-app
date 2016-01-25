package ar.entity;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a user of the system.
 * 
 * @author adam
 * 
 */
@Document
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class User extends Entity {

  /**
   * The User's first name.
   */
  private String firstName;

  /**
   * The User's last name.
   */
  private String lastName;

  /**
   * The User's alias.
   */
  @Indexed(unique = true)
  private String username;

}
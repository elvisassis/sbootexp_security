CREATE TABLE user_permission (
  id VARCHAR(255)  PRIMARY KEY,
  id_user VARCHAR(255) NOT NULL,
  id_permission VARCHAR(255) NOT NULL,
  UNIQUE (id_user, id_permission),
  FOREIGN KEY (id_user) REFERENCES users (id),
  FOREIGN KEY (id_permission) REFERENCES permission (id)
)ENGINE=InnoDB;
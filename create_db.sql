CREATE TABLE Item_Evemt_Types (
  id   INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45)
);

CREATE TABLE Item_Logs (
  id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  item_id INTEGER NOT NULL,
  event_date DATETIME,
  description VARCHAR(45),
  item_event_type_id INTEGER NOT NULL,
  FOREIGN KEY (item_event_type_id) REFERENCES Item_Evemt_Types(id),
#   add foreign key on item_id
);

CREATE TABLE Items (
  id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  isWorking BOOLEAN,
  manufacturer VARCHAR(45),
  model VARCHAR(45),
  start_price DECIMAL(10,2),
  current_price
);




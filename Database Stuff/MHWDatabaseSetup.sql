BEGIN TRANSACTION;

DROP TABLE IF EXISTS gunner_ammo;
DROP TABLE IF EXISTS blademaster;
DROP TABLE IF EXISTS sharpness;
DROP TABLE IF EXISTS ammo;
DROP TABLE IF EXISTS gunner;
DROP TABLE IF EXISTS weapon_type;
DROP TABLE IF EXISTS monster_bodypart;
DROP TABLE IF EXISTS bodypart;
DROP TABLE IF EXISTS monster_element;
DROP TABLE IF EXISTS monster;
DROP TABLE IF EXISTS elements;

CREATE TABLE blademaster (

        blademaster_id serial,
        name varchar(100) NOT NULL,
        rarity int NOT NULL,
        attack int NOT NULL,
        affinity int NOT NULL CHECK (affinity BETWEEN -100 AND 100),
        elderseal int,
        sharpness_id int NOT NULL,
        element_id int,
        weapon_type_id int NOT NULL,
        prev_weapon int,
        
        CONSTRAINT pk_blademaster PRIMARY KEY (blademaster_id)

);

CREATE TABLE gunner (
        
        gunner_id serial,
        name varchar(100) NOT NULL,
        rarity int NOT NULL,
        attack int NOT NULL,
        affinity int NOT NULL CHECK (affinity BETWEEN -100 AND 100),
        elderseal int,
        weapon_type_id int NOT NULL,
        prev_weapon int,
        
        CONSTRAINT pk_gunner PRIMARY KEY (gunner_id)
        
);

CREATE TABLE weapon_type (

        weapon_type_id serial,
        weapon_name varchar(50) NOT NULL,
        
        CONSTRAINT pk_weapon_type PRIMARY KEY (weapon_type_id)

);

CREATE TABLE sharpness (

        sharpness_id serial,
        sharpness_name varchar(20) NOT NULL,
        
        CONSTRAINT pk_sharpness PRIMARY KEY (sharpness_id)

);

CREATE TABLE elements (

        element_id serial,
        element_name varchar(500),
        
        CONSTRAINT pk_element PRIMARY KEY (element_id)

);

CREATE TABLE ammo (
        
        ammo_id serial,
        ammo_name varchar(100) NOT NULL,
        
        CONSTRAINT pk_ammo PRIMARY KEY (ammo_id)
        
);

CREATE TABLE gunner_ammo(
        
        gunner_id int NOT NULL,
        ammo_id int NOT NULL,
        
        CONSTRAINT fk_gunner_id FOREIGN KEY (gunner_id) REFERENCES gunner (gunner_id),
        CONSTRAINT fk_ammo_id FOREIGN KEY (ammo_id) REFERENCES ammo (ammo_id)
        
);

CREATE TABLE monster (

        monster_id serial,
        name varchar(100) NOT NULL,
        
        CONSTRAINT pk_monster PRIMARY KEY (monster_id)
        
);

CREATE TABLE monster_bodypart(
        
        monster_id int NOT NULL,
        bodypart_id int NOT NULL,
        physical_resistance int NOT NULL

);

CREATE TABLE bodypart(

        bodypart_id serial,
        bodypart_name varchar(100) NOT NULL,
        
        CONSTRAINT pk_bodypart PRIMARY KEY (bodypart_id)

);

CREATE TABLE monster_element(

        monster_id int NOT NULL,
        element_id int NOT NULL,
        element_resistance int NOT NULL

);


INSERT INTO weapon_type (weapon_name)
VALUES  ('great sword'),
        ('hammer'),
        ('bow'),
        ('sword and shield'),
        ('dual blades'),
        ('gunlance'),
        ('lance'),
        ('switch axe'),
        ('charge blade'),
        ('long sword'),
        ('insect glaive'),
        ('gunting horn'),
        ('light bow gun'),
        ('heavy bow gun');

INSERT INTO sharpness (sharpness_name)
VALUES  ('red'),
        ('orange'),
        ('yellow'),
        ('green'),
        ('blue'),
        ('white'),
        ('purple');
        
INSERT INTO elements (element_name)
VALUES  ('none'),
        ('fire'),
        ('water'),
        ('thunder'),
        ('ice'),
        ('dragon'),
        ('stun'),
        ('blast'),
        ('sleep'),
        ('poison'),
        ('stamina'),
        ('paralysis');
        
INSERT INTO ammo (ammo_name)
VALUES  ('power'),
        ('paralysis'),
        ('poison'),
        ('sleep'),
        ('blast'),
        ('close range'),
        ('normal'),
        ('piercing'),
        ('spread'),
        ('sticky'),
        ('cluster'),
        ('recover'),
        ('exhaust'),
        ('flaming'),
        ('water'),
        ('freeze'),
        ('thunder'),
        ('dragon'),
        ('slicing'),
        ('wyvern'),
        ('demon'),
        ('armor'),
        ('tranq');
        
INSERT INTO bodypart(bodypart_name)
VALUES  ('head'),
        ('neck'),
        ('throat'),
        ('back'),
        ('body'),
        ('forelegs'),
        ('hindlegs'),
        ('tail base'),
        ('tail'),
        ('crow'),
        ('arms'),
        ('legs'),
        ('nose'),
        ('wings'),
        ('tail tip'),
        ('horns'),
        ('torso'),
        ('stomach'),
        ('claws'),
        ('horns'),
        ('chest'),
        ('spore sac'),
        ('lower body'),
        ('stomach inflated'),
        ('fin'),
        ('rock'),
        ('neck pouch'),
        ('tongue'),
        ('head bone'),
        ('hindleg bones'),
        ('rock head casing face'),
        ('rock head casing top'),
        ('rock head casing bottom'),
        ('rock lower body'),
        ('rock forelegs'),
        ('rock hindlegs'),
        ('rock wings'),
        ('antennae'),
        ('jaw'),
        ('upper neck'),
        ('lower neck'),
        ('shell');
        
ALTER TABLE gunner ADD CONSTRAINT fk_weapon_type_id FOREIGN KEY (weapon_type_id) REFERENCES weapon_type (weapon_type_id);
ALTER TABLE blademaster ADD CONSTRAINT fk_weapon_type_id FOREIGN KEY (weapon_type_id) REFERENCES weapon_type (weapon_type_id);
ALTER TABLE blademaster ADD CONSTRAINT fk_sharpness_id FOREIGN KEY (sharpness_id) REFERENCES sharpness (sharpness_id);
ALTER TABLE blademaster ADD CONSTRAINT fk_element_id FOREIGN KEY (element_id) REFERENCES elements (element_id);
ALTER TABLE monster_bodypart ADD CONSTRAINT fk_monster_id FOREIGN KEY (monster_id) REFERENCES monster (monster_id);
ALTER TABLE monster_bodypart ADD CONSTRAINT fk_bodypart_id FOREIGN KEY (bodypart_id) REFERENCES bodypart (bodypart_id);
ALTER TABLE monster_element ADD CONSTRAINT fk_monster_id FOREIGN KEY (monster_id) REFERENCES monster (monster_id);
ALTER TABLE monster_element ADD CONSTRAINT fk_element_id FOREIGN KEY (element_id) REFERENCES elements (element_id);


COMMIT;
---------------------------------------------- Creacion de Secuencia ----------------------------------------------

-- sequence sec_persona
create sequence sec_persona
 start with 1
 increment by 1
 maxvalue 999999999999999999999999999
 minvalue 1
 nocycle; 

-- Inicializar la secuencia
select sec_persona.nextval from dual;

-- drop sequence sec_persona


-- sequence sec_empleado
create sequence sec_empleado
 start with 1
 increment by 1
 maxvalue 999999999999999999999999999
 minvalue 1
 nocycle;

-- Inicializar la secuencia
select sec_empleado.nextval from dual;


-- select *from all_sequences where sequence_name IN ('SEC_EMPLEADO', 'SEC_PERSONA');

---------------------------------------------- Tabla Persona ----------------------------------------------

-- Tabla
create table persona(
ID integer PRIMARY KEY NOT NULL,
NOMBRE varchar2(50) NOT NULL,
A_PATERNO varchar2(50) NOT NULL,
A_MATERNO varchar2(50) NOT NULL,
EDAD integer NULL,
CURP varchar2(50) UNIQUE NOT NULL,
FECHA_ALTA date,
EMPLEADO_ID integer NOT NULL
);

-- Para utilizar la secuencia creada en una inserción de fila:
-- insert into persona values(sec_persona.currval, 'Angel', 'Martinez', 'Leon', '37', 'MALA851207HDFRNN06', sysdate, 1);
insert into persona values(sec_persona.nextval, 'Diana', 'Martinez', 'Leon', '28', 'MALD941011MDFRNN06', sysdate, 2);

-- Consultar la Tabla
Select * from persona;

-- OPCIONES PARA OBTENER FECHAS DEL SISTEMA
--select sysdate from dual;
--select systimestamp from dual;
--select to_date ('05-SEP-2019 10:00 AM','DD-MON-YYYY HH:MI AM') from dual;
--select to_date('15/12/2020')-5 from dual;
---------------------------------------------- Tabla Empleado ----------------------------------------------

-- Tabla
create table empleado(
ID integer PRIMARY KEY NOT NULL,
PUESTO varchar2(50) NOT NULL,
SUELDO float NOT NULL
);

-- Insertar
--insert into empleado values(sec_empleado.currval, 'Desarrollador2', 45850);
insert into empleado values(sec_empleado.nextval, 'Desarrollador7', 45850);
--insert into empleado values(26, 'Desarrollador7', 45850);
-- Consultar
Select * from empleado;
--Delete from empleado




---------------------------------------------- Consultar OBJETOS CREADOS ----------------------------------------------

-- Consultar Secuencias
select *from all_sequences where sequence_name IN ('SEC_EMPLEADO', 'SEC_PERSONA');

-- Consultar la Tablas
Select * from empleado;
Select * from persona;

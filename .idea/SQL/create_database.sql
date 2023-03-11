DROP TABLE IF EXISTS employee, department;
DROP TYPE IF EXISTS sex;

CREATE TYPE sex AS ENUM ('MALE', 'FEMALE');

CREATE TABLE department
(
    id_department   BIGINT  NOT NULL,
    name            VARCHAR(30) NOT NULL,
    address         VARCHAR(60),
    max_capacity    INT NOT NULL,
    CONSTRAINT PK_department PRIMARY KEY(id_department)
);

CREATE SEQUENCE department_sequence OWNED BY department.id_department;

CREATE TABLE employee
(
    id_employee     BIGINT,
    firstname       VARCHAR(20) NOT NULL,
    lastname        VARCHAR(20) NOT NULL,
    hire_date       DATE,
    sex             sex NOT NULL,
    id_department   BIGINT NOT NULL,
    CONSTRAINT PK_employee PRIMARY KEY(id_employee),
    CONSTRAINT FK_employee_department FOREIGN KEY(id_department)
        REFERENCES department(id_department)
);

CREATE SEQUENCE employee_sequence OWNED BY employee.id_employee;

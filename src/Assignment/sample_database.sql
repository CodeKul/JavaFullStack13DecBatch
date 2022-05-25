–Creating DEPT table.
CREATE TABLE dept(
    deptno INT,
    dname VARCHAR(14),
    loc VARCHAR(13),
       constraint pk_dept primary key (deptno)
);

— Creating EMP table.
CREATE TABLE emp(
    empno INT,
    ename VARCHAR(10),
    job VARCHAR(9),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(7,2),
    comm DECIMAL(7,2),
    deptno INT,
   constraint pk_emp primary key (empno),
   constraint fk_deptno foreign key (deptno) references dept (deptno)
);

— Data Insertion in DEPT table
INSERT INTO dept(deptno, dname, loc) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

— Data Insertion in EMP table
INSERT INTO emp VALUES
(7839, 'KING', 'PRESIDENT', null, '1981-11-17', 5000, null, 10),
(7698, 'BLAKE', 'MANAGER', 7839,'1981-05-01', 2850, null, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, null, 10),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02',2975, null, 20),
(7788, 'SCOTT', 'ANALYST', 7566, '1981-04-19',3000, null, 20),
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', 3000, null, 20),
(7369, 'SMITH', 'CLERK', 7902,'1980-12-17', 800, null, 20),
(7499, 'ALLEN', 'SALESMAN', 7698,'1981-02-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22',1250, 500, 30),
(7654, 'MARTIN', 'SALESMAN', 7698,'1981-09-28',1250, 1400, 30),
(7844, 'TURNER', 'SALESMAN', 7698,'1981-09-08',1500, 0, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-05-23',1100, null, 20),
(7900, 'JAMES', 'CLERK', 7698,'1981-03-12',950, null, 30),
(7934, 'MILLER', 'CLERK', 7782,'1982-01-23',1300, null, 10)
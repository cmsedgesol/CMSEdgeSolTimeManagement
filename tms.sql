CREATE DATABASE  IF NOT EXISTS `tms`;
USE `tms`;
 
 CREATE TABLE `Employee` (
	`Employee_FirstName` varchar(50) NOT NULL,
	`Employee_ID` varchar(20),
	`Role_ID` INT,
	`User_ID` varchar(20),
	`Employee_LastName` varchar(50) ,
	`Employee_MiddleName` varchar(50),
	`Password` varchar(30) NOT NULL,
	PRIMARY KEY (`Employee_ID`)
);
CREATE TABLE `Employee_PersonalDetails` (
	`Employee_ID` varchar(20) NOT NULL,
	`Employee_Aadhar_No` INT(20) NOT NULL,
	`Employee_Primary_Mobile_Number` INT(15) NOT NULL,
	`Employee_Secondary_Mobile_Number` INT(15),
	`Employee_Personal_Email_ID` varchar(50) NOT NULL,
	`Employee_DOB` DATE NOT NULL,
	`Employee_GENDER` varchar(2) NOT NULL,
	`Employee_Present_Address` TEXT(500) NOT NULL,
	`Employee_Permenent_Address` TEXT(500) NOT NULL,
	`Employee_BloodGroup` varchar(20),
	`Employee_Emergency_Contact_Name` TEXT(50) NOT NULL,
	`Employee_Emergency_Contact_Mobile_Number` INT(15) NOT NULL,
	`Employee_Photo` blob(5000),
	`Employee_Height` DECIMAL(20),
	`Employee_Weight` DECIMAL(20),
	`Employee_Hobbies` TEXT(200),
	`Employee_HealthIssues` TEXT(100) 
);

CREATE TABLE `Employee_Professional_Details` (
	`Employee_ID` varchar(20) NOT NULL,
	`Employee_DateOfJoining` DATE NOT NULL,
	`Employee_Official_Email_ID` varchar(50),
	`Employee_Current_Designation` varchar(50),
	`Employee_Previous_Designation` varchar(50),
	`Employee_Technical_Manager_Name` varchar(50),
	`Employee_Admin_Manager_Name` varchar(50) ,
	`Employee_SalaryType` TEXT(20) ,
	`Employee_Appraisal_Cycle` VARCHAR(30) ,
	`Employee_Education` varchar(100) NOT NULL,
	`Employee_EmploymentType` varchar(20),
	`Employee_Experience` varchar(10),
	`Employee_PrimarySkillSet` TEXT(500) NOT NULL,
	`Employee_SecondarySkillSet` TEXT(500),
	`Employee_Previous Experience` varchar(1000),
	`Employee_Resignation_Date` DATE,
	`Employee_Resignation_or_Decativation_Reason` varchar(200) 
);

CREATE TABLE `Employee_Financial_Details` (
	`Employee_ID` varchar(20) NOT NULL,
	`Employee_Bank_Name` varchar(20) NOT NULL,
	`Employee_Bank_Account_Number` varchar(20) NOT NULL,
	`Employee_Bank__Account_Name` varchar(50) NOT NULL,
	`Employee_Bank_IFSC_Code` varchar(15) NOT NULL,
	`Employee_Pancard_Number` varchar(20)
);

CREATE TABLE `Client_Details` (
	`Client_ID` varchar(20) NOT NULL,
	`Client_Name` varchar(50) NOT NULL,
	`Client_Description` Text(200)
);

CREATE TABLE `Project_Details` (
	`Project_ID` varchar(20) NOT NULL,
	`Project_Name` varchar(50) NOT NULL,
	`Client_ID` varchar(20) NOT NULL,
	`Employee_ID` varchar(20) NOT NULL,
	`Project_Description` Text(200)
);

CREATE TABLE `Task_Details` (
	`Client_ID` varchar(20) NOT NULL,
	`Project_ID` varchar(20) NOT NULL,
	`Task_ID` varchar(50) NOT NULL,
	`Task_Name` varchar(100) NOT NULL,
	`Billable_Task` BOOLEAN, 
    `StartTime` timestamp NOT NULL,
	`EndTime` timestamp NOT NULL,
    `Status` varchar(50),
    `Complete` int(3),
    `Priority` varchar(50) NOT NULL,
	`Task_Description` Text(200)
);

CREATE TABLE `Task_Assaign` (
	`Task_ID` varchar(50) NOT NULL,
	`Employee_ID` varchar(20) NOT NULL,
	`Assain_Date` TIMESTAMP NOT NULL
);

CREATE TABLE `TimeSheet` (
	`Task_ID` varchar(50) NOT NULL,
	`Timesheet_Date` DATE NOT NULL,
	`SickLeave` DECIMAL(5) ,
	`CasualLeave` DECIMAL(5) ,
	`EarnedLeave` DECIMAL(5) ,
	`MaternityLeave` DECIMAL(5) ,
	`PeternityLeave` DECIMAL(5) ,
	`Others` DECIMAL(5) ,
	`RegularHours` DECIMAL(5) ,
	`OvertimeHours` DECIMAL(5) 
);

CREATE TABLE `Employee_Current_Leave` (
	`Employee_ID` varchar(20) NOT NULL,
	`Employee_Sick_Leaves_Count` DECIMAL(5) ,
	`Employee_Casual_Leaves_Count` DECIMAL(5) ,
	`Employee_Maternity_Leaves_Count` DECIMAL(5) ,
	`Employee_Paternity_Leaves_Count` DECIMAL(5) ,
	`Employee_Earned_Leaves_Count` DECIMAL(5) 
);

CREATE TABLE `Roles` (
	`Role_ID` INT ,
	`Role_Name` varchar(100) NOT NULL,
	PRIMARY KEY (`Role_ID`)
);

CREATE TABLE `Resources` (
	`Resources_ID` INT ,
	`Resources_Name` varchar(100) NOT NULL,
	PRIMARY KEY (`Resources_ID`)
);

CREATE TABLE `Users_Roles` (
	`Role_ID` INT NOT NULL,
	`Users_Roles_ID` INT NOT NULL,
	`User_ID` INT NOT NULL,
	PRIMARY KEY (`Users_Roles_ID`)
);

CREATE TABLE `Roles_Resources` (
	`Roles_Resources_ID` INT NOT NULL,
	`Resources_ID` INT NOT NULL,
	`Roles__ID` INT NOT NULL,
	PRIMARY KEY (`Roles_Resources_ID`)
);

CREATE TABLE `Employee_Health_Insurance_Details` (
	`Employee_ID` varchar(20) ,
	`Health_insurance_Provider` varchar(20) ,
	`Health_Card_Number` varchar(20) ,
	`Has_Dependents` BOOLEAN 
);

CREATE TABLE `Health_Insurance_Dependents` (
	`Health_Card_Number` INT ,
	`Employee_ID` varchar(20) ,
	`Dependent_card_number` varchar(20) 
);

CREATE TABLE `Health_Insurance_Dependents_Details` (
	`Dependent_Card_Number` varchar(20) ,
	`Dependent_Name` varchar(20) 
);

CREATE TABLE `Employee_salary_breakup` (
	`Employee_ID` varchar(20) NOT NULL,
	`Basic` DECIMAL(20) ,
	`HRA` DECIMAL(20) ,
	`Medical_allowance` DECIMAL(20) ,
	`Conveyance_Allowance` DECIMAL(20) ,
	`Telephone_Allowance` DECIMAL(20) ,
	`Car_Allowance` DECIMAL(20) ,
	`Special_Allowance` DECIMAL(20) ,
	`Uniform_Allowance` DECIMAL(20) ,
	`Hourly_Rate` DECIMAL(20) ,
	`Earnings_For_Month` DECIMAL 
);

CREATE TABLE `Employee_Leave_Details` (
	`Employee_ID` varchar(20) NOT NULL,
	`Leave_Date` DATETIME ,
	`Reason_for_Leave` varchar(100) ,
	`Leave_Type` varchar(10) ,
	`Finaicial_Year` varchar(10) 
);

CREATE TABLE tms.`Time_Entry` (
	`Time_Entry_ID` INT(20) NOT NULL,
	`Week_Entry_ID` INT(20) NOT NULL,
	`Employee_ID` varchar(20) NOT NULL,
	`Project_Name` varchar(20),
	`Date` DATE NOT NULL,
	`Task_Name` varchar(20) NOT NULL,
	`User_Name` TEXT(50) NOT NULL,
	`Day` TEXT(20) NOT NULL,
	`Description` varchar(5000),
	`Mon_Time_In_Hours` DECIMAL(15) ,
    `Tue_Time_In_Hours` DECIMAL(15) ,
    `Wed_Time_In_Hours` DECIMAL(15) ,
    `Thu_Time_In_Hours` DECIMAL(15) ,
    `Fri_Time_In_Hours` DECIMAL(15) ,
    `Sat_Time_In_Hours` DECIMAL(15) ,
    `Sun_Time_In_Hours` DECIMAL(15) 
    );
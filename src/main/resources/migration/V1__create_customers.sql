CREATE TABLE IF NOT EXISTS `customers` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(1024),
	`address` varchar(2048),
	`dob` date ,
	`phone` varchar(24),
	`type` varchar(1024),
	`email` varchar(1024),
	`created_at` timestamp DEFAULT CURRENT_TIMESTAMP,
	`created_by` varchar(1024),
	`updated_at` timestamp DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(1024)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8
DROP TABLE IF EXISTS `lecturer`;
CREATE TABLE `lecturer` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `age` int(3) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
)
DROP TABLE IF EXISTS `student`;
CREATE TABLE `subject` (
  `subject_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `subject_code` varchar(50) NOT NULL,
  `subject_name` varchar(100) NOT NULL,
  PRIMARY KEY (`subject_id`)
)
INSERT INTO `subject` VALUES (1,'SENG12213','Data Structures & Algorithms'),(2,'SENG12223','Database Design & Developments'),(3,'SENG12233','Object Oriented Programming');
DROP TABLE IF EXISTS `subject_has_lecturer`;
CREATE TABLE `subject_has_lecturer` (
  `lecturer_lecturer_id` int(11) unsigned NOT NULL,
  `subject_subject_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`lecturer_lecturer_id`,`subject_subject_id`),
  KEY `subject_subject_id` (`subject_subject_id`),
  CONSTRAINT `subject_has_lecturer_ibfk_1` FOREIGN KEY (`subject_subject_id`) REFERENCES `subject` (`subject_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `subject_has_lecturer_ibfk_2` FOREIGN KEY (`lecturer_lecturer_id`) REFERENCES `lecturer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
)
DROP TABLE IF EXISTS `subject_has_student`;
CREATE TABLE `subject_has_student` (
  `student_student_id` int(11) unsigned NOT NULL,
  `subject_subject_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`student_student_id`,`subject_subject_id`),
  KEY `subject_subject_id` (`subject_subject_id`),
  CONSTRAINT `subject_has_student_ibfk_3` FOREIGN KEY (`student_student_id`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `subject_has_student_ibfk_4` FOREIGN KEY (`subject_subject_id`) REFERENCES `subject` (`subject_id`) ON DELETE CASCADE ON UPDATE CASCADE
)

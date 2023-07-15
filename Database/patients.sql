


CREATE TABLE `patients` (
  `id` int(10) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Age` varchar(10) NOT NULL,
  `Gender` varchar(25) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Phone` varchar(25) NOT NULL,
  `AadharNo` varchar(50) NOT NULL,
  `Disease` varchar(500) NOT NULL,
  `ReportId` varchar(50) NOT NULL,
  `ReportStatus` varchar(2000) NOT NULL,
  `Medicine` varchar(2000) NOT NULL,
  `Note` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



ALTER TABLE `patients`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `ReportId` (`ReportId`);



ALTER TABLE `patients`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;


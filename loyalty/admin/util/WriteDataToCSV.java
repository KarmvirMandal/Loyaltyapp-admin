package com.mobiloitte.loyalty.admin.util;

import java.io.PrintWriter;
import java.util.List;

import com.mobiloitte.loyalty.admin.dto.AllDetailsDto;
import com.mobiloitte.loyalty.admin.model.User;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class WriteDataToCSV {

	/**
	 * Way 1
	 */
	public static void writeDataToCsvUsingStringArray(PrintWriter writer, List<AllDetailsDto> responce1) {
		String[] CSV_HEADER = { "userId", "firstName", "lastName" };
		try (
				CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
						CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);) {
			csvWriter.writeNext(CSV_HEADER);
			for (AllDetailsDto customer : responce1) {
				String[] data = {
						customer.getUserId(),
						customer.getFirstName(),
						customer.getLastName() 
						};

				csvWriter.writeNext(data); 
			}

			System.out.println("Write CSV using CSVWriter successfully!");
		} catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		}
	}

	/**
	 * Way 2
	 */
	public static void writeDataToCsvWithListObjects(PrintWriter writer, List<User> customers) {
		String[] CSV_HEADER = { "userId", "firstName", "lastName" };
		StatefulBeanToCsv<User> beanToCsv = null;
		try (CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
				CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);) {
			csvWriter.writeNext(CSV_HEADER);

			// write List of Objects
			ColumnPositionMappingStrategy<User> mappingStrategy = new ColumnPositionMappingStrategy<User>();

			mappingStrategy.setType(User.class);
			mappingStrategy.setColumnMapping(CSV_HEADER);

			beanToCsv = new StatefulBeanToCsvBuilder<User>(writer).withMappingStrategy(mappingStrategy)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();

			beanToCsv.write(customers);

			System.out.println("Write CSV using BeanToCsv successfully!");
		} catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		}
	}
}
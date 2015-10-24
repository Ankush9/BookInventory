package com.sample.bookinventory.utilities;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sample.inventorybook.model.Book;

/**
 * 
 * A545423
 */
@Component
public class JAXBUtils {

	Logger LOGGER = LoggerFactory.getLogger(JAXBUtils.class);

	public String convertBookToXML(Book book) {
		JAXBContext context;
		String msg = null;
		try {
			context = JAXBContext.newInstance(Book.class);
			Marshaller m = context.createMarshaller(); // for pretty-print XML
														// in JAXB
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			StringWriter writer = new StringWriter();
			m.marshal(book, writer);
			msg = writer.toString();
			LOGGER.debug(msg);
			return msg;

		} catch (JAXBException e) { // TODO Auto-generated catch block
			LOGGER.error(e.getCause() + e.getMessage());
		}
		return null;
	}

}
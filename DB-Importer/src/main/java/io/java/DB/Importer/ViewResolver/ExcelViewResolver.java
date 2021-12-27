package io.java.DB.Importer.ViewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import io.java.DB.Importer.View.ExcelView;

import java.util.Locale;

public class ExcelViewResolver implements ViewResolver {

	@Override
	public View resolveViewName(String s, Locale locale) throws Exception {

		return new ExcelView();
	}
}

package com.globo.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class LeituraProperties {
	public static Properties getProp() throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./src/test/resources/globobot.properties");
		prop.load(file);
		return prop;
	}

	public static String getAcessoUrl() {
		try {
			Properties prop = getProp();
			return prop.getProperty("url");
		}catch (IOException e) {
			Assert.fail("Não foi encontrado o caminho do arquivo propeties");
		}
		return null;
	}
}

package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

/**
 * @author GTST - Grupo de tratamiento de señales y telecomunicaciones -
 *         Universidad Surcolombiana
 *
 */

public class PanelDiabetesTracking {

	/**
	 * 
	 * @param exam
	 *            - exam object
	 * @return -
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "41653-7":
			exam.setDisplayCode("Glucose [Mass/volume] in Capillary blood by Glucometer");
			exam.setCode("41653-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/41653-7.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2345-7":
			exam.setDisplayCode("Glucose - lab");
			exam.setCode("2345-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2345-7.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "55420-4":
			exam.setDisplayCode("Hours after meal [Time]");
			exam.setCode("55420-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/55420-4.html?sections=Comprehensive");
			exam.setUnit("h");
			break;
		case "4548-4":
			exam.setDisplayCode("Hemoglobin A1c/Hemoglobin.total in Blood");
			exam.setCode("4548-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/4548-4.html?sections=Comprehensive");
			exam.setUnit("%");
			break;
		case "27353-2":
			exam.setDisplayCode("Glucose mean value [Mass/volume] in Blood Estimated from glycated hemoglobin");
			exam.setCode("27353-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/27353-2.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "14957-5":
			exam.setDisplayCode("Microalbumin [Mass/volume] in Urine");
			exam.setCode("14957-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/14957-5.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2514-8":
			exam.setDisplayCode("Ketones [Presence] in Urine by Test strip");
			exam.setCode("2514-8");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2514-8.html?sections=Comprehensive");
			break;
		case "5792-7":
			exam.setDisplayCode("Glucose [Mass/volume] in Urine by Test strip");
			exam.setCode("5792-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/5792-7.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "9057-1":
			exam.setDisplayCode("Calorie intake total 24 hour");
			exam.setCode("9057-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/9057-1.html?sections=Comprehensive");
			exam.setUnit("kcal/(24.h)");
			break;
		case "55400-6":
			exam.setDisplayCode("Date of last eye examination");
			exam.setCode("55400-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/55400-6.html?sections=Comprehensive");
			break;

		}
		return exam;
	}

	/**
	 * 
	 * @return exam list name
	 */
	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("41653-7");
		listExam.add("2345-7");
		listExam.add("55420-4");
		listExam.add("4548-4");
		listExam.add("27353-2");
		listExam.add("14957-5");
		listExam.add("2514-8");
		listExam.add("5792-7");
		listExam.add("9057-1");
		listExam.add("55400-6");
		return listExam;
	}
}

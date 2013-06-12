package org.sample.web.config;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sample.model.Contact;
import org.sample.model.Country;
import org.sample.model.Person;
import org.sample.model.Relative;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.ralscha.extdirectspring.generator.IncludeValidation;
import ch.ralscha.extdirectspring.generator.ModelGenerator;
import ch.ralscha.extdirectspring.generator.OutputFormat;

@Controller
@RequestMapping
public class ModelController {

    @RequestMapping("/app/model/Person.js")
    public void person(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelGenerator.writeModel(request, response, Person.class, OutputFormat.EXTJS4, IncludeValidation.ALL, true);
    }

    @RequestMapping("/app/model/Contact.js")
    public void contact(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelGenerator.writeModel(request, response, Contact.class, OutputFormat.EXTJS4, IncludeValidation.ALL, true);
    }

    @RequestMapping("/app/model/Country.js")
    public void country(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelGenerator.writeModel(request, response, Country.class, OutputFormat.EXTJS4, IncludeValidation.ALL, true);
    }

    @RequestMapping("/app/model/Relative.js")
    public void relative(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelGenerator.writeModel(request, response, Relative.class, OutputFormat.EXTJS4, IncludeValidation.ALL, true);
    }
}
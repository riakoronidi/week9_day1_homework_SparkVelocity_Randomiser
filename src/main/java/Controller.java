import models.RandomName;

import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

//        http://localhost:4567/one
        get("/one", (req, res) -> {
            models.RandomName randomName = new models.RandomName();
            String result = randomName.getItemFromList();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            model.put("template", "names.vtl");
            return new ModelAndView(model,"layout.vtl");
        },velocityTemplateEngine);

//        http://localhost:4567/two
        get("/two", (req, res) -> {
            models.RandomName randomName = new models.RandomName();
            String result = randomName.getPairFromList();
            HashMap<String, Object> model = new HashMap<>();
            model.put("pairedNames", result);
            model.put("template", "pairednames.vtl");
            return new ModelAndView(model,"layout.vtl");
        },velocityTemplateEngine);

        //        http://localhost:4567/three
        get("/three", (req, res) -> {
            models.RandomName randomName = new models.RandomName();
            String result = randomName.getThreeItemsFromList();
            HashMap<String, Object> model = new HashMap<>();
            model.put("threeNames", result);
            model.put("template", "threeNames.vtl");
            return new ModelAndView(model,"layout.vtl");
        },velocityTemplateEngine);

        //        http://localhost:4567/four
        get("/four", (req, res) -> {
            models.RandomName randomName = new models.RandomName();
            String result = randomName.getFourItemsFromList();
            HashMap<String, Object> model = new HashMap<>();
            model.put("fourNames", result);
            model.put("template", "fourNames.vtl");
            return new ModelAndView(model,"layout.vtl");
        },velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });

    }
}


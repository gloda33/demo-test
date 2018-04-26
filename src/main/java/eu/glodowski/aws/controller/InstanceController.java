package eu.glodowski.aws.controller;

import eu.glodowski.aws.model.Instance;
import eu.glodowski.aws.service.AwsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class InstanceController {


    @GetMapping("/instance")
    public String createInstanceForm(Model model) {
        model.addAttribute("instance", new Instance());
        return "instance";
    }

    @PostMapping
    public String instancePost(@ModelAttribute("instance") Instance instance) {
        AwsService.createInstance(instance);
        return "result";
    }
}

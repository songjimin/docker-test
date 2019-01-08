package docker.test.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

	@RequestMapping("/")
	public String test() {
		return "Hello Docker & K8s";
	}

}

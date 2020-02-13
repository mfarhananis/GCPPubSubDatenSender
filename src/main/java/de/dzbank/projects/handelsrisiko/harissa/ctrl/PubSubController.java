package de.dzbank.projects.handelsrisiko.harissa.ctrl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableBinding(Source.class)
public class PubSubController {
	
	MessageChannel output;
	
	public PubSubController(Source source) {
		this.output = source.output();
	}
	
	@PostMapping("/publish/{data}")
	public ResponseEntity<Void> publish(@PathVariable String data) {
		this.output.send(MessageBuilder.withPayload(data).build());
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}

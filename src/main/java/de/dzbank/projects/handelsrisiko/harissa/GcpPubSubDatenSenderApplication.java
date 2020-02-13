package de.dzbank.projects.handelsrisiko.harissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
public class GcpPubSubDatenSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpPubSubDatenSenderApplication.class, args);
	}
	
}

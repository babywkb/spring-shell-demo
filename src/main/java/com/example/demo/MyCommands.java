package com.example.demo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MyCommands {

	@ShellMethod("Hoge.")
	public String hoge() {
		return "ほげ";
	}
}
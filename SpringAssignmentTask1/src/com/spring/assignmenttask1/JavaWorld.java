package com.spring.assignmenttask1;

public class JavaWorld implements JavaLanguage{
	
	public PythonWorld pythonWorld;

	public JavaWorld(PythonWorld pythonWorld) {
		super();
		this.pythonWorld = pythonWorld;
	}

	@Override
	public String learningJava() {
		// TODO Auto-generated method stub
		return "I am learning java";
	}
	
	public String learningPython() {
		return pythonWorld.learningPython();
	}

}

package com.demo.learning.enumdemo;

public enum ThreadStates {

	START{
		public String getDetails() { 
			return "ENUM Start";
		}
	},
	RUNNABLE{
		public String getDetails() { 
			return "RUNNABLE";
		}
	},
	WAITING{
		public String getDetails() { 
			return "WAITING";
		}
	},
	DEAD{
		public String getDetails() { 
			return "DEAD";
		}
	};
	
	abstract String getDetails();
}

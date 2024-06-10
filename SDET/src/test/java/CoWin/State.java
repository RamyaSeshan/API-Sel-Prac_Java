package CoWin;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


public class State {

		private int state_id ;

		public int getState_id() {
			return state_id;
		}

		public void setState_id(int state_id) {
			this.state_id = state_id;
		}

		public String getState_name() {
			return state_name;
		}

		public void setState_name(String state_name) {
			this.state_name = state_name;
		}

		private String state_name ;

		public State() {

		}

		
	}



package CoWin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class StateVal {

	private State[]  states ;
	private int ttl;

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

	public StateVal() {
			}

	public State[] getStates() {
		return states;
	}

	public void setStates(State[] states) {
		this.states = states;
	} 


}

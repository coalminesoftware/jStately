package com.coalmine.jstately.graph.state;

import com.coalmine.jstately.graph.composite.CompositeState;

/** Base representation of a state.
 * @see FinalState */
public interface State<TransitionInput> {
	/** @return A String that uniquely identifies a state in a machine. */
	String getIdentifier();

	/** @return Optional human readable description of the state. */
	String getDescription();

	CompositeState<TransitionInput> getComposite();
	void setComposite(CompositeState<TransitionInput> section);

	/** Called by a state machine when the machine enters the state. */
	void onEnter();

	/** Called by a state machine when the machine exits the state. */
	void onExit();
}



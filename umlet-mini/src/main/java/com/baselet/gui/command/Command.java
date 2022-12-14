package com.baselet.gui.command;

import com.baselet.diagram.DiagramHandler;
import com.baselet.diagram.SelectorOld;

public abstract class Command {

	public void execute(@SuppressWarnings("unused") DiagramHandler handler) {

	}

	public void undo(DiagramHandler handler) {
		if (handler != null) {
			SelectorOld selector = handler.getDrawPanel().getSelector();
			if (selector != null) {
				selector.deselectAll();
			}
		}
	}
}

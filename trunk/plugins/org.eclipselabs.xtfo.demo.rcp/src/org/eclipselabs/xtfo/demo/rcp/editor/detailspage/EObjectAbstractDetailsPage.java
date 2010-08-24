/**
 * Copyright (c) 2010 ProxiAD
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 */
package org.eclipselabs.xtfo.demo.rcp.editor.detailspage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipselabs.xtfo.demo.rcp.editor.RCPEditor;


public abstract class EObjectAbstractDetailsPage implements IDetailsPage {

	private IManagedForm managedForm;
	private FormToolkit toolkit; 
	private EObject editedObject;
	private RCPEditor rcpEditor;
	
	public EObjectAbstractDetailsPage(RCPEditor rcpEditor) {
		this.rcpEditor = rcpEditor;
	}
	
	protected RCPEditor getEditor() {
		return rcpEditor;
	}
	
	protected EObject getEditedEObject() {
		return editedObject;
	}
	
	public void initialize(IManagedForm form) {
		this.managedForm = form;
		toolkit = managedForm.getToolkit();
	}

	public void dispose() {
		toolkit.dispose();
	}

	public boolean isDirty() {
		return false;
	}

	public void commit(boolean onSave) {

	}

	public boolean setFormInput(Object input) {
		return true;
	}

	public void setFocus() {

	}

	public boolean isStale() {
		return false;
	}

	public void refresh() {

	}

	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection iss = (IStructuredSelection)selection;
		if (iss.size()==1) {
			editedObject = (EObject)iss.getFirstElement();
		} else {
			editedObject = null;
		}
		update();
	}

	protected abstract void update();
	
	public static void visualizeLayoutArea(Composite container, int color) {
		container.setBackground(Display.getCurrent().getSystemColor(color));
	}
}

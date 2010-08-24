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
package org.eclipselabs.xtfo.demo.rcp.editor.pages;

import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class MasterDetailsPage extends FormPage {
	private TreeMasterDetailsBlock block;
	
	public MasterDetailsPage(FormEditor editor) {
		super(editor, "org.eclipselabs.xtfo.demo.rcp.editor.pages.MasterDetailsPage", "MasterDetailsPage");
		block = new TreeMasterDetailsBlock(this);
	}
	protected void createFormContent(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		form.setText("MasterDetailsPage");
		block.createContent(managedForm);
	}
}
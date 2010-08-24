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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage;
import org.eclipselabs.xtfo.demo.metamodel.demo.Model;
import org.eclipselabs.xtfo.demo.rcp.editor.RCPEditor;


public class ModelDetailsPage extends EObjectAbstractDetailsPage {

	private IManagedForm managedForm;
	private FormToolkit toolkit; 

	public ModelDetailsPage(RCPEditor rcpEditor) {
		super(rcpEditor);
	}
	
	protected Model getEditedEObject() {
		return (Model) super.getEditedEObject();
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

	public void createContents(Composite parent) {
		
		parent.setLayout(new GridLayout());
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		s1.setLayout(new GridLayout());
		s1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		s1.setText("Model Details"); //$NON-NLS-1$
		s1.setDescription("Model section desc"); //$NON-NLS-1$
		
		Composite client = toolkit.createComposite(s1);
		client.setLayout(new GridLayout(2, false));
		client.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		toolkit.createLabel(client, "Name: ");
		t = toolkit.createText(client, "", SWT.SINGLE|SWT.BORDER);
		t.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		modifyListener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (update.cancel()) {
					update.schedule(500L); 
				} else {
					try {
						update.join();
						update.schedule();
					} catch (InterruptedException exception) {
						exception.printStackTrace();
					}
				}
			}
		};
		t.addModifyListener(modifyListener);
		
		s1.setClient(client);
	}

	ModifyListener modifyListener;
	Text t;

	Job update = new Job("update") {
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			GetValue r = new GetValue();
			Display.getDefault().syncExec(r);
			Command setCommand = SetCommand.create(getEditor().getEditingDomain(), getEditedEObject(), DemoPackage.Literals.MODEL__NAME, r.get());
			getEditor().getEditingDomain().getCommandStack().execute(setCommand);
			return Status.OK_STATUS;
		}
	};
	
	@Override
	protected void update() {
		t.removeModifyListener(modifyListener);
		t.setText(getEditedEObject().getName());
		t.addModifyListener(modifyListener);
		
	}

	private final class GetValue implements Runnable {
		String value = "";
	
		public void run() {
			value = t.getText();
		}
		
		public String get() {
			return value;
		}
	}

}

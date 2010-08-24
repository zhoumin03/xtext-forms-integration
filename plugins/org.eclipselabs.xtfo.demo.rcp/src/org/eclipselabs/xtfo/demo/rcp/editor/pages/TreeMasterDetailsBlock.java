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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage;
import org.eclipselabs.xtfo.demo.rcp.editor.RCPEditor;
import org.eclipselabs.xtfo.demo.rcp.editor.detailspage.ArithmeticDetailsPage;
import org.eclipselabs.xtfo.demo.rcp.editor.detailspage.DomainModelDetailsPage;
import org.eclipselabs.xtfo.demo.rcp.editor.detailspage.ModelDetailsPage;


public class TreeMasterDetailsBlock extends MasterDetailsBlock {
	private FormPage page;
	private RCPEditor rcpEditor;
	private AdapterFactory adapterFactory;
	private ViewerPane viewerPane;
	
	public TreeMasterDetailsBlock(FormPage page) {
		this.page = page;
		rcpEditor = (RCPEditor)page.getEditor();
		adapterFactory = rcpEditor.getAdapterFactory();
	}
	
	protected void createMasterPart(final IManagedForm managedForm, Composite parent) {
		FormToolkit toolkit = managedForm.getToolkit();
		Section section = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		section.setText("Master Part Section");
		section.setDescription("Master Part Section description");
		
		section.setLayout(new GridLayout());
		section.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		viewerPane =
			new ViewerPane(rcpEditor.getSite().getPage(), rcpEditor) {
				@Override
				public Viewer createViewer(Composite composite) {
					Tree tree = new Tree(composite, SWT.SINGLE);
					TreeViewer newTreeViewer = new TreeViewer(tree);
					return newTreeViewer;
				}
				@Override
				public void requestActivation() {
					super.requestActivation();
					((RCPEditor)TreeMasterDetailsBlock.this.page.getEditor()).setCurrentViewerPane(this);
				}
			};
		viewerPane.createControl(section);
		section.setClient(viewerPane.getControl());
		
		TreeViewer viewer = (TreeViewer)viewerPane.getViewer();
		
		final SectionPart spart = new SectionPart(section);
		managedForm.addPart(spart);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				managedForm.fireSelectionChanged(spart, selection);
			}
		});
		
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setInput(rcpEditor.getEditingDomain().getResourceSet());
		viewer.setSelection(new StructuredSelection(rcpEditor.getEditingDomain().getResourceSet().getResources().get(0)), true);
		viewerPane.setTitle(rcpEditor.getEditingDomain().getResourceSet());

		rcpEditor.createContextMenuFor(viewer);
	}
	
	protected void createToolBarActions(IManagedForm managedForm) {
		// no toolbar
	}
	
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(new IDetailsPageProvider() {
			public Object getPageKey(Object object) {
				if (object instanceof EObject) {
					return ((EObject) object).eClass();
				} else {
					return object.getClass();
				}
			}
			
			public IDetailsPage getPage(Object key) {
				if (key == DemoPackage.Literals.MODEL) {
					return new ModelDetailsPage(rcpEditor);
				} else if (key == DemoPackage.Literals.DOMAIN_MODEL_WRAPPER) {
					return new DomainModelDetailsPage(rcpEditor);
				} else if (key == DemoPackage.Literals.ARITHMETIC_WRAPPER) {
					return new ArithmeticDetailsPage(rcpEditor);
				} else {
					return null;
				}
			}
		});
	}
}
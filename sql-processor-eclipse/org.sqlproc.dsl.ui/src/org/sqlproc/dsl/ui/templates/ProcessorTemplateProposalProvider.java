package org.sqlproc.dsl.ui.templates;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;

import com.google.inject.Inject;

public class ProcessorTemplateProposalProvider extends DefaultTemplateProposalProvider {

    ContextTypeIdHelper helper;

    @Inject
    public ProcessorTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry,
            ContextTypeIdHelper helper) {
        super(templateStore, registry, helper);
        this.helper = helper;
    }

    @Inject
    ProcessorDslGrammarAccess ga;

    @Override
    protected void createTemplates(TemplateContext templateContext, ContentAssistContext context,
            ITemplateAcceptor acceptor) {
        // "regular templates"
        super.createTemplates(templateContext, context, acceptor);

        // String id = helper.getId(ga.getSqlRule());
        String id = helper.getId(ga.getSqlValueRule());

        // create the template only if that id fits the id of
        // the current template context type
        if (templateContext.getContextType().getId().equals(id)) {

            // create a template on the fly
            Template template = new Template("ins", "CRUD insert statement", "uniqueTemplateID",
                    "\ninsert into ${dbTable} (${dbInsertColumn})\n values (${pojoColumn})\n", false);// auto-insertable?

            // create a proposal
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));

            // make it available
            acceptor.accept(tp);

            template = new Template("sel", "CRUD select statement", "uniqueTemplateID",
                    "\n  select ${dbSelectColumn}\n  from ${dbTable}\n  where 1=1${dbCondColumn}\n", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("upd", "CRUD update statement", "uniqueTemplateID",
                    "\n  update ${dbTable}\n  set (${dbUpdateColumn})\n  where 1=1${dbCondColumn}\n", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("del", "CRUD delete statement", "uniqueTemplateID",
                    "\n  delete from ${dbTable}\n  where 1=1${dbCondColumn}\n", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            // template = new Template("frm", "Form select statement", "uniqueTemplateID",
            // "\n  select ${dbSelectColumn}\n  from ${dbTable}\n  where 1=1${dbCondColumn}\n", false);//
            // auto-insertable?
            // tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            // acceptor.accept(tp);
        }
    }
}

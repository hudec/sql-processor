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
import org.sqlproc.dsl.processorDsl.SqlFragment;
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
        if (templateContext.getContextType().getId().equals(id)
                && (context.getPreviousModel() == null || context.getPreviousModel() instanceof SqlFragment)) {

            // create a template on the fly
            Template template = new Template("ins", "CRUD insert statement", "uniqueTemplateID",
                    "\n  insert into ${dbTable}\n  (${dbInsertColumn})\n  {= values (${pojoColumn}) }\n", false);// auto-insertable?
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
            template = new Template("sel", "CRUD select statement", "uniqueTemplateID",
                    "\n  select ${dbSelectColumn}\n  from ${dbTable}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("upd", "CRUD update statement", "uniqueTemplateID",
                    "\n  update ${dbTable}\n  {= set (${dbUpdateColumn})}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template(
                    "upd-opt",
                    "CRUD optimistic update statement",
                    "uniqueTemplateID",
                    "\n  update ${dbTable}\n  {= set (${dbVerUpdateColumn}${dbOptUpdateColumn})}\n  {= where${dbOptCondColumn}\n  }\n",
                    false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("del", "CRUD delete statement", "uniqueTemplateID",
                    "\n  delete from ${dbTable}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            // template = new Template("frm", "Form select statement", "uniqueTemplateID",
            // "\n  select ${dbSelectColumn}\n  from ${dbTable}\n  where 1=1${dbCondColumn}\n", false);//
            // auto-insertable?
            // tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            // acceptor.accept(tp);
        }

        String idDef = helper.getId(ga.getOptionalFeatureRule());

        // create the template only if that id fits the id of
        // the current template context type
        if (templateContext.getContextType().getId().equals(idDef)) {

            // create a template on the fly
            Template template = new Template("pojos", "Pojo definitions", "uniqueTemplateID", "${pojoDefinitions}",
                    false);// auto-insertable?
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
            template = new Template("tables", "Table definitions", "uniqueTemplateID", "${tableDefinitions}", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
        }

        // generate POJOs
        String idPkg = helper.getId(ga.getPackageDeclarationRule());

        // create the template only if that id fits the id of
        // the current template context type
        if (templateContext.getContextType().getId().equals(idPkg)) {

            // create a template on the fly
            Template template = new Template("pojogen", "Pojo generator", "uniqueTemplateID", "${pojoGenerator}", false);// auto-insertable?
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
        }
    }
}

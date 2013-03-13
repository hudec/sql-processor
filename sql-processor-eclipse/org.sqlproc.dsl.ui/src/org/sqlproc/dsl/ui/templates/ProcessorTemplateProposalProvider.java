package org.sqlproc.dsl.ui.templates;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
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

    protected boolean validate1(Template template, ContentAssistContext context) {
        boolean result = context.getMatcher().isCandidateMatchingPrefix(template.getName(), context.getPrefix());
        return result;
    }

    protected TemplateProposal createProposal1(Template template, TemplateContext templateContext,
            ContentAssistContext context, Image image, int relevance) {
        if (!validate1(template, context))
            return null;
        return doCreateProposal(template, templateContext, context, image, relevance);
    }

    @Override
    protected void createTemplates(TemplateContext templateContext, ContentAssistContext context,
            ITemplateAcceptor acceptor) {
        // "regular templates"
        super.createTemplates(templateContext, context, acceptor);

        if (templateContext.getContextType().getId().equals(helper.getId(ga.getSqlValueRule()))) {

            Template template = new Template("ins", "CRUD insert statement", "insertTemplateID",
                    "\n  insert into ${dbTable}\n  (${dbInsertColumn})\n  {= values (${pojoColumn}) }\n", false);// auto-insertable?
            TemplateProposal tp = createProposal1(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
            template = new Template("get", "CRUD get statement", "getTemplateID",
                    "\n  select ${dbSelectColumn}\n  from ${dbTable}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal1(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("upd", "CRUD update statement", "updateTemplateID",
                    "\n  update ${dbTable}\n  {= set (${dbUpdateColumn})}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal1(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template(
                    "upd-opt",
                    "CRUD optimistic update statement",
                    "updateOptTemplateID",
                    "\n  update ${dbTable}\n  {= set (${dbVerUpdateColumn}${dbOptUpdateColumn})}\n  {= where${dbOptCondColumn}\n  }\n",
                    false);// auto-insertable?
            tp = createProposal1(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("del", "CRUD delete statement", "deleteTemplateID",
                    "\n  delete from ${dbTable}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal1(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);

            template = new Template("select", "QRY select statement", "selectTemplateID",
                    "\n  select ${dbSelectColumn}\n  from ${dbTable}\n  {= where${dbCondColumn}\n  }\n", false);// auto-insertable?
            tp = createProposal1(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
        }

        if (templateContext.getContextType().getId().equals(helper.getId(ga.getOptionalFeatureRule()))) {

            Template template = new Template("pojos", "Pojos definitions", "pojosTemplateID", "${pojoDefinitions}",
                    false);// auto-insertable?
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
            template = new Template("tables", "Tables definitions", "uniqueTemplateID", "${tableDefinitions}", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("metagen", "Meta SQL generator", "metagenTemplateID", "${metaGenerator}", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("procedures", "Procedures definitions", "uniqueTemplateID",
                    "${procedureDefinitions}", false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
            template = new Template("functions", "Functions definitions", "uniqueTemplateID", "${functionDefinitions}",
                    false);// auto-insertable?
            tp = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
            acceptor.accept(tp);
        }

        if (templateContext.getContextType().getId().equals(helper.getId(ga.getAbstractPojoEntityRule()))) {

            Template template = new Template("pojogen", "Pojo generator", "pojogenTemplateID", "${pojoGenerator}",
                    false);// auto-insertable?
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
        }

        if (templateContext.getContextType().getId().equals(helper.getId(ga.getAbstractPojoEntityRule()))) {

            Template template = new Template("daogen", "DAO generator", "daogenTemplateID", "${daoGenerator}", false);// auto-insertable?
            TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
                    getRelevance(template));
            acceptor.accept(tp);
        }
    }
}

package org.sample.web.service;

import java.util.List;

import jakarta.validation.Valid;

import org.sample.model.auth.AuthRole;
import org.sample.model.auth.AuthUser;
import org.sample.model.auth.UserRole;
import org.sample.web.app.auth.AuthRoleService;
import org.sample.web.app.auth.AuthUserService;
import org.sample.web.app.auth.UserRoleService;
import org.sample.web.form.CountHolder;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.sqlproc.engine.impl.SqlStandardControl;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;
import ch.ralscha.extdirectspring.bean.ExtDirectFormPostResult;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadRequest;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadResult;

@Service
public class AuthWeb extends BaseWeb {

    protected AuthUserService authUserService;
    protected AuthRoleService authRoleService;
    protected UserRoleService userRoleService;

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "auth")
    public ExtDirectStoreReadResult<AuthUser> loadAuthUsers(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("loadAuthUsers -> " + request);

        AuthUser form = beanUtils.buildFormFromParams(request.getParams(), AuthUser.class);
        SqlStandardControl sqlControl = (form.getId() == null) ? beanUtils.buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null)
            beanUtils.buildSortFromParams(AuthUser.class, sqlControl, request.getSorters());
        logger.info("loadAuthUsers control " + sqlControl);

        CountHolder count = new CountHolder();
        List<AuthUser> authusers = authUserService.listAuthUsers(form, sqlControl, count);

        ExtDirectStoreReadResult<AuthUser> result = new ExtDirectStoreReadResult<AuthUser>(new Long(count.getCount()),
                authusers, true);
        logger.info("loadAuthUsers <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult createAuthUser(@Valid AuthUser authuser, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        AuthUser resultAuthUser = null;
        if (!result.hasErrors()) {
            resultAuthUser = authUserService.insertAuthUser(authuser);
        }
        if (resultAuthUser != null) {
            postResult.addResultProperty("id", resultAuthUser.getId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult updateAuthUser(@Valid AuthUser authuser, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        AuthUser resultAuthUser = null;

        if (!result.hasErrors()) {
            resultAuthUser = authUserService.updateAuthUser(authuser);

            if (resultAuthUser == null)
                throw new RuntimeException("The record has been in the meantime modified");

            postResult.addResultProperty("id", resultAuthUser.getId());
            postResult.addResultProperty("version", resultAuthUser.getVersion());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult deleteAuthUser(AuthUser authuser, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        AuthUser resultAuthUser = null;
        if (!result.hasErrors()) {
            if (authuser.getId() != null) {
                resultAuthUser = authUserService.deleteAuthUser(authuser);
                postResult.addResultProperty("id", resultAuthUser.getId());
                postResult.addResultProperty("version", resultAuthUser.getVersion());
            }
            if (resultAuthUser == null)
                throw new RuntimeException("The record has been in the meantime modified");
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "auth")
    public ExtDirectStoreReadResult<AuthRole> loadAuthRoles(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("loadAuthRoles -> " + request);

        AuthRole form = beanUtils.buildFormFromParams(request.getParams(), AuthRole.class);
        SqlStandardControl sqlControl = (form.getId() == null) ? beanUtils.buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null)
            beanUtils.buildSortFromParams(AuthRole.class, sqlControl, request.getSorters());
        logger.info("loadAuthRoles control " + sqlControl);

        CountHolder count = new CountHolder();
        List<AuthRole> authroles = authRoleService.listAuthRoles(form, sqlControl, count);

        ExtDirectStoreReadResult<AuthRole> result = new ExtDirectStoreReadResult<AuthRole>(new Long(count.getCount()),
                authroles, true);
        logger.info("loadAuthRoles <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult createAuthRole(@Valid AuthRole authrole, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        AuthRole resultAuthRole = null;
        if (!result.hasErrors()) {
            resultAuthRole = authRoleService.insertAuthRole(authrole);
        }
        if (resultAuthRole != null) {
            postResult.addResultProperty("id", resultAuthRole.getId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult updateAuthRole(@Valid AuthRole authrole, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        AuthRole resultAuthRole = null;

        if (!result.hasErrors()) {
            resultAuthRole = authRoleService.updateAuthRole(authrole);

            if (resultAuthRole == null)
                throw new RuntimeException("The record has been in the meantime modified");

            postResult.addResultProperty("id", resultAuthRole.getId());
            postResult.addResultProperty("version", resultAuthRole.getVersion());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult deleteAuthRole(AuthRole authrole, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        AuthRole resultAuthRole = null;
        if (!result.hasErrors()) {
            if (authrole.getId() != null) {
                resultAuthRole = authRoleService.deleteAuthRole(authrole);
                postResult.addResultProperty("id", resultAuthRole.getId());
                postResult.addResultProperty("version", resultAuthRole.getVersion());
            }
            if (resultAuthRole == null)
                throw new RuntimeException("The record has been in the meantime modified");
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "auth")
    public ExtDirectStoreReadResult<UserRole> loadUserRoles(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("loadUserRoles -> " + request);

        UserRole form = beanUtils.buildFormFromParams(request.getParams(), UserRole.class);
        SqlStandardControl sqlControl = (form.getId() == null) ? beanUtils.buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null)
            beanUtils.buildSortFromParams(UserRole.class, sqlControl, request.getSorters());
        logger.info("loadUserRoles control " + sqlControl);

        CountHolder count = new CountHolder();
        List<UserRole> userroles = userRoleService.listUserRoles(form, sqlControl, count);

        ExtDirectStoreReadResult<UserRole> result = new ExtDirectStoreReadResult<UserRole>(new Long(count.getCount()),
                userroles, true);
        logger.info("loadUserRoles <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult createUserRole(@Valid UserRole userrole, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        UserRole resultUserRole = null;
        if (!result.hasErrors()) {
            resultUserRole = userRoleService.insertUserRole(userrole);
        }
        if (resultUserRole != null) {
            postResult.addResultProperty("id", resultUserRole.getId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult updateUserRole(@Valid UserRole userrole, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        UserRole resultUserRole = null;

        if (!result.hasErrors()) {
            resultUserRole = userRoleService.updateUserRole(userrole);

            if (resultUserRole == null)
                throw new RuntimeException("The record has been in the meantime modified");

            postResult.addResultProperty("id", resultUserRole.getId());
            postResult.addResultProperty("version", resultUserRole.getVersion());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "auth")
    public ExtDirectFormPostResult deleteUserRole(UserRole userrole, BindingResult result) {
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        UserRole resultUserRole = null;
        if (!result.hasErrors()) {
            if (userrole.getId() != null) {
                resultUserRole = userRoleService.deleteUserRole(userrole);
                postResult.addResultProperty("id", resultUserRole.getId());
                postResult.addResultProperty("version", resultUserRole.getVersion());
            }
            if (resultUserRole == null)
                throw new RuntimeException("The record has been in the meantime modified");
        }
        return postResult;
    }

    @Required
    public void setAuthUserService(AuthUserService authuserService) {
        this.authUserService = authuserService;
    }

    @Required
    public void setAuthRoleService(AuthRoleService authroleService) {
        this.authRoleService = authroleService;
    }

    @Required
    public void setUserRoleService(UserRoleService userroleService) {
        this.userRoleService = userroleService;
    }
}

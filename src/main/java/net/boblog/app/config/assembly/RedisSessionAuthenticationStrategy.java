package net.boblog.app.config.assembly;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dave on 16/5/19.
 */
@Component
public class RedisSessionAuthenticationStrategy implements SessionAuthenticationStrategy {

    @Override
    public void onAuthentication(Authentication authentication, HttpServletRequest request, HttpServletResponse response)
            throws SessionAuthenticationException {

    }
}

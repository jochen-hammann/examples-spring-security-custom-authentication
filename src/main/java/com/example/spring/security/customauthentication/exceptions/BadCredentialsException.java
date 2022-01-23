package com.example.spring.security.customauthentication.exceptions;

import org.springframework.security.core.AuthenticationException;

public class BadCredentialsException extends AuthenticationException
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    public BadCredentialsException(String msg)
    {
        super(msg);
    }

    public BadCredentialsException(String msg, Throwable cause)
    {
        super(msg, cause);
    }

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

}

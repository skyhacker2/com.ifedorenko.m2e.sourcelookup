package com.ifedorenko.m2e.sourcelookup.internal;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.debug.core.DebugException;


public class JDIStratumTester
    extends PropertyTester
{

    @Override
    public boolean test( Object receiver, String property, Object[] args, Object expectedValue )
    {
        try
        {
            return JDIHelpers.getLocation( receiver ) != null;
        }
        catch ( DebugException e )
        {
            return false;
        }
    }

}
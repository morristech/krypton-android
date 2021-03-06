package co.krypt.krypton.pgp.publickey;

import co.krypt.krypton.pgp.PGPException;

/**
 * Created by Kevin King on 6/12/17.
 * Copyright 2016. KryptCo, Inc.
 */

public class UnsupportedPublicKeyAlgorithmException extends PGPException {
    UnsupportedPublicKeyAlgorithmException(String message) {
        super(message);
    }
    public UnsupportedPublicKeyAlgorithmException() {
        super();
    }
}

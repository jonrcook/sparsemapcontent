package org.sakaiproject.nakamura.lite.soak.memory;

import org.sakaiproject.nakamura.api.lite.accesscontrol.AccessDeniedException;
import org.sakaiproject.nakamura.lite.storage.ConnectionPoolException;
import org.sakaiproject.nakamura.lite.storage.StorageClientException;

public class SoakAll {

    public static void main(String[] argv) throws ConnectionPoolException, StorageClientException, AccessDeniedException {
        CreateUsersAndGroupsSoak.main(argv);
        CreateUsersAndGroupsWithMembersSoak.main(argv);
    }
}
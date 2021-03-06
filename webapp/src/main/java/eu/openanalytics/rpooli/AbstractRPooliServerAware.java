/**
 * This file is part of RPooli.
 *
 * RPooli is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RPooli is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with RPooli.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.openanalytics.rpooli;

import org.apache.commons.lang3.Validate;

/**
 * @author "OpenAnalytics &lt;rsb.development@openanalytics.eu&gt;"
 */
public abstract class AbstractRPooliServerAware
{
    protected final RPooliServer server;

    public AbstractRPooliServerAware(final RPooliServer server)
    {
        this.server = Validate.notNull(server, "RPooliServer can't be null");
    }
}

/*
 * Smart Race
 * Copyright (C) 2015-2017 Fabien Vanden Bulck
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package be.bulck.smartrace.service.factory;

import be.bulck.smartrace.service.RaceService;
import be.bulck.smartrace.service.ServiceManager;

/**
 * An abstract class representing a factory to retrieve the race service.
 *
 * @author Fabien Vanden Bulck
 */
public abstract class RaceServiceFactory {

    /**
     * Gets the race service.
     *
     * @return the race service
     */
    public abstract RaceService getRaceService();

    /**
     * Gets the instance of a factory to retrieve the race service.
     *
     * @return the instance of a factory to retrieve the race service
     */
    public static RaceServiceFactory getInstance() {
        return (RaceServiceFactory) ServiceManager.getServiceByName("raceServiceFactory");
    }
}

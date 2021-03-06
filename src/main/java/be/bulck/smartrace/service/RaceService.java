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

package be.bulck.smartrace.service;

import be.bulck.smartrace.dao.exception.DataHandlerException;
import be.bulck.smartrace.dao.exception.DataProviderException;
import be.bulck.smartrace.model.Race;

/**
 * An interface representing a service to handle races.
 *
 * @author Fabien Vanden Bulck
 */
public interface RaceService {

    /**
     * Gets the current race.
     *
     * @return the current race
     *
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    Race getRace() throws DataProviderException;

    /**
     * Creates the race.
     *
     * @param filePath the file path of the race
     * @param name the name of the race
     * @param location the location of the race
     * @param description the description of the race
     *
     * @return the race created
     *
     * @throws DataHandlerException an exception thrown if a data handler problem occurs
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    Race create(String filePath, String name, String location, String description) throws DataHandlerException, DataProviderException;

    /**
     * Updates the current race.
     *
     * @param race the race to update
     *
     * @throws DataHandlerException an exception thrown if a data handler problem occurs
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    void update(Race race) throws DataHandlerException, DataProviderException;
}

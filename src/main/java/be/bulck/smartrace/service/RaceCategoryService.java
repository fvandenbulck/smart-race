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
import be.bulck.smartrace.model.RaceCategory;

import java.util.UUID;

/**
 * An interface representing a service to handle race categories.
 *
 * @author Fabien Vanden Bulck
 */
public interface RaceCategoryService {

    /**
     * Finds the race categories.
     *
     * @return the race categories
     *
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    RaceCategory[] find() throws DataProviderException;

    /**
     * Finds a race category by his identifier.
     *
     * @param uuid the identifier of the race category to find
     *
     * @return the race category found with the identifier provided
     *
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    RaceCategory find(UUID uuid) throws DataProviderException;

    /**
     * Finds a race category by his name.
     *
     * @param name the name of the race category to find
     *
     * @return the race category found with the name provided
     *
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    RaceCategory findByName(String name) throws DataProviderException;

    /**
     * Creates a race category.
     *
     * @param raceCategory the race category to create
     *
     * @throws DataHandlerException an exception thrown if a data handler problem occurs
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    void create(RaceCategory raceCategory) throws DataHandlerException, DataProviderException;

    /**
     * Creates a race category.
     *
     * @param name the name of the race category
     *
     * @return the race category created
     *
     * @throws DataHandlerException an exception thrown if a data handler problem occurs
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    RaceCategory create(String name) throws DataHandlerException, DataProviderException;

    /**
     * Updates a race category.
     *
     * @param raceCategory the race category to update
     *
     * @throws DataHandlerException an exception thrown if a data handler problem occurs
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    void update(RaceCategory raceCategory) throws DataHandlerException, DataProviderException;

    /**
     * Deletes a race category.
     *
     * @param raceCategory the race category to delete
     *
     * @throws DataHandlerException an exception thrown if a data handler problem occurs
     * @throws DataProviderException an exception thrown if a data provider problem occurs
     */
    void delete(RaceCategory raceCategory) throws DataHandlerException, DataProviderException;
}

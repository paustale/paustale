package de.paustale.meldeauskunft.repository;

import java.util.List;

import de.paustale.meldeauskunft.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}
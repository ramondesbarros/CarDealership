package br.com.cardealership.integration;

public interface RedisSessionRepository {

    /**
     * @param sessionId
     * @return
     */
    // public Session getSession(String sessionId);

    /**
     * @param sessionId
     * @param sale
     */
    // public void saveSaleSession(String sessionId, Sale sale);

    /**
     * @param sessionId
     * @param plan
     */
    // public void savePlanSession(String sessionId, Plan plan);

    /**
     * @param sessionId
     * @return
     */
    // public Sale getSaleSession(String sessionId);

    /**
     * @param sessionId
     */
    public void delete(String sessionId);
}

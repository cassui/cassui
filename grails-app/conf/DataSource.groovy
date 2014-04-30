dataSource {
    pooled          = true
    driverClassName = "org.h2.Driver"
    username        = "sa"
    password        = ""
    dbCreate        = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
    url             = "jdbc:h2:mem:memDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
    maxWait         = "3000"
    maxIdle         = "-1"
    maxActive       = "-1"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

environments {
  // all environments currently use the default configuration
}

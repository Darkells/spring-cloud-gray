package cn.springcloud.gray.server.dao.repository;

import cn.springcloud.gray.server.dao.model.GrayPolicyDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrayPolicyRepository extends JpaRepository<GrayPolicyDO, Long>, JpaSpecificationExecutor<GrayPolicyDO> {

    Page<GrayPolicyDO> findAllByNamespace(String namespace, Pageable pageable);

    List<GrayPolicyDO> findAllByNamespaceAndDelFlag(String namespace, boolean delFlag);

    List<GrayPolicyDO> findAllByDelFlag(boolean delFlag);

    List<GrayPolicyDO> findAllByIdInAndDelFlag(Iterable<Long> ids, boolean delFlag);
}

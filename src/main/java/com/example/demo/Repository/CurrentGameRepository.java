package com.example.demo.Repository;


import com.example.demo.Modells.CurrentGame;
import com.example.demo.Modells.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CurrentGameRepository extends JpaRepository<CurrentGame, Integer> {
    @Query(value = "SELECT * FROM `current_game` ORDER By current_game.balance DESC ", nativeQuery = true)
    List<CurrentGame> selectAllPlayerDESC();

    @Query(value = "SELECT * FROM `current_game` WHERE `current_game`.`user_id`= :userIN", nativeQuery = true)
    List<CurrentGame>  selectOnePlayer(@Param("userIN") Integer userIN);

    @Query(value = "SELECT `user`.`username`, `current_game`.`color`,`current_game`.`balance` FROM `user` RIGHT JOIN `current_game`  ON `user`.`id`=`current_game`.`user_id` WHERE `user`.`username`= :usernameIN", nativeQuery = true)
    List<Object> checkPlayerByUsername(@Param("usernameIN") String usernameIN);

    @Query(value = "SELECT `user`.`username` FROM `user` LEFT JOIN `current_game` ON `user`.`id` = `current_game`.`user_id` WHERE `current_game`.`user_id` IS NULL", nativeQuery = true)
    List<Object> selectUserNotPlayer();
}

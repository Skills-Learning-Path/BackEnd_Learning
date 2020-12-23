package com.test.library.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.github.dreamyoung.mprelation.JoinColumn;
import com.github.dreamyoung.mprelation.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    @TableId(type = IdType.AUTO)
    private int id;
    @TableField(exist = false)
    @ManyToOne
    @JoinColumn(name = "uid", referencedColumnName = "id")
    private User user;
    @TableField(exist = false)
    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "id")
    private Book book;
}

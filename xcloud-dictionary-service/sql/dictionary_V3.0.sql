CREATE TABLE `dic_ability` (
  `abilityID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '能力id',
  `abilityName` varchar(50)  DEFAULT NULL COMMENT '能力点名称',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `isEffective` tinyint(4) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`abilityID`)
) ENGINE=InnoDB AUTO_INCREMENT=6894279641858049 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='能力类型表';

CREATE TABLE `dic_catalog` (
  `catalogID` int(4) NOT NULL COMMENT '目录ID',
  `catalogName` varchar(50)  DEFAULT NULL COMMENT '目录名称',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`catalogID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='包含学段、文理性、综合性、教材版本、难易度、文件用途、试卷归属、试卷类型、试卷状态';

CREATE TABLE `dic_cause` (
  `causeID` bigint(4) NOT NULL COMMENT '错因ID',
  `causeName` varchar(100)  DEFAULT NULL COMMENT '错因名称',
  `sort` int(4) DEFAULT NULL COMMENT '排序号',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`causeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='选项错因';

CREATE TABLE `dic_content` (
  `contentID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '目录ID',
  `contentName` varchar(100)  DEFAULT NULL COMMENT '目录名称',
  `textbookEdition` int(4) DEFAULT NULL COMMENT '教材版本',
  `contentPID` bigint(20) DEFAULT NULL COMMENT '父目录ID',
  `phaseID` int(4) DEFAULT NULL COMMENT '所属学段',
  `subjectID` int(4) DEFAULT NULL COMMENT '所属学科',
  `gradeID` int(4) DEFAULT NULL COMMENT '年级Id',
  `sort` int(4) DEFAULT NULL COMMENT '排序号',
  `level` int(4) DEFAULT NULL COMMENT '目录级别',
  `isLeaf` tinyint(4) DEFAULT NULL COMMENT '是否是叶子节点，0不是，1是',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`contentID`)
) ENGINE=InnoDB AUTO_INCREMENT=20750 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评-题库-教材目录';

CREATE TABLE `dic_data` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '目录ID',
  `catalogID` int(4) DEFAULT NULL COMMENT '目录ID',
  `dataID` int(4) DEFAULT NULL COMMENT '字典ID',
  `dataValue` varchar(100)  DEFAULT NULL COMMENT '字典值',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=262 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='包含学段、文理性、综合性、教材版本、难易度、文件用途、试卷归属、试卷类型';

CREATE TABLE `dic_grade` (
  `gradeID` int(4) NOT NULL AUTO_INCREMENT COMMENT '年级ID',
  `phaseID` int(4) DEFAULT NULL COMMENT '所属学段',
  `gradeName` varchar(20)  DEFAULT NULL COMMENT '年级名称',
  `sort` int(11) DEFAULT NULL COMMENT '排序号',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`gradeID`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评-题库-年级';

CREATE TABLE `dic_item_bank_region` (
  `regionCode` varchar(6)  NOT NULL COMMENT '地区编码',
  `regionName` varchar(50) DEFAULT NULL COMMENT '地区名称',
  `regionLevel` int(4) DEFAULT NULL COMMENT '地区级别',
  `parentCode` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`regionCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评和题库中试卷和试题覆盖的地区 只到省一级';

CREATE TABLE `dic_item_bank_school` (
  `schoolID` int(7) NOT NULL COMMENT '学校ID',
  `schoolName` varchar(50)  DEFAULT NULL COMMENT '学校名称',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效（1、有效，0、无效）',
  PRIMARY KEY (`schoolID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='校本题库的学校，数据来自um_unit表\r\n';

CREATE TABLE `dic_item_bank_textbook_unit` (
  `unitID` bigint(20) NOT NULL COMMENT '机构ID',
  `unitName` varchar(50)  DEFAULT NULL COMMENT '机构名称',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效（1、有效，0、无效）',
  PRIMARY KEY (`unitID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='教辅机构\r\n';

CREATE TABLE `dic_knowledge` (
  `knowledgeID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '知识点ID',
  `knowledgeName` varchar(50)  DEFAULT NULL COMMENT '知识点名称',
  `knowledgePID` bigint(20) DEFAULT NULL COMMENT '父知识点',
  `subjectID` int(4) DEFAULT NULL COMMENT '所属学科ID',
  `phaseID` int(4) DEFAULT NULL COMMENT '所属学段ID',
  `sort` int(4) DEFAULT NULL COMMENT '排序号',
  `isLeaf` tinyint(4) DEFAULT NULL COMMENT '是否是叶子节点，0不是，1是',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`knowledgeID`)
) ENGINE=InnoDB AUTO_INCREMENT=4690 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评-题库-知识点';

CREATE TABLE `dic_paper_difficulty` (
  `diffID` int(4) NOT NULL COMMENT 'id',
  `phase` int(4) NOT NULL COMMENT '学段',
  `grade` int(4) NOT NULL COMMENT '年级',
  `subject` int(4) NOT NULL COMMENT '学科',
  `scaleLevel5` int(4) DEFAULT NULL COMMENT '困难占比',
  `scaleLevel4` int(4) DEFAULT NULL COMMENT '较难占比',
  `scaleLevel3` int(4) DEFAULT NULL COMMENT '中等占比',
  `scaleLevel2` int(4) DEFAULT NULL COMMENT '较易占比',
  `scaleLevel1` int(4) DEFAULT NULL COMMENT '容易占比',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`diffID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='试卷难度';

CREATE TABLE `dic_paper_type` (
  `typeID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '试卷类型ID',
  `phaseID` int(4) DEFAULT NULL COMMENT '学段ID',
  `typeName` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '试卷类型名称',
  `creator` varchar(10) DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`typeID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='试卷类型';

CREATE TABLE `dic_phase` (
  `phaseID` int(4) NOT NULL AUTO_INCREMENT COMMENT '学段ID',
  `phaseName` varchar(50)  DEFAULT NULL COMMENT '学段名称',
  `sort` int(4) DEFAULT NULL COMMENT '排序号',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`phaseID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评-题库-学段';

CREATE TABLE `dic_question_template` (
  `templateID` int(4) NOT NULL AUTO_INCREMENT COMMENT '模板id',
  `templateName` varchar(50)  DEFAULT NULL COMMENT '模板名称',
  `objectiveStem` int(1) DEFAULT '0' COMMENT '0：客观题    1：主观题',
  `multiSub` int(1) DEFAULT '0' COMMENT '0:不含小题  1:多小题不含三级标题  2:多小题含三级标题',
  `analyzeQue` int(1) DEFAULT '0' COMMENT '0:不解析题干   1:解析题干',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`templateID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='题型模板';

CREATE TABLE `dic_question_type` (
  `typeID` int(4) NOT NULL AUTO_INCREMENT COMMENT '题型ID',
  `typeName` varchar(50)  DEFAULT NULL COMMENT '题型名称',
  `templateId` int(11) DEFAULT NULL COMMENT 'word模板类型',
  `optionCount` int(4) DEFAULT NULL COMMENT '选项个数',
  `sort` int(4) DEFAULT NULL COMMENT '排序号',
  `creator` varchar(32)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(32)  DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`typeID`)
) ENGINE=InnoDB AUTO_INCREMENT=656 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评-题库-题型 对应cp_type';

CREATE TABLE `dic_r_subject_question` (
  `typeID` int(4) NOT NULL COMMENT '题型ID',
  `subjectID` int(4) NOT NULL COMMENT '学科ID',
  `creator` varchar(10)  DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`typeID`,`subjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='学科题型关系';

CREATE TABLE `dic_subject` (
  `subjectID` int(4) NOT NULL AUTO_INCREMENT COMMENT '学科ID',
  `subjectName` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学科名称',
  `phaseID` int(4) DEFAULT NULL COMMENT '所属学段',
  `subjectPID` int(4) DEFAULT NULL COMMENT '父级学科',
  `classIcon` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '图标类名',
  `isComprehensive` tinyint(1) DEFAULT NULL COMMENT '是否综合学科',
  `sort` int(11) DEFAULT NULL COMMENT '排序号',
  `creator` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(1) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`subjectID`)
) ENGINE=InnoDB AUTO_INCREMENT=564 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='测评-题库-学科';

CREATE TABLE `dic_user_subject` (
  `userSubjectID` bigint(20) NOT NULL COMMENT '用户学科关联ID',
  `username` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户学信号',
  `subjectID` int(4) NOT NULL COMMENT '学科ID',
  `phaseID` int(4) NOT NULL COMMENT '所属学段',
  `creator` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '修改人',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `isEffective` tinyint(4) DEFAULT NULL COMMENT '是否有效(1、有效，0、无效)',
  PRIMARY KEY (`userSubjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户学科关联表';


#迁移cp_subject数据
insert into dic_subject(subjectID,subjectName,phaseID,classIcon,isComprehensive,creator,createDate,isEffective)
select subjectID,subjectName,phaseID,classIcon,0,creator,createDate,isEffective from cp_subject;
update dic_subject set isComprehensive=1 where subjectID in (554,555,560,561);
update dic_subject a set subjectPID = (select b.parentSubjectID  from cp_subject_catalog b where b.subjectID=a.subjectID limit 1);
#迁移字典表
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective)
select catalogID,dataID,dataValue,10000,now(),1 from cn_dictdata;
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective)
select catalogID,catalogName,10000,now(),1 from cn_dictcatalog;
#迁移学段
insert into dic_phase(phaseID,phaseName,creator,createDate,isEffective)
select phaseID,phaseName,creator,createDate,isEffective from cp_phase;
#迁移年级表
insert into dic_grade(gradeID,phaseID,gradeName,creator,createDate,isEffective)
select gradeID,phaseID,gradeName,creator,createDate,1 from cp_grade;
#迁移地区表
insert into dic_item_bank_region(regionCode,regionName,regionLevel,creator,createDate,isEffective)
select code,name,level,100000,now(),1 from cn_district;

#迁移知识点表
INSERT INTO dic_knowledge (knowledgeID, knowledgeName, knowledgePID, subjectID, phaseID,
	sort,
	isLeaf,
	creator,
	createDate,
	isEffective
) SELECT 	knowledgeID, knowledgeName, knowledgePID, subjectID, phaseID,
	sn,
	isLeaf,
	creator,
	createDate,
	isEffective from cp_knowledge;


#迁移试题类型表
INSERT into dic_question_type(typeID,typeName,templateId,optionCount,sort,creator,createDate,modifier,modifyDate,isEffective)
SELECT typeID,typeName,templateType,optionCount,sn,creator,createDate,modifier,modifyDate,isEffective from cp_type;


#迁移教材目录表
INSERT into dic_content(contentID,contentName,textbookEdition,contentPID,phaseID,subjectID
,sort,level,isLeaf,creator,createDate,modifier,modifyDate,isEffective)
SELECT  contentsID,contentsName,textBookID,contentsPID,phaseID,subjectID
,sn,null,isLeaf,creator,createDate,modifier,modifyDate,isEffective
from cp_contents

#将知识点表中的sort数据更新成0，用于上移下移使用,待修改
ALTER TABLE `dic_knowledge`
MODIFY COLUMN `sort`  int(8) NULL DEFAULT NULL COMMENT '排序号';
update dic_knowledge a,(
SELECT a.*,(@rownum:=@rownum+1) AS forder
FROM dic_knowledge a,(SELECT @rownum:=0) b
)c
set a.sort = c.forder
where a.knowledgeID = c.knowledgeID;

#将教材目录表中的sort数据更新成0，用于上移下移使用,待修改
ALTER TABLE `dic_content`
MODIFY COLUMN `sort`  int(8) NULL DEFAULT NULL COMMENT '排序号';
update dic_content a,(
SELECT a.*,(@rownum:=@rownum+1) AS forder
FROM dic_content a,(SELECT @rownum:=0) b
)c
set a.sort = c.forder
where a.contentID = c.contentID;

#难易度：38、文件用途：39、试卷归属：40、学科综合性：42、试卷状态：43
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(36,"试题类型","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(37,"教材版本","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(38,"难易度","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(39,"文件用途","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(40,"试卷归属","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(41,"试卷类型","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(42,"学科综合性","100000",now(),1);
insert into dic_catalog(catalogID,catalogName,creator,createDate,isEffective) value(43,"试卷状态","100000",now(),1);

#插入试题类型字典36（客观题，主观题）
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(36,0,"客观题","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(36,1,"主观题","100000",now(),1);

#插入难易度38
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(38,1,"较易","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(38,2,"易","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(38,3,"中","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(38,4,"较难","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(38,5,"难","100000",now(),1);

#插入文件用途39
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(39,0,"试卷","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(39,1,"习题集","100000",now(),1);

#插入试卷归属40
DELETE from dic_data where catalogID = 40;
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(40,0,"学信试卷","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(40,1,"校本题库","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(40,2,"教辅书","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(40,3,"教学试卷","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(40,4,"午餐故事屋","100000",now(),1);


#插入试卷状态43
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,-1,"管理员删除","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,0,"新建试卷","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,1,"解析中","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,2,"完善未通过","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,3,"待核对","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,4,"核对中","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,5,"核对完成","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,6,"审核未通过","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,7,"待完善","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,8,"完善中","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,9,"完善完成","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,10,"待审核","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,11,"审核中","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,12,"审核完成","100000",now(),1);
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective) value(43,13,"解析失败","100000",now(),1);

#插入教材版本
insert into dic_data(catalogID,dataID,dataValue,creator,createDate,isEffective)
SELECT 37,textBookID,textBookName,"100000",now(),1 from cp_textbook ;

#插入试卷类型（初始值）
INSERT into dic_paper_type(typeID,typeName,phaseID,creator,createDate,isEffective)
SELECT typeID,typeName,phaseID,creator,createDate,isEffective
from cp_exampapertype;

#update dic_content set gradeID = 50;


#知识点教材目录加外键关系，解决删除父级知识点或者教材目录时，将子节点同时删除
ALTER TABLE `dic_knowledge`
 ADD CONSTRAINT `fk_knowledgeID` FOREIGN KEY (`knowledgePID`) REFERENCES `dic_knowledge` (`knowledgeID`) ON DELETE CASCADE;
ALTER TABLE `dic_content`
 ADD CONSTRAINT `fk_contentID` FOREIGN KEY (`contentPID`) REFERENCES `dic_content` (`contentID`) ON DELETE CASCADE;

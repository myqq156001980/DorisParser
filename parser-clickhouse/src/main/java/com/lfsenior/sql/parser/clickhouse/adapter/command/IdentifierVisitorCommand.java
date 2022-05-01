package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.adapter.IdentifierVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>IdentifierVisitorCommand</code></b>
 * <p/>
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:40.
 *
 * @author LFSenior
 */
public class IdentifierVisitorCommand extends ClickHouseVisitorCommand<SQLIdentifierExpr> {
    public IdentifierVisitorCommand() {
        super(new IdentifierVisitor(), ":IdentifierVisitor");
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.IdentifierContext;
    }

    /**
     * 判断是否接受该结果
     *
     * @param obj
     * @return
     */
    public static boolean hasReserve(Object obj) {
        return obj != null;
    }
}

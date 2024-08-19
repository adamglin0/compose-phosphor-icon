package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Tree-view-bold`: ImageVector
    get() {
        if (`_tree-view-bold` != null) {
            return `_tree-view-bold`!!
        }
        `_tree-view-bold` = Builder(name = "Tree-view-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 156.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(176.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(92.0f, 108.0f)
                lineTo(92.0f, 84.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(116.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 12.0f)
                lineTo(64.0f, 12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 32.0f)
                lineTo(44.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 64.0f, 84.0f)
                horizontalLineToRelative(4.0f)
                lineTo(68.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(176.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(96.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(92.0f, 132.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(4.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 176.0f, 156.0f)
                close()
                moveTo(68.0f, 36.0f)
                lineTo(92.0f, 36.0f)
                lineTo(92.0f, 60.0f)
                lineTo(68.0f, 60.0f)
                close()
                moveTo(180.0f, 196.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(180.0f, 220.0f)
                close()
                moveTo(180.0f, 108.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(180.0f, 132.0f)
                close()
            }
        }
        .build()
        return `_tree-view-bold`!!
    }

private var `_tree-view-bold`: ImageVector? = null

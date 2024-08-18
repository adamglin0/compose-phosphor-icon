package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Line-segment`: ImageVector
    get() {
        if (`_line-segment` != null) {
            return `_line-segment`!!
        }
        `_line-segment` = Builder(name = "Line-segment", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.64f, 41.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -50.2f, 38.89f)
                lineTo(80.25f, 164.44f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, -38.89f, 4.94f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 50.2f, 6.37f)
                lineToRelative(84.19f, -84.19f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 38.89f, -50.2f)
                close()
                moveTo(75.31f, 203.36f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.64f, -22.64f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 75.31f, 203.33f)
                close()
                moveTo(203.31f, 75.36f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 203.33f, 75.3f)
                close()
            }
        }
        .build()
        return `_line-segment`!!
    }

private var `_line-segment`: ImageVector? = null

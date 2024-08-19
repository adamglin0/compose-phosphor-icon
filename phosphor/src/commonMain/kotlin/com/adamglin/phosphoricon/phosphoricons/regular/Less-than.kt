package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Less-than`: ImageVector
    get() {
        if (`_less-than` != null) {
            return `_less-than`!!
        }
        `_less-than` = Builder(name = "Less-than", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.23f, 203.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.66f, 3.81f)
                lineToRelative(-152.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -14.46f)
                lineToRelative(152.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.85f, 14.46f)
                lineTo(66.69f, 128.0f)
                lineToRelative(136.73f, 64.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 207.23f, 203.42f)
                close()
            }
        }
        .build()
        return `_less-than`!!
    }

private var `_less-than`: ImageVector? = null

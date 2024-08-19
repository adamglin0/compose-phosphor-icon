package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Terminal-thin`: ImageVector
    get() {
        if (`_terminal-thin` != null) {
            return `_terminal-thin`!!
        }
        `_terminal-thin` = Builder(name = "Terminal-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.34f, 3.0f)
                lineToRelative(-72.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.32f, -6.0f)
                lineTo(106.0f, 128.0f)
                lineTo(37.34f, 67.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.32f, -6.0f)
                lineToRelative(72.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(216.0f, 188.0f)
                lineTo(120.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_terminal-thin`!!
    }

private var `_terminal-thin`: ImageVector? = null

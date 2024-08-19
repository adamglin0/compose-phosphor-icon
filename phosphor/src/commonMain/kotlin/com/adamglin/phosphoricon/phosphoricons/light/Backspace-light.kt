package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Backspace-light`: ImageVector
    get() {
        if (`_backspace-light` != null) {
            return `_backspace-light`!!
        }
        `_backspace-light` = Builder(name = "Backspace-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(68.53f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.0f, 6.8f)
                lineTo(10.86f, 124.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 6.18f)
                lineTo(56.53f, 207.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.0f, 6.8f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(68.53f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.71f, -1.0f)
                horizontalLineToRelative(0.0f)
                lineTo(23.0f, 128.0f)
                lineTo(66.82f, 55.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.71f, -1.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(164.24f, 108.24f)
                lineTo(144.48f, 128.0f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(136.0f, 136.48f)
                lineToRelative(-19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(127.52f, 128.0f)
                lineToRelative(-19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(136.0f, 119.52f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return `_backspace-light`!!
    }

private var `_backspace-light`: ImageVector? = null

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

public val LightGroup.`Eraser-light`: ImageVector
    get() {
        if (`_eraser-light` != null) {
            return `_eraser-light`!!
        }
        `_eraser-light` = Builder(name = "Eraser-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.57f, 81.81f)
                lineTo(182.19f, 40.43f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -31.12f, 0.0f)
                lineTo(32.43f, 159.07f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.11f)
                lineTo(62.5f, 220.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 66.74f, 222.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(126.49f)
                lineToRelative(97.08f, -97.08f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 223.57f, 81.81f)
                close()
                moveTo(109.51f, 210.0f)
                horizontalLineTo(69.22f)
                lineToRelative(-28.3f, -28.3f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.15f)
                lineTo(96.0f, 112.48f)
                lineTo(151.52f, 168.0f)
                close()
                moveTo(215.08f, 104.44f)
                lineTo(160.0f, 159.51f)
                lineTo(104.48f, 104.0f)
                lineToRelative(55.08f, -55.07f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.14f, 0.0f)
                lineToRelative(41.38f, 41.37f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 215.08f, 104.44f)
                close()
            }
        }
        .build()
        return `_eraser-light`!!
    }

private var `_eraser-light`: ImageVector? = null

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

public val LightGroup.`Sticker-light`: ImageVector
    get() {
        if (`_sticker-light` != null) {
            return `_sticker-light`!!
        }
        `_sticker-light` = Builder(name = "Sticker-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 34.0f)
                lineTo(88.0f, 34.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 34.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, 54.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, false, 1.9f, -0.31f)
                curveToRelative(25.84f, -8.61f, 75.18f, -57.95f, 83.79f, -83.79f)
                arcTo(5.86f, 5.86f, 0.0f, false, false, 222.0f, 136.0f)
                lineTo(222.0f, 88.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 168.0f, 34.0f)
                close()
                moveTo(46.0f, 168.0f)
                lineTo(46.0f, 88.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 88.0f, 46.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                verticalLineToRelative(42.0f)
                lineTo(184.0f, 130.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, 54.0f)
                verticalLineToRelative(26.0f)
                lineTo(88.0f, 210.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 46.0f, 168.0f)
                close()
                moveTo(142.0f, 206.67f)
                lineTo(142.0f, 184.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f)
                horizontalLineToRelative(22.67f)
                curveTo(194.84f, 163.1f, 163.1f, 194.84f, 142.0f, 206.67f)
                close()
            }
        }
        .build()
        return `_sticker-light`!!
    }

private var `_sticker-light`: ImageVector? = null

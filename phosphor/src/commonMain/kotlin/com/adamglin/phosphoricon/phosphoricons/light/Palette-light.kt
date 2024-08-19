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

public val LightGroup.`Palette-light`: ImageVector
    get() {
        if (`_palette-light` != null) {
            return `_palette-light`!!
        }
        `_palette-light` = Builder(name = "Palette-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.37f, 55.31f)
                arcTo(101.32f, 101.32f, 0.0f, false, false, 128.0f, 26.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 26.0f, 128.0f)
                curveToRelative(0.0f, 42.09f, 26.07f, 77.44f, 68.0f, 92.26f)
                arcTo(30.21f, 30.21f, 0.0f, false, false, 104.11f, 222.0f)
                arcTo(30.06f, 30.06f, 0.0f, false, false, 134.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineToRelative(46.21f)
                arcToRelative(29.82f, 29.82f, 0.0f, false, false, 29.25f, -23.31f)
                arcTo(102.71f, 102.71f, 0.0f, false, false, 230.0f, 127.11f)
                arcTo(101.25f, 101.25f, 0.0f, false, false, 199.37f, 55.31f)
                close()
                moveTo(215.76f, 148.0f)
                arcToRelative(17.89f, 17.89f, 0.0f, false, true, -17.55f, 14.0f)
                lineTo(152.0f, 162.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -24.0f, 17.0f)
                curveTo(61.0f, 195.86f, 38.0f, 164.85f, 38.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 89.07f, -90.0f)
                lineTo(128.0f, 38.0f)
                arcToRelative(90.34f, 90.34f, 0.0f, false, true, 90.0f, 89.22f)
                arcTo(90.46f, 90.46f, 0.0f, false, true, 215.76f, 148.0f)
                close()
                moveTo(138.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 76.0f)
                close()
                moveTo(94.0f, 100.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 84.0f, 90.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 100.0f)
                close()
                moveTo(94.0f, 156.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 156.0f)
                close()
                moveTo(182.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_palette-light`!!
    }

private var `_palette-light`: ImageVector? = null

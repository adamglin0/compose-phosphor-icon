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

public val LightGroup.`Nuclear-plant-light`: ImageVector
    get() {
        if (`_nuclear-plant-light` != null) {
            return `_nuclear-plant-light`!!
        }
        `_nuclear-plant-light` = Builder(name = "Nuclear-plant-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 34.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f)
                horizontalLineTo(152.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 152.0f, 34.0f)
                close()
                moveTo(104.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 98.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 62.0f)
                close()
                moveTo(246.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(34.0f)
                curveToRelative(14.0f, -28.0f, 30.2f, -69.68f, 31.88f, -114.59f)
                arcTo(13.92f, 13.92f, 0.0f, false, true, 79.85f, 82.0f)
                horizontalLineToRelative(88.33f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 13.37f)
                curveTo(184.32f, 144.45f, 206.92f, 190.0f, 218.28f, 210.0f)
                horizontalLineTo(240.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 216.0f)
                close()
                moveTo(168.18f, 94.0f)
                horizontalLineTo(150.0f)
                curveToRelative(0.06f, 0.46f, 0.1f, 0.94f, 0.12f, 1.41f)
                curveTo(151.82f, 140.32f, 168.0f, 182.0f, 182.0f, 210.0f)
                horizontalLineToRelative(22.55f)
                curveToRelative(-12.44f, -23.1f, -32.32f, -66.9f, -34.4f, -114.11f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 168.18f, 94.0f)
                close()
                moveTo(47.34f, 210.0f)
                horizontalLineTo(168.66f)
                curveToRelative(-13.86f, -28.94f, -28.86f, -69.92f, -30.51f, -114.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -1.86f)
                horizontalLineTo(79.85f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.86f)
                curveTo(76.2f, 140.08f, 61.2f, 181.06f, 47.34f, 210.0f)
                close()
            }
        }
        .build()
        return `_nuclear-plant-light`!!
    }

private var `_nuclear-plant-light`: ImageVector? = null

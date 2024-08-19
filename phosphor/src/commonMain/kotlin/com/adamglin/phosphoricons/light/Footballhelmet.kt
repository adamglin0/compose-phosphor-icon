package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Footballhelmet: ImageVector
    get() {
        if (_footballhelmet != null) {
            return _footballhelmet!!
        }
        _footballhelmet = Builder(name = "Footballhelmet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 164.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 164.0f)
                close()
                moveTo(230.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(180.0f, 222.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -13.43f, -10.0f)
                lineToRelative(-11.22f, -38.0f)
                horizontalLineToRelative(-26.1f)
                lineToRelative(4.33f, 14.56f)
                curveToRelative(0.0f, 0.13f, 0.07f, 0.27f, 0.1f, 0.4f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 120.0f, 206.0f)
                lineTo(72.14f, 206.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 68.75f, 205.0f)
                arcTo(98.0f, 98.0f, 0.0f, false, true, 26.0f, 124.0f)
                curveToRelative(0.0f, -53.27f, 43.35f, -97.22f, 96.61f, -98.0f)
                arcTo(98.0f, 98.0f, 0.0f, false, true, 222.0f, 124.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(156.0f, 134.0f)
                lineToRelative(8.27f, 28.0f)
                lineTo(216.0f, 162.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 176.0f)
                close()
                moveTo(122.0f, 191.71f)
                lineToRelative(-15.54f, -52.26f)
                curveToRelative(0.0f, -0.14f, -0.07f, -0.28f, -0.1f, -0.41f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 120.0f, 122.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, -86.0f, -84.0f)
                horizontalLineToRelative(-1.24f)
                curveTo(76.0f, 38.66f, 38.0f, 77.22f, 38.0f, 124.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 36.0f, 70.0f)
                horizontalLineToRelative(46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.29f)
                close()
                moveTo(151.79f, 162.0f)
                lineToRelative(-8.27f, -28.0f)
                lineTo(120.0f, 134.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.29f)
                lineTo(125.66f, 162.0f)
                close()
                moveTo(218.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(167.85f, 174.0f)
                lineToRelative(10.21f, 34.57f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 180.0f, 210.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _footballhelmet!!
    }

private var _footballhelmet: ImageVector? = null

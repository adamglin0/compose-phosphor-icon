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

public val LightGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(80.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(28.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 114.0f, 176.0f)
                close()
                moveTo(176.0f, 170.0f)
                lineTo(148.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(238.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(24.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(34.0f, 210.0f)
                lineTo(34.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, -4.8f)
                lineTo(98.0f, 124.0f)
                lineTo(98.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, -4.8f)
                lineTo(149.0f, 114.28f)
                lineToRelative(12.0f, -84.26f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, true, 13.86f, -12.0f)
                horizontalLineToRelative(18.12f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, true, 13.86f, 12.0f)
                lineToRelative(15.0f, 105.13f)
                reflectiveCurveToRelative(0.06f, 0.59f, 0.06f, 0.85f)
                verticalLineToRelative(74.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 216.0f)
                close()
                moveTo(160.0f, 122.49f)
                lineTo(170.0f, 130.0f)
                horizontalLineToRelative(39.08f)
                lineTo(195.0f, 31.72f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -1.72f)
                lineTo(174.94f, 30.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.72f)
                close()
                moveTo(46.0f, 210.0f)
                lineTo(210.0f, 210.0f)
                lineTo(210.0f, 142.0f)
                lineTo(168.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.6f, -1.2f)
                lineTo(150.0f, 130.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(110.0f, 100.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.6f, 4.8f)
                lineTo(46.0f, 100.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null

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

public val RegularGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.0f, 71.42f)
                lineTo(149.54f, 80.0f)
                lineTo(171.0f, 88.57f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 165.0f, 103.42f)
                lineTo(128.0f, 88.61f)
                lineTo(91.0f, 103.42f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 85.0f, 88.57f)
                lineTo(106.46f, 80.0f)
                lineTo(85.0f, 71.42f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 91.0f, 56.57f)
                lineToRelative(37.0f, 14.81f)
                lineToRelative(37.0f, -14.81f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 71.42f)
                close()
                moveTo(224.0f, 79.75f)
                curveToRelative(0.0f, 42.72f, -8.0f, 75.4f, -14.69f, 95.28f)
                curveToRelative(-8.73f, 25.8f, -20.63f, 45.49f, -32.65f, 54.0f)
                arcToRelative(15.69f, 15.69f, 0.0f, false, true, -15.95f, 1.41f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, true, -9.18f, -13.36f)
                curveTo(150.68f, 205.58f, 146.48f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(-22.68f, 37.59f, -23.53f, 49.11f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, true, -16.0f, 14.9f)
                arcToRelative(15.67f, 15.67f, 0.0f, false, true, -9.13f, -2.95f)
                curveToRelative(-12.0f, -8.53f, -23.92f, -28.22f, -32.65f, -54.0f)
                curveTo(40.0f, 155.15f, 32.0f, 122.47f, 32.0f, 79.75f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 88.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 224.0f, 79.75f)
                close()
                moveTo(208.0f, 79.75f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 168.0f, 40.0f)
                lineTo(88.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 48.0f, 79.76f)
                curveToRelative(0.0f, 40.55f, 7.51f, 71.4f, 13.85f, 90.14f)
                curveToRelative(11.05f, 32.66f, 23.0f, 43.37f, 26.61f, 46.0f)
                curveTo(91.57f, 174.67f, 105.59f, 152.0f, 128.0f, 152.0f)
                reflectiveCurveToRelative(36.45f, 22.71f, 39.49f, 63.94f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.6f, -2.59f, 15.57f, -13.26f, 26.66f, -46.0f)
                curveTo(200.49f, 151.16f, 208.0f, 120.31f, 208.0f, 79.76f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null

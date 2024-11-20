package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 24.0f)
                lineTo(88.0f, 24.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 32.0f, 79.75f)
                curveToRelative(0.0f, 42.72f, 8.0f, 75.4f, 14.7f, 95.28f)
                curveToRelative(8.72f, 25.8f, 20.62f, 45.49f, 32.64f, 54.0f)
                arcTo(15.67f, 15.67f, 0.0f, false, false, 88.47f, 232.0f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, 16.0f, -14.9f)
                curveToRelative(0.85f, -11.52f, 5.0f, -49.11f, 23.53f, -49.11f)
                reflectiveCurveToRelative(22.68f, 37.59f, 23.53f, 49.11f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, 9.18f, 13.36f)
                arcToRelative(15.69f, 15.69f, 0.0f, false, false, 15.95f, -1.41f)
                curveToRelative(12.0f, -8.53f, 23.92f, -28.22f, 32.64f, -54.0f)
                curveTo(216.0f, 155.15f, 224.0f, 122.47f, 224.0f, 79.75f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 168.0f, 24.0f)
                close()
                moveTo(171.0f, 80.57f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 165.0f, 95.42f)
                lineTo(128.0f, 80.61f)
                lineTo(91.0f, 95.42f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 85.0f, 80.57f)
                lineTo(106.46f, 72.0f)
                lineTo(85.0f, 63.42f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 91.0f, 48.57f)
                lineToRelative(37.0f, 14.81f)
                lineToRelative(37.0f, -14.81f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 63.42f)
                lineTo(149.54f, 72.0f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null

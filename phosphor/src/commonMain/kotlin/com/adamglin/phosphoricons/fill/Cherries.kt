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

public val FillGroup.Cherries: ImageVector
    get() {
        if (_cherries != null) {
            return _cherries!!
        }
        _cherries = Builder(name = "Cherries", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.42f, 72.0f)
                arcToRelative(75.24f, 75.24f, 0.0f, false, false, -10.21f, 0.37f)
                arcToRelative(91.9f, 91.9f, 0.0f, false, false, -21.59f, -25.09f)
                curveTo(108.78f, 16.79f, 57.05f, 23.77f, 54.87f, 24.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 31.43f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, 3.69f, 7.32f)
                curveToRelative(17.4f, 11.68f, 25.37f, 30.91f, 28.7f, 49.65f)
                arcToRelative(72.08f, 72.08f, 0.0f, true, false, 16.26f, 0.14f)
                curveTo(93.54f, 68.59f, 86.56f, 52.0f, 76.0f, 39.37f)
                curveToRelative(16.67f, 0.72f, 41.24f, 4.78f, 60.64f, 20.48f)
                arcToRelative(74.76f, 74.76f, 0.0f, false, true, 15.0f, 16.39f)
                curveToRelative(-1.9f, 0.69f, -3.79f, 1.44f, -5.65f, 2.29f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, false, -4.49f, 4.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.41f, 9.0f)
                arcToRelative(88.9f, 88.9f, 0.0f, false, true, 13.59f, 14.0f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, false, 0.65f, 0.65f)
                curveTo(160.0f, 108.15f, 165.83f, 112.0f, 176.0f, 112.0f)
                curveToRelative(12.15f, 0.0f, 18.18f, -5.51f, 18.43f, -5.75f)
                lineToRelative(-0.09f, 0.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                curveTo(204.6f, 118.72f, 194.77f, 128.0f, 176.0f, 128.0f)
                lineToRelative(-1.61f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 4.0f)
                arcToRelative(87.91f, 87.91f, 0.0f, false, true, -7.0f, 71.6f)
                arcToRelative(8.39f, 8.39f, 0.0f, false, false, -1.0f, 6.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 6.0f)
                curveToRelative(1.78f, 0.13f, 3.59f, 0.2f, 5.37f, 0.2f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 2.42f, -144.0f)
                close()
                moveTo(106.42f, 122.21f)
                lineTo(106.33f, 122.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                curveTo(116.6f, 134.72f, 106.77f, 144.0f, 88.0f, 144.0f)
                reflectiveCurveToRelative(-28.6f, -9.28f, -29.66f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(-0.09f, -0.09f)
                curveToRelative(0.25f, 0.24f, 6.28f, 5.75f, 18.43f, 5.75f)
                reflectiveCurveTo(106.18f, 122.49f, 106.43f, 122.25f)
                close()
            }
        }
        .build()
        return _cherries!!
    }

private var _cherries: ImageVector? = null

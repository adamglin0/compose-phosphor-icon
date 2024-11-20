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

public val FillGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.11f, 60.68f)
                curveToRelative(-7.65f, -13.19f, -27.85f, -16.16f, -58.5f, -8.66f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 32.81f, 140.3f)
                curveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f)
                curveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f)
                arcToRelative(124.11f, 124.11f, 0.0f, false, false, 28.79f, -4.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 153.78f, -88.25f)
                curveToRelative(12.51f, -13.0f, 20.83f, -25.35f, 23.66f, -35.92f)
                curveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f)
                close()
                moveTo(231.42f, 75.68f)
                curveToRelative(-6.11f, 22.78f, -48.65f, 57.31f, -87.52f, 79.64f)
                curveToRelative(-67.81f, 39.0f, -113.62f, 41.52f, -119.16f, 32.0f)
                curveToRelative(-1.46f, -2.51f, -0.65f, -7.24f, 2.22f, -13.0f)
                arcToRelative(80.06f, 80.06f, 0.0f, false, true, 10.28f, -15.05f)
                arcToRelative(95.53f, 95.53f, 0.0f, false, false, 6.23f, 14.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 2.12f)
                arcToRelative(122.14f, 122.14f, 0.0f, false, false, 16.95f, -3.32f)
                curveToRelative(21.23f, -5.55f, 46.63f, -16.48f, 71.52f, -30.78f)
                reflectiveCurveToRelative(47.0f, -30.66f, 62.45f, -46.15f)
                arcTo(122.74f, 122.74f, 0.0f, false, false, 209.7f, 82.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.17f, -4.52f)
                arcToRelative(96.26f, 96.26f, 0.0f, false, false, -9.1f, -12.46f)
                curveToRelative(14.21f, -2.35f, 27.37f, -2.17f, 30.5f, 3.24f)
                curveTo(232.19f, 70.28f, 232.24f, 72.63f, 231.42f, 75.69f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null

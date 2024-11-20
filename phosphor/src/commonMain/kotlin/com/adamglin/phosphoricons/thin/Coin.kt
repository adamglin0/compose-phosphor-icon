package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.79f, 67.42f)
                curveTo(185.9f, 57.48f, 158.27f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveTo(70.1f, 57.48f, 50.21f, 67.42f)
                curveTo(31.0f, 77.0f, 20.0f, 90.35f, 20.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.65f, 11.0f, 27.0f, 30.21f, 36.58f)
                curveTo(70.1f, 198.52f, 97.73f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(57.9f, -5.48f, 77.79f, -15.42f)
                curveTo(225.0f, 179.0f, 236.0f, 165.65f, 236.0f, 152.0f)
                lineTo(236.0f, 104.0f)
                curveTo(236.0f, 90.35f, 225.0f, 77.0f, 205.79f, 67.42f)
                close()
                moveTo(128.0f, 60.0f)
                curveToRelative(61.77f, 0.0f, 100.0f, 22.84f, 100.0f, 44.0f)
                reflectiveCurveToRelative(-38.23f, 44.0f, -100.0f, 44.0f)
                reflectiveCurveTo(28.0f, 125.16f, 28.0f, 104.0f)
                reflectiveCurveTo(66.23f, 60.0f, 128.0f, 60.0f)
                close()
                moveTo(124.0f, 156.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(-22.0f, -0.35f, -40.94f, -3.65f, -56.0f, -8.71f)
                lineTo(68.0f, 147.65f)
                curveTo(84.23f, 152.75f, 103.44f, 155.62f, 124.0f, 156.0f)
                close()
                moveTo(132.0f, 156.0f)
                curveToRelative(20.56f, -0.33f, 39.77f, -3.2f, 56.0f, -8.3f)
                verticalLineToRelative(39.59f)
                curveToRelative(-15.06f, 5.06f, -33.95f, 8.36f, -56.0f, 8.71f)
                close()
                moveTo(28.0f, 152.0f)
                lineTo(28.0f, 123.92f)
                curveToRelative(5.15f, 6.19f, 12.67f, 11.89f, 22.21f, 16.66f)
                curveToRelative(3.08f, 1.54f, 6.36f, 2.95f, 9.79f, 4.28f)
                verticalLineToRelative(39.38f)
                curveTo(39.49f, 175.67f, 28.0f, 163.59f, 28.0f, 152.0f)
                close()
                moveTo(228.0f, 152.0f)
                curveToRelative(0.0f, 11.59f, -11.49f, 23.67f, -32.0f, 32.24f)
                lineTo(196.0f, 144.86f)
                curveToRelative(3.43f, -1.33f, 6.71f, -2.74f, 9.79f, -4.28f)
                curveToRelative(9.54f, -4.77f, 17.06f, -10.47f, 22.21f, -16.66f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null

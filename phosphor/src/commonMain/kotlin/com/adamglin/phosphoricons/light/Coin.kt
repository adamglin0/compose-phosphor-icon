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

public val LightGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.68f, 65.63f)
                curveTo(186.23f, 55.41f, 159.0f, 50.0f, 128.0f, 50.0f)
                reflectiveCurveTo(69.77f, 55.41f, 49.32f, 65.63f)
                curveTo(29.41f, 75.58f, 18.0f, 89.57f, 18.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 14.43f, 11.41f, 28.42f, 31.32f, 38.37f)
                curveTo(69.77f, 200.59f, 97.0f, 206.0f, 128.0f, 206.0f)
                reflectiveCurveToRelative(58.23f, -5.41f, 78.68f, -15.63f)
                curveTo(226.59f, 180.42f, 238.0f, 166.43f, 238.0f, 152.0f)
                lineTo(238.0f, 104.0f)
                curveTo(238.0f, 89.57f, 226.59f, 75.58f, 206.68f, 65.63f)
                close()
                moveTo(54.68f, 76.37f)
                curveTo(73.21f, 67.1f, 99.25f, 62.0f, 128.0f, 62.0f)
                reflectiveCurveToRelative(54.79f, 5.1f, 73.32f, 14.37f)
                curveTo(217.0f, 84.21f, 226.0f, 94.28f, 226.0f, 104.0f)
                reflectiveCurveToRelative(-9.0f, 19.79f, -24.68f, 27.63f)
                curveTo(182.79f, 140.9f, 156.75f, 146.0f, 128.0f, 146.0f)
                reflectiveCurveToRelative(-54.79f, -5.1f, -73.32f, -14.37f)
                curveTo(39.0f, 123.79f, 30.0f, 113.72f, 30.0f, 104.0f)
                reflectiveCurveTo(39.0f, 84.21f, 54.68f, 76.37f)
                close()
                moveTo(122.0f, 157.93f)
                verticalLineToRelative(36.0f)
                curveToRelative(-19.24f, -0.48f, -37.07f, -3.28f, -52.0f, -8.11f)
                verticalLineToRelative(-35.4f)
                curveTo(85.27f, 154.93f, 102.85f, 157.49f, 122.0f, 157.93f)
                close()
                moveTo(134.0f, 157.93f)
                curveToRelative(19.15f, -0.44f, 36.73f, -3.0f, 52.0f, -7.52f)
                verticalLineToRelative(35.4f)
                curveToRelative(-14.93f, 4.83f, -32.76f, 7.63f, -52.0f, 8.11f)
                close()
                moveTo(30.0f, 152.0f)
                lineTo(30.0f, 129.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 19.32f, 13.36f)
                quadToRelative(4.16f, 2.07f, 8.68f, 3.88f)
                verticalLineToRelative(35.0f)
                curveToRelative(-1.13f, -0.52f, -2.24f, -1.0f, -3.32f, -1.58f)
                curveTo(39.0f, 171.79f, 30.0f, 161.72f, 30.0f, 152.0f)
                close()
                moveTo(201.32f, 179.63f)
                curveToRelative(-1.08f, 0.54f, -2.19f, 1.06f, -3.32f, 1.58f)
                verticalLineToRelative(-35.0f)
                quadToRelative(4.51f, -1.81f, 8.68f, -3.88f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 226.0f, 129.0f)
                verticalLineToRelative(23.0f)
                curveTo(226.0f, 161.72f, 217.0f, 171.79f, 201.32f, 179.63f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null

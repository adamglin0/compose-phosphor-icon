package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) {
            return _coffeeBean!!
        }
        _coffeeBean = Builder(name = "CoffeeBean", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.58f, 41.42f)
                curveTo(196.86f, 23.71f, 171.0f, 16.63f, 141.81f, 21.5f)
                curveToRelative(-27.74f, 4.62f, -55.46f, 19.62f, -78.08f, 42.23f)
                reflectiveCurveTo(26.12f, 114.07f, 21.5f, 141.81f)
                curveToRelative(-4.87f, 29.21f, 2.21f, 55.05f, 19.92f, 72.77f)
                curveTo(55.48f, 228.64f, 74.67f, 236.0f, 96.6f, 236.0f)
                arcToRelative(107.43f, 107.43f, 0.0f, false, false, 17.59f, -1.5f)
                curveToRelative(27.74f, -4.62f, 55.46f, -19.62f, 78.08f, -42.23f)
                reflectiveCurveToRelative(37.61f, -50.34f, 42.23f, -78.08f)
                curveTo(239.37f, 85.0f, 232.29f, 59.14f, 214.58f, 41.42f)
                close()
                moveTo(45.17f, 145.75f)
                curveToRelative(3.8f, -22.84f, 16.42f, -45.94f, 35.53f, -65.0f)
                reflectiveCurveTo(122.91f, 49.0f, 145.75f, 45.17f)
                arcTo(82.0f, 82.0f, 0.0f, false, true, 159.27f, 44.0f)
                arcToRelative(62.77f, 62.77f, 0.0f, false, true, 18.24f, 2.57f)
                arcTo(110.12f, 110.12f, 0.0f, false, false, 154.62f, 60.4f)
                curveToRelative(-20.0f, 15.77f, -32.88f, 37.72f, -38.38f, 65.25f)
                curveToRelative(-8.95f, 44.73f, -40.3f, 61.1f, -62.07f, 67.09f)
                curveTo(45.25f, 180.83f, 42.06f, 164.41f, 45.17f, 145.75f)
                close()
                moveTo(210.83f, 110.25f)
                curveToRelative(-3.8f, 22.84f, -16.42f, 45.94f, -35.53f, 65.05f)
                reflectiveCurveTo(133.09f, 207.0f, 110.25f, 210.83f)
                curveToRelative(-11.65f, 1.94f, -22.4f, 1.41f, -31.75f, -1.42f)
                arcToRelative(109.42f, 109.42f, 0.0f, false, false, 22.87f, -13.81f)
                curveToRelative(20.0f, -15.77f, 32.89f, -37.72f, 38.39f, -65.25f)
                curveToRelative(9.0f, -44.73f, 40.3f, -61.1f, 62.07f, -67.09f)
                curveTo(210.75f, 75.17f, 213.94f, 91.59f, 210.83f, 110.25f)
                close()
            }
        }
        .build()
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null

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

public val LightGroup.`Lasso-light`: ImageVector
    get() {
        if (`_lasso-light` != null) {
            return `_lasso-light`!!
        }
        `_lasso-light` = Builder(name = "Lasso-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.68f, 61.63f)
                curveTo(184.11f, 49.0f, 156.88f, 42.0f, 128.0f, 42.0f)
                reflectiveCurveTo(71.89f, 49.0f, 51.32f, 61.63f)
                curveTo(29.83f, 74.85f, 18.0f, 92.73f, 18.0f, 112.0f)
                reflectiveCurveToRelative(11.83f, 37.13f, 33.32f, 50.35f)
                curveTo(70.45f, 174.1f, 95.35f, 181.0f, 122.0f, 181.85f)
                curveToRelative(0.0f, 0.64f, 0.0f, 1.28f, 0.0f, 1.94f)
                curveToRelative(0.0f, 14.76f, -6.94f, 27.1f, -19.54f, 34.73f)
                curveToRelative(-15.22f, 9.22f, -36.0f, 9.9f, -51.68f, 1.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.56f, 10.63f)
                arcTo(64.45f, 64.45f, 0.0f, false, false, 75.0f, 238.0f)
                arcToRelative(65.24f, 65.24f, 0.0f, false, false, 33.7f, -9.22f)
                curveToRelative(16.34f, -9.89f, 25.33f, -25.87f, 25.33f, -45.0f)
                curveToRelative(0.0f, -0.65f, 0.0f, -1.29f, 0.0f, -1.94f)
                curveToRelative(26.65f, -0.89f, 51.57f, -7.74f, 70.72f, -19.52f)
                curveTo(226.17f, 149.11f, 238.0f, 131.23f, 238.0f, 112.0f)
                reflectiveCurveTo(226.17f, 74.85f, 204.68f, 61.63f)
                close()
                moveTo(64.68f, 156.09f)
                curveToRelative(5.32f, -12.0f, 17.2f, -15.07f, 26.48f, -13.87f)
                curveToRelative(12.28f, 1.6f, 24.64f, 10.67f, 29.08f, 27.55f)
                curveTo(99.73f, 168.81f, 80.48f, 164.08f, 64.72f, 156.09f)
                close()
                moveTo(198.35f, 152.09f)
                curveToRelative(-17.62f, 10.85f, -40.83f, 17.1f, -65.77f, 17.79f)
                arcToRelative(52.77f, 52.77f, 0.0f, false, false, -11.31f, -23.84f)
                arcToRelative(45.24f, 45.24f, 0.0f, false, false, -28.56f, -15.73f)
                curveToRelative(-16.89f, -2.2f, -31.49f, 5.54f, -38.41f, 19.68f)
                curveTo(38.61f, 139.37f, 30.0f, 126.0f, 30.0f, 112.0f)
                curveToRelative(0.0f, -14.93f, 9.8f, -29.18f, 27.61f, -40.13f)
                curveTo(76.32f, 60.34f, 101.32f, 54.0f, 128.0f, 54.0f)
                reflectiveCurveToRelative(51.68f, 6.34f, 70.39f, 17.85f)
                curveTo(216.2f, 82.8f, 226.0f, 97.05f, 226.0f, 112.0f)
                reflectiveCurveTo(216.2f, 141.16f, 198.39f, 152.11f)
                close()
            }
        }
        .build()
        return `_lasso-light`!!
    }

private var `_lasso-light`: ImageVector? = null

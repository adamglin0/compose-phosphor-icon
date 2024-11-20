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

public val FillGroup.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) {
            return _threadsLogo!!
        }
        _threadsLogo = Builder(name = "ThreadsLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.62f, 128.0f)
                arcToRelative(53.54f, 53.54f, 0.0f, false, true, 13.1f, 1.63f)
                curveToRelative(-0.57f, 8.21f, -3.34f, 15.0f, -8.11f, 19.61f)
                arcTo(23.89f, 23.89f, 0.0f, false, true, 127.0f, 156.0f)
                curveToRelative(-11.87f, 0.0f, -15.0f, -7.58f, -15.0f, -12.07f)
                curveTo(112.0f, 133.0f, 125.8f, 128.0f, 138.62f, 128.0f)
                close()
                moveTo(224.0f, 128.0f)
                curveToRelative(0.0f, 65.12f, -35.89f, 104.0f, -96.0f, 104.0f)
                reflectiveCurveTo(32.0f, 193.12f, 32.0f, 128.0f)
                reflectiveCurveTo(67.89f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveTo(224.0f, 62.88f, 224.0f, 128.0f)
                close()
                moveTo(72.0f, 128.0f)
                curveToRelative(0.0f, -43.07f, 18.32f, -64.0f, 56.0f, -64.0f)
                curveToRelative(26.34f, 0.0f, 43.0f, 10.08f, 50.81f, 30.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, -5.66f)
                curveTo(180.9f, 55.14f, 150.9f, 48.0f, 128.0f, 48.0f)
                curveToRelative(-26.1f, 0.0f, -45.52f, 8.7f, -57.72f, 25.86f)
                curveTo(60.8f, 87.19f, 56.0f, 105.4f, 56.0f, 128.0f)
                reflectiveCurveToRelative(4.8f, 40.81f, 14.28f, 54.14f)
                curveTo(82.48f, 199.3f, 101.9f, 208.0f, 128.0f, 208.0f)
                curveToRelative(24.45f, 0.0f, 39.82f, -8.8f, 48.41f, -16.18f)
                curveToRelative(10.76f, -9.25f, 17.19f, -21.89f, 17.19f, -33.82f)
                curveToRelative(0.0f, -14.3f, -6.59f, -26.79f, -18.56f, -35.17f)
                arcToRelative(54.16f, 54.16f, 0.0f, false, false, -7.77f, -4.5f)
                curveToRelative(-2.09f, -14.65f, -10.0f, -25.75f, -22.34f, -31.07f)
                curveTo(130.43f, 81.0f, 112.0f, 83.93f, 101.21f, 94.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, 11.62f)
                curveToRelative(5.43f, -5.14f, 16.79f, -8.0f, 26.4f, -3.85f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, true, 10.77f, 10.92f)
                arcToRelative(68.89f, 68.89f, 0.0f, false, false, -10.76f, -0.85f)
                curveTo(113.53f, 112.0f, 96.0f, 125.15f, 96.0f, 143.93f)
                curveToRelative(0.0f, 16.27f, 13.0f, 28.07f, 31.0f, 28.07f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 27.75f, -11.29f)
                curveToRelative(4.7f, -4.59f, 10.11f, -12.2f, 12.17f, -24.0f)
                arcTo(25.55f, 25.55f, 0.0f, false, true, 177.6f, 158.0f)
                curveToRelative(0.0f, 13.71f, -15.76f, 34.0f, -49.6f, 34.0f)
                curveTo(90.32f, 192.0f, 72.0f, 171.07f, 72.0f, 128.0f)
                close()
            }
        }
        .build()
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null

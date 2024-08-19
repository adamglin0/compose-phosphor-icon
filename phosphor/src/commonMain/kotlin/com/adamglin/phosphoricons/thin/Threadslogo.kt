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

public val ThinGroup.Threadslogo: ImageVector
    get() {
        if (_threadslogo != null) {
            return _threadslogo!!
        }
        _threadslogo = Builder(name = "Threadslogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 126.84f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, false, -12.42f, -7.16f)
                curveToRelative(-3.0f, -29.38f, -22.0f, -38.4f, -30.56f, -41.0f)
                curveToRelative(-18.16f, -5.5f, -39.0f, 1.0f, -48.36f, 15.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.66f, 4.44f)
                curveToRelative(7.4f, -11.1f, 24.7f, -16.32f, 39.38f, -11.87f)
                curveToRelative(8.12f, 2.45f, 20.95f, 9.6f, 24.41f, 30.32f)
                arcToRelative(75.83f, 75.83f, 0.0f, false, false, -20.71f, -2.88f)
                curveToRelative(-13.14f, 0.0f, -25.37f, 3.34f, -34.44f, 9.43f)
                curveToRelative(-10.45f, 7.0f, -16.0f, 17.0f, -16.0f, 28.78f)
                curveToRelative(0.0f, 20.7f, 17.0f, 31.52f, 33.71f, 31.52f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 31.47f, -13.58f)
                curveToRelative(9.56f, -9.94f, 14.68f, -24.19f, 14.82f, -41.23f)
                arcToRelative(50.18f, 50.18f, 0.0f, false, true, 7.19f, 4.51f)
                curveToRelative(11.0f, 8.32f, 16.81f, 20.34f, 16.81f, 34.78f)
                curveToRelative(0.0f, 11.73f, -6.25f, 24.46f, -16.7f, 34.05f)
                curveTo(170.36f, 210.24f, 154.21f, 220.0f, 128.0f, 220.0f)
                curveToRelative(-50.43f, 0.0f, -76.0f, -30.95f, -76.0f, -92.0f)
                reflectiveCurveToRelative(25.57f, -92.0f, 76.0f, -92.0f)
                curveToRelative(34.29f, 0.0f, 57.26f, 14.5f, 68.27f, 43.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.46f, -2.87f)
                curveTo(191.42f, 44.22f, 165.94f, 28.0f, 128.0f, 28.0f)
                curveTo(73.05f, 28.0f, 44.0f, 62.58f, 44.0f, 128.0f)
                reflectiveCurveToRelative(29.05f, 100.0f, 84.0f, 100.0f)
                curveToRelative(28.79f, 0.0f, 46.72f, -10.9f, 56.7f, -20.05f)
                curveToRelative(12.09f, -11.08f, 19.3f, -26.0f, 19.3f, -39.95f)
                curveTo(204.0f, 151.0f, 197.09f, 136.73f, 184.0f, 126.84f)
                close()
                moveTo(151.4f, 164.39f)
                arcToRelative(35.92f, 35.92f, 0.0f, false, true, -25.7f, 11.13f)
                curveToRelative(-12.38f, 0.0f, -25.71f, -7.36f, -25.71f, -23.52f)
                curveToRelative(0.0f, -20.76f, 22.0f, -30.21f, 42.41f, -30.21f)
                arcTo(67.08f, 67.08f, 0.0f, false, true, 164.0f, 125.3f)
                curveToRelative(0.0f, 0.88f, 0.05f, 1.78f, 0.05f, 2.7f)
                curveTo(164.0f, 143.25f, 159.65f, 155.83f, 151.41f, 164.39f)
                close()
            }
        }
        .build()
        return _threadslogo!!
    }

private var _threadslogo: ImageVector? = null

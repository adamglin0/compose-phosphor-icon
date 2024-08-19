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

public val LightGroup.Island: ImageVector
    get() {
        if (_island != null) {
            return _island!!
        }
        _island = Builder(name = "Island", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.69f, 227.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.44f, 0.94f)
                curveTo(227.87f, 228.38f, 189.0f, 198.0f, 128.0f, 198.0f)
                curveToRelative(-61.19f, 0.0f, -99.87f, 30.38f, -100.25f, 30.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.5f, -9.38f)
                curveToRelative(1.63f, -1.3f, 39.0f, -30.65f, 99.59f, -33.14f)
                arcTo(118.31f, 118.31f, 0.0f, false, true, 116.0f, 146.53f)
                curveToRelative(1.76f, -22.07f, 11.39f, -51.75f, 45.8f, -73.43f)
                arcTo(70.48f, 70.48f, 0.0f, false, false, 140.19f, 70.0f)
                curveToRelative(-19.74f, 0.64f, -32.65f, 12.56f, -38.37f, 35.43f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 110.0f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, true, -1.46f, -0.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.36f, -7.28f)
                curveToRelative(8.95f, -35.74f, 31.92f, -43.93f, 49.63f, -44.5f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, true, 25.64f, 3.61f)
                curveTo(161.55f, 54.0f, 155.0f, 44.69f, 145.0f, 40.41f)
                curveToRelative(-10.55f, -4.51f, -23.36f, -2.62f, -38.09f, 5.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.84f, -10.47f)
                curveToRelative(18.17f, -10.14f, 34.56f, -12.2f, 48.71f, -6.12f)
                curveToRelative(13.42f, 5.76f, 21.77f, 17.64f, 26.57f, 27.16f)
                curveToRelative(4.65f, -8.13f, 12.14f, -17.51f, 23.1f, -21.08f)
                curveToRelative(11.2f, -3.65f, 23.37f, -0.6f, 36.16f, 9.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.24f, 9.57f)
                curveToRelative(-9.46f, -7.15f, -17.93f, -9.59f, -25.17f, -7.24f)
                curveToRelative(-9.3f, 3.0f, -15.45f, 13.07f, -18.7f, 20.0f)
                arcTo(68.92f, 68.92f, 0.0f, false, true, 207.0f, 74.8f)
                curveToRelative(14.15f, 8.09f, 31.0f, 25.27f, 31.0f, 61.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                curveToRelative(0.0f, -37.92f, -21.2f, -51.0f, -36.0f, -55.59f)
                arcToRelative(54.08f, 54.08f, 0.0f, false, true, 7.38f, 36.49f)
                arcToRelative(57.2f, 57.2f, 0.0f, false, true, -8.51f, 22.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.82f, -6.91f)
                curveToRelative(0.78f, -1.12f, 17.81f, -26.37f, -4.39f, -53.06f)
                curveTo(146.19f, 95.0f, 130.5f, 117.69f, 128.0f, 147.05f)
                arcToRelative(106.68f, 106.68f, 0.0f, false, false, 4.3f, 39.0f)
                curveToRelative(62.82f, 1.35f, 101.77f, 31.92f, 103.43f, 33.25f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 236.69f, 227.75f)
                close()
                moveTo(26.0f, 140.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 26.0f, 140.0f)
                close()
                moveTo(38.0f, 140.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 38.0f, 140.0f)
                close()
            }
        }
        .build()
        return _island!!
    }

private var _island: ImageVector? = null

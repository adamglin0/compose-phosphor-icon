package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Sealcheck: ImageVector
    get() {
        if (_sealcheck != null) {
            return _sealcheck!!
        }
        _sealcheck = Builder(name = "Sealcheck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                curveToRelative(0.0f, 12.51f, -17.82f, 21.95f, -22.68f, 33.69f)
                curveToRelative(-4.68f, 11.32f, 1.42f, 30.65f, -7.78f, 39.85f)
                reflectiveCurveToRelative(-28.53f, 3.1f, -39.85f, 7.78f)
                curveTo(150.0f, 214.18f, 140.5f, 232.0f, 128.0f, 232.0f)
                reflectiveCurveToRelative(-22.0f, -17.82f, -33.69f, -22.68f)
                curveToRelative(-11.32f, -4.68f, -30.65f, 1.42f, -39.85f, -7.78f)
                reflectiveCurveToRelative(-3.1f, -28.53f, -7.78f, -39.85f)
                curveTo(41.82f, 150.0f, 24.0f, 140.5f, 24.0f, 128.0f)
                reflectiveCurveToRelative(17.82f, -22.0f, 22.68f, -33.69f)
                curveTo(51.36f, 83.0f, 45.26f, 63.66f, 54.46f, 54.46f)
                reflectiveCurveTo(83.0f, 51.36f, 94.31f, 46.68f)
                curveTo(106.05f, 41.82f, 115.5f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveTo(150.0f, 41.82f, 161.69f, 46.68f)
                curveToRelative(11.32f, 4.68f, 30.65f, -1.42f, 39.85f, 7.78f)
                reflectiveCurveToRelative(3.1f, 28.53f, 7.78f, 39.85f)
                curveTo(214.18f, 106.05f, 232.0f, 115.5f, 232.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.86f, 102.82f)
                curveToRelative(-3.77f, -3.94f, -7.67f, -8.0f, -9.14f, -11.57f)
                curveToRelative(-1.36f, -3.27f, -1.44f, -8.69f, -1.52f, -13.94f)
                curveToRelative(-0.15f, -9.76f, -0.31f, -20.82f, -8.0f, -28.51f)
                reflectiveCurveToRelative(-18.75f, -7.85f, -28.51f, -8.0f)
                curveToRelative(-5.25f, -0.08f, -10.67f, -0.16f, -13.94f, -1.52f)
                curveToRelative(-3.56f, -1.47f, -7.63f, -5.37f, -11.57f, -9.14f)
                curveTo(146.28f, 23.51f, 138.44f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveToRelative(-18.27f, 7.51f, -25.18f, 14.14f)
                curveToRelative(-3.94f, 3.77f, -8.0f, 7.67f, -11.57f, 9.14f)
                curveTo(88.0f, 40.64f, 82.56f, 40.72f, 77.31f, 40.8f)
                curveToRelative(-9.76f, 0.15f, -20.82f, 0.31f, -28.51f, 8.0f)
                reflectiveCurveTo(41.0f, 67.55f, 40.8f, 77.31f)
                curveToRelative(-0.08f, 5.25f, -0.16f, 10.67f, -1.52f, 13.94f)
                curveToRelative(-1.47f, 3.56f, -5.37f, 7.63f, -9.14f, 11.57f)
                curveTo(23.51f, 109.72f, 16.0f, 117.56f, 16.0f, 128.0f)
                reflectiveCurveToRelative(7.51f, 18.27f, 14.14f, 25.18f)
                curveToRelative(3.77f, 3.94f, 7.67f, 8.0f, 9.14f, 11.57f)
                curveToRelative(1.36f, 3.27f, 1.44f, 8.69f, 1.52f, 13.94f)
                curveToRelative(0.15f, 9.76f, 0.31f, 20.82f, 8.0f, 28.51f)
                reflectiveCurveToRelative(18.75f, 7.85f, 28.51f, 8.0f)
                curveToRelative(5.25f, 0.08f, 10.67f, 0.16f, 13.94f, 1.52f)
                curveToRelative(3.56f, 1.47f, 7.63f, 5.37f, 11.57f, 9.14f)
                curveTo(109.72f, 232.49f, 117.56f, 240.0f, 128.0f, 240.0f)
                reflectiveCurveToRelative(18.27f, -7.51f, 25.18f, -14.14f)
                curveToRelative(3.94f, -3.77f, 8.0f, -7.67f, 11.57f, -9.14f)
                curveToRelative(3.27f, -1.36f, 8.69f, -1.44f, 13.94f, -1.52f)
                curveToRelative(9.76f, -0.15f, 20.82f, -0.31f, 28.51f, -8.0f)
                reflectiveCurveToRelative(7.85f, -18.75f, 8.0f, -28.51f)
                curveToRelative(0.08f, -5.25f, 0.16f, -10.67f, 1.52f, -13.94f)
                curveToRelative(1.47f, -3.56f, 5.37f, -7.63f, 9.14f, -11.57f)
                curveTo(232.49f, 146.28f, 240.0f, 138.44f, 240.0f, 128.0f)
                reflectiveCurveTo(232.49f, 109.73f, 225.86f, 102.82f)
                close()
                moveTo(214.31f, 142.11f)
                curveToRelative(-4.79f, 5.0f, -9.75f, 10.17f, -12.38f, 16.52f)
                curveToRelative(-2.52f, 6.1f, -2.63f, 13.07f, -2.73f, 19.82f)
                curveToRelative(-0.1f, 7.0f, -0.21f, 14.33f, -3.32f, 17.43f)
                reflectiveCurveToRelative(-10.39f, 3.22f, -17.43f, 3.32f)
                curveToRelative(-6.75f, 0.1f, -13.72f, 0.21f, -19.82f, 2.73f)
                curveToRelative(-6.35f, 2.63f, -11.52f, 7.59f, -16.52f, 12.38f)
                reflectiveCurveTo(132.0f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(-9.15f, -4.92f, -14.11f, -9.69f)
                reflectiveCurveToRelative(-10.17f, -9.75f, -16.52f, -12.38f)
                curveToRelative(-6.1f, -2.52f, -13.07f, -2.63f, -19.82f, -2.73f)
                curveToRelative(-7.0f, -0.1f, -14.33f, -0.21f, -17.43f, -3.32f)
                reflectiveCurveToRelative(-3.22f, -10.39f, -3.32f, -17.43f)
                curveToRelative(-0.1f, -6.75f, -0.21f, -13.72f, -2.73f, -19.82f)
                curveToRelative(-2.63f, -6.35f, -7.59f, -11.52f, -12.38f, -16.52f)
                reflectiveCurveTo(32.0f, 132.0f, 32.0f, 128.0f)
                reflectiveCurveToRelative(4.92f, -9.15f, 9.69f, -14.11f)
                reflectiveCurveToRelative(9.75f, -10.17f, 12.38f, -16.52f)
                curveToRelative(2.52f, -6.1f, 2.63f, -13.07f, 2.73f, -19.82f)
                curveToRelative(0.1f, -7.0f, 0.21f, -14.33f, 3.32f, -17.43f)
                reflectiveCurveTo(70.51f, 56.9f, 77.55f, 56.8f)
                curveToRelative(6.75f, -0.1f, 13.72f, -0.21f, 19.82f, -2.73f)
                curveToRelative(6.35f, -2.63f, 11.52f, -7.59f, 16.52f, -12.38f)
                reflectiveCurveTo(124.0f, 32.0f, 128.0f, 32.0f)
                reflectiveCurveToRelative(9.15f, 4.92f, 14.11f, 9.69f)
                reflectiveCurveToRelative(10.17f, 9.75f, 16.52f, 12.38f)
                curveToRelative(6.1f, 2.52f, 13.07f, 2.63f, 19.82f, 2.73f)
                curveToRelative(7.0f, 0.1f, 14.33f, 0.21f, 17.43f, 3.32f)
                reflectiveCurveToRelative(3.22f, 10.39f, 3.32f, 17.43f)
                curveToRelative(0.1f, 6.75f, 0.21f, 13.72f, 2.73f, 19.82f)
                curveToRelative(2.63f, 6.35f, 7.59f, 11.52f, 12.38f, 16.52f)
                reflectiveCurveTo(224.0f, 124.0f, 224.0f, 128.0f)
                reflectiveCurveTo(219.08f, 137.15f, 214.31f, 142.11f)
                close()
                moveTo(173.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(112.0f, 148.69f)
                lineToRelative(50.34f, -50.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 173.66f, 98.34f)
                close()
            }
        }
        .build()
        return _sealcheck!!
    }

private var _sealcheck: ImageVector? = null

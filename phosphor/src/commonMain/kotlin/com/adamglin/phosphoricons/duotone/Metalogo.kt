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

public val DuotoneGroup.Metalogo: ImageVector
    get() {
        if (_metalogo != null) {
            return _metalogo!!
        }
        _metalogo = Builder(name = "Metalogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.49f, 114.6f)
                lineToRelative(-18.71f, 32.75f)
                curveTo(93.88f, 175.86f, 77.52f, 200.0f, 58.56f, 200.0f)
                curveTo(-3.16f, 200.0f, 27.7f, 56.0f, 74.0f, 56.0f)
                curveTo(94.25f, 56.0f, 111.56f, 83.58f, 128.49f, 114.6f)
                close()
                moveTo(182.0f, 56.0f)
                curveToRelative(-12.62f, 0.0f, -24.1f, 10.7f, -35.0f, 26.27f)
                lineTo(128.49f, 114.6f)
                curveToRelative(21.76f, 39.86f, 42.91f, 85.4f, 68.95f, 85.4f)
                curveTo(259.16f, 200.0f, 228.3f, 56.0f, 182.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 149.31f)
                curveToRelative(0.0f, 16.11f, -3.17f, 29.89f, -9.17f, 39.84f)
                curveToRelative(-7.43f, 12.33f, -19.0f, 18.85f, -33.39f, 18.85f)
                curveToRelative(-27.94f, 0.0f, -47.78f, -37.0f, -68.78f, -76.22f)
                curveTo(111.64f, 100.0f, 92.35f, 64.0f, 74.0f, 64.0f)
                curveToRelative(-9.38f, 0.0f, -19.94f, 10.0f, -28.25f, 26.67f)
                arcTo(138.18f, 138.18f, 0.0f, false, false, 32.0f, 149.31f)
                curveToRelative(0.0f, 13.2f, 2.38f, 24.12f, 6.88f, 31.58f)
                reflectiveCurveTo(49.82f, 192.0f, 58.56f, 192.0f)
                curveToRelative(15.12f, 0.0f, 30.85f, -24.54f, 44.23f, -48.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.0f, 7.8f)
                curveTo(101.46f, 178.71f, 83.07f, 208.0f, 58.56f, 208.0f)
                curveToRelative(-14.41f, 0.0f, -26.0f, -6.52f, -33.39f, -18.85f)
                curveToRelative(-6.0f, -10.0f, -9.17f, -23.73f, -9.17f, -39.84f)
                arcTo(154.81f, 154.81f, 0.0f, false, true, 31.42f, 83.54f)
                curveTo(42.82f, 60.62f, 57.94f, 48.0f, 74.0f, 48.0f)
                curveToRelative(27.94f, 0.0f, 47.77f, 37.0f, 68.78f, 76.22f)
                curveTo(159.79f, 156.0f, 179.08f, 192.0f, 197.44f, 192.0f)
                curveToRelative(8.74f, 0.0f, 15.18f, -3.63f, 19.68f, -11.11f)
                reflectiveCurveTo(224.0f, 162.51f, 224.0f, 149.31f)
                arcToRelative(138.18f, 138.18f, 0.0f, false, false, -13.74f, -58.64f)
                curveTo(202.0f, 74.0f, 191.39f, 64.0f, 182.0f, 64.0f)
                curveToRelative(-8.36f, 0.0f, -17.68f, 7.48f, -28.51f, 22.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.08f, -9.21f)
                curveToRelative(9.0f, -12.74f, 23.0f, -29.67f, 41.59f, -29.67f)
                curveToRelative(16.05f, 0.0f, 31.17f, 12.62f, 42.57f, 35.54f)
                arcTo(154.81f, 154.81f, 0.0f, false, true, 240.0f, 149.31f)
                close()
            }
        }
        .build()
        return _metalogo!!
    }

private var _metalogo: ImageVector? = null

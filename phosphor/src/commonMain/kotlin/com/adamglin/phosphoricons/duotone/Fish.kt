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

public val DuotoneGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(185.81f, 167.62f)
                curveToRelative(-18.0f, 13.9f, -44.17f, 23.41f, -81.68f, 24.31f)
                lineTo(80.09f, 248.0f)
                lineToRelative(-16.0f, -56.07f)
                lineTo(8.0f, 175.87f)
                lineToRelative(56.07f, -24.0f)
                curveToRelative(0.9f, -37.49f, 10.41f, -63.61f, 24.31f, -81.65f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 136.2f, 119.8f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 49.61f, 47.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
                moveTo(216.72f, 143.64f)
                curveToRelative(-19.37f, 34.9f, -55.44f, 53.76f, -107.24f, 56.1f)
                lineToRelative(-22.0f, 51.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.1f, 256.0f)
                lineToRelative(-0.51f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.19f, -5.78f)
                lineTo(57.6f, 198.39f)
                lineTo(5.8f, 183.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, -15.05f)
                lineToRelative(51.41f, -22.0f)
                curveToRelative(2.35f, -51.78f, 21.21f, -87.84f, 56.09f, -107.22f)
                curveToRelative(24.75f, -13.74f, 52.74f, -15.84f, 71.88f, -15.18f)
                curveToRelative(18.64f, 0.64f, 36.0f, 4.27f, 38.86f, 6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.83f, 2.83f)
                curveToRelative(1.69f, 2.85f, 5.33f, 20.21f, 6.0f, 38.85f)
                curveTo(232.55f, 90.89f, 230.46f, 118.89f, 216.72f, 143.64f)
                close()
                moveTo(161.54f, 172.64f)
                arcToRelative(52.11f, 52.11f, 0.0f, false, true, -33.4f, -44.78f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 83.37f, 94.47f)
                quadToRelative(-10.45f, 23.79f, -11.3f, 57.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.85f, 7.17f)
                lineTo(31.83f, 174.37f)
                lineToRelative(34.45f, 9.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.49f, 5.5f)
                lineToRelative(9.84f, 34.44f)
                lineToRelative(15.16f, -35.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.17f, -4.84f)
                quadTo(137.71f, 183.12f, 161.54f, 172.64f)
                close()
                moveTo(212.42f, 43.57f)
                curveToRelative(-14.15f, -3.0f, -64.1f, -11.0f, -100.3f, 14.75f)
                arcToRelative(81.21f, 81.21f, 0.0f, false, false, -16.0f, 15.07f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 39.35f, 38.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.73f, 8.73f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 38.47f, 39.34f)
                arcToRelative(80.81f, 80.81f, 0.0f, false, false, 15.0f, -16.0f)
                curveTo(223.42f, 107.73f, 215.42f, 57.74f, 212.42f, 43.57f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null

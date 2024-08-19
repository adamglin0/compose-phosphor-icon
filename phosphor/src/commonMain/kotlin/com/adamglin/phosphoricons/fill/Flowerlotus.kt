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

public val FillGroup.Flowerlotus: ImageVector
    get() {
        if (_flowerlotus != null) {
            return _flowerlotus!!
        }
        _flowerlotus = Builder(name = "Flowerlotus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.83f, 121.63f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, -9.52f, -7.33f)
                arcToRelative(73.55f, 73.55f, 0.0f, false, false, -22.17f, -2.22f)
                curveToRelative(4.0f, -19.85f, 1.0f, -35.55f, -2.0f, -44.86f)
                arcToRelative(16.17f, 16.17f, 0.0f, false, false, -18.8f, -10.88f)
                arcToRelative(85.53f, 85.53f, 0.0f, false, false, -28.55f, 12.12f)
                arcToRelative(94.58f, 94.58f, 0.0f, false, false, -27.11f, -33.25f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, false, -19.26f, 0.0f)
                arcTo(94.58f, 94.58f, 0.0f, false, false, 91.26f, 68.46f)
                arcTo(85.53f, 85.53f, 0.0f, false, false, 62.71f, 56.34f)
                arcTo(16.14f, 16.14f, 0.0f, false, false, 43.92f, 67.22f)
                curveToRelative(-3.0f, 9.31f, -6.0f, 25.0f, -2.06f, 44.86f)
                arcToRelative(73.55f, 73.55f, 0.0f, false, false, -22.17f, 2.22f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, -9.52f, 7.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.6f, 12.26f)
                curveToRelative(3.39f, 12.58f, 13.8f, 36.49f, 45.33f, 55.33f)
                reflectiveCurveTo(113.13f, 208.0f, 128.05f, 208.0f)
                reflectiveCurveToRelative(42.67f, 0.0f, 74.0f, -18.78f)
                curveToRelative(31.53f, -18.84f, 41.94f, -42.75f, 45.33f, -55.33f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 245.83f, 121.63f)
                close()
                moveTo(62.1f, 175.49f)
                curveTo(35.47f, 159.57f, 26.82f, 140.05f, 24.0f, 129.7f)
                arcToRelative(59.61f, 59.61f, 0.0f, false, true, 22.5f, -1.17f)
                arcToRelative(129.08f, 129.08f, 0.0f, false, false, 9.15f, 19.41f)
                arcToRelative(142.28f, 142.28f, 0.0f, false, false, 34.0f, 39.56f)
                arcTo(114.92f, 114.92f, 0.0f, false, true, 62.1f, 175.49f)
                close()
                moveTo(128.0f, 190.4f)
                curveToRelative(-9.33f, -6.94f, -32.0f, -28.23f, -32.0f, -71.23f)
                curveTo(96.0f, 76.7f, 118.38f, 55.24f, 128.0f, 48.0f)
                curveToRelative(9.62f, 7.26f, 32.0f, 28.72f, 32.0f, 71.19f)
                curveTo(160.0f, 162.17f, 137.33f, 183.46f, 128.0f, 190.4f)
                close()
                moveTo(232.0f, 129.72f)
                curveToRelative(-2.77f, 10.24f, -11.4f, 29.81f, -38.09f, 45.77f)
                arcToRelative(114.92f, 114.92f, 0.0f, false, true, -27.55f, 12.0f)
                arcToRelative(142.28f, 142.28f, 0.0f, false, false, 34.0f, -39.56f)
                arcToRelative(129.08f, 129.08f, 0.0f, false, false, 9.15f, -19.41f)
                arcTo(59.69f, 59.69f, 0.0f, false, true, 232.0f, 129.71f)
                close()
            }
        }
        .build()
        return _flowerlotus!!
    }

private var _flowerlotus: ImageVector? = null

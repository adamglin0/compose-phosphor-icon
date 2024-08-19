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

public val FillGroup.Grainsslash: ImageVector
    get() {
        if (_grainsslash != null) {
            return _grainsslash!!
        }
        _grainsslash = Builder(name = "Grainsslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(87.66f, 87.66f, 0.0f, false, true, -5.45f, 30.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.7f, 1.27f)
                lineTo(162.52f, 130.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, -6.16f)
                arcTo(87.36f, 87.36f, 0.0f, false, true, 200.0f, 112.37f)
                lineTo(200.0f, 72.45f)
                arcToRelative(72.33f, 72.33f, 0.0f, false, false, -50.35f, 29.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 137.72f, 103.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -0.89f, -10.75f)
                arcToRelative(88.06f, 88.06f, 0.0f, false, true, 25.0f, -23.11f)
                curveTo(152.62f, 49.8f, 135.45f, 37.74f, 128.0f, 33.2f)
                arcToRelative(99.79f, 99.79f, 0.0f, false, false, -23.4f, 19.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, 0.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -0.06f, -10.8f)
                arcToRelative(112.35f, 112.35f, 0.0f, false, true, 31.86f, -25.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 0.0f)
                curveToRelative(1.32f, 0.66f, 30.27f, 15.43f, 44.59f, 45.15f)
                arcToRelative(87.86f, 87.86f, 0.0f, false, true, 31.74f, -6.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 64.0f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-12.9f, -14.19f)
                arcTo(87.77f, 87.77f, 0.0f, false, true, 128.52f, 232.0f)
                curveTo(79.83f, 232.28f, 40.0f, 191.51f, 40.0f, 142.83f)
                lineTo(40.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.09f, -8.0f)
                curveToRelative(1.25f, 0.0f, 2.48f, 0.0f, 3.72f, 0.09f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(136.32f, 149.05f)
                lineTo(69.18f, 75.19f)
                arcTo(71.31f, 71.31f, 0.0f, false, false, 56.0f, 72.44f)
                verticalLineToRelative(39.94f)
                arcToRelative(88.17f, 88.17f, 0.0f, false, true, 72.0f, 51.0f)
                arcTo(88.22f, 88.22f, 0.0f, false, true, 136.32f, 149.05f)
                close()
            }
        }
        .build()
        return _grainsslash!!
    }

private var _grainsslash: ImageVector? = null

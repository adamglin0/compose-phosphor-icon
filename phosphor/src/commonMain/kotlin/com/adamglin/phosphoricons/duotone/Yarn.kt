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

public val DuotoneGroup.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 216.0f)
                lineTo(183.39f, 216.0f)
                arcTo(103.95f, 103.95f, 0.0f, true, false, 128.0f, 232.0f)
                lineToRelative(104.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(87.51f, 87.51f, 0.0f, false, true, 43.93f, 11.77f)
                arcToRelative(222.06f, 222.06f, 0.0f, false, false, -27.88f, 15.09f)
                arcToRelative(222.23f, 222.23f, 0.0f, false, false, -45.0f, -22.0f)
                arcTo(87.52f, 87.52f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(78.56f, 55.24f)
                arcToRelative(206.0f, 206.0f, 0.0f, false, true, 51.11f, 21.57f)
                arcTo(225.76f, 225.76f, 0.0f, false, false, 110.1f, 93.36f)
                arcTo(181.54f, 181.54f, 0.0f, false, false, 57.73f, 75.09f)
                arcTo(88.67f, 88.67f, 0.0f, false, true, 78.56f, 55.24f)
                close()
                moveTo(48.72f, 89.82f)
                arcToRelative(165.82f, 165.82f, 0.0f, false, true, 49.67f, 15.51f)
                arcTo(228.0f, 228.0f, 0.0f, false, false, 82.76f, 124.5f)
                arcTo(142.65f, 142.65f, 0.0f, false, false, 41.28f, 113.0f)
                arcTo(87.5f, 87.5f, 0.0f, false, true, 48.72f, 89.82f)
                close()
                moveTo(40.0f, 129.0f)
                arcToRelative(126.07f, 126.07f, 0.0f, false, true, 33.63f, 9.0f)
                arcToRelative(222.36f, 222.36f, 0.0f, false, false, -19.07f, 38.45f)
                arcTo(87.51f, 87.51f, 0.0f, false, true, 40.0f, 129.0f)
                close()
                moveTo(66.42f, 190.81f)
                arcTo(209.36f, 209.36f, 0.0f, false, true, 187.0f, 62.74f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, 16.22f, 19.57f)
                arcTo(183.89f, 183.89f, 0.0f, false, false, 87.0f, 205.82f)
                arcTo(88.56f, 88.56f, 0.0f, false, true, 66.43f, 190.81f)
                close()
                moveTo(125.66f, 216.0f)
                arcTo(87.66f, 87.66f, 0.0f, false, true, 101.83f, 212.0f)
                arcTo(167.84f, 167.84f, 0.0f, false, true, 210.28f, 96.79f)
                arcToRelative(87.35f, 87.35f, 0.0f, false, true, 5.38f, 23.55f)
                arcTo(144.59f, 144.59f, 0.0f, false, false, 125.66f, 216.0f)
                close()
                moveTo(215.48f, 137.56f)
                arcToRelative(88.19f, 88.19f, 0.0f, false, true, -72.67f, 77.22f)
                arcTo(128.64f, 128.64f, 0.0f, false, true, 215.48f, 137.53f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null

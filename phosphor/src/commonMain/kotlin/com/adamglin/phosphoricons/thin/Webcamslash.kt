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

public val ThinGroup.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 213.31f)
                lineTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(63.8f, 63.32f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 124.0f, 179.89f)
                lineTo(124.0f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(199.0f, 212.0f)
                lineToRelative(6.08f, 6.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(100.0f, 103.18f)
                lineToRelative(26.14f, 28.75f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 104.0f)
                curveTo(100.0f, 103.73f, 100.0f, 103.45f, 100.0f, 103.18f)
                close()
                moveTo(60.0f, 104.0f)
                arcToRelative(67.62f, 67.62f, 0.0f, false, true, 9.4f, -34.52f)
                lineTo(93.0f, 95.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 40.13f, 44.14f)
                lineToRelative(23.63f, 26.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 60.0f, 104.0f)
                close()
                moveTo(132.0f, 204.0f)
                lineTo(132.0f, 179.89f)
                arcToRelative(76.09f, 76.09f, 0.0f, false, false, 30.39f, -8.11f)
                lineTo(191.69f, 204.0f)
                close()
                moveTo(89.0f, 43.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.5f, -5.45f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 190.26f, 147.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.55f, -4.59f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 94.46f, 44.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 89.0f, 43.33f)
                close()
                moveTo(154.63f, 112.67f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -32.73f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.74f, -7.81f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 42.08f, 46.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 2.77f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.24f, -0.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 154.63f, 112.67f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null

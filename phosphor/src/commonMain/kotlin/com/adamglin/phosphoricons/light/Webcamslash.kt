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

public val LightGroup.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.44f, 212.0f)
                lineTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(61.31f, 63.56f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 122.0f, 181.75f)
                lineTo(122.0f, 202.0f)
                lineTo(32.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(198.07f, 214.0f)
                lineToRelative(5.49f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(120.77f, 129.0f)
                arcToRelative(26.05f, 26.05f, 0.0f, false, true, -18.31f, -20.15f)
                close()
                moveTo(62.0f, 104.0f)
                arcToRelative(65.6f, 65.6f, 0.0f, false, true, 7.78f, -31.12f)
                lineTo(90.85f, 96.06f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 142.0f)
                arcToRelative(37.59f, 37.59f, 0.0f, false, false, 4.38f, -0.26f)
                lineToRelative(21.06f, 23.17f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 62.0f, 104.0f)
                close()
                moveTo(134.0f, 202.0f)
                lineTo(134.0f, 181.76f)
                arcToRelative(78.27f, 78.27f, 0.0f, false, false, 27.93f, -7.51f)
                lineTo(187.16f, 202.0f)
                close()
                moveTo(87.26f, 44.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.26f, -8.18f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 191.89f, 148.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.82f, -6.89f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 95.44f, 46.57f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 87.26f, 44.32f)
                close()
                moveTo(152.73f, 112.05f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -30.4f, -33.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.6f, -11.72f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 44.41f, 48.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.41f, -3.71f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null

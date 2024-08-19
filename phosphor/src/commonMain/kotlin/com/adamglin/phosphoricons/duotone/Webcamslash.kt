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

public val DuotoneGroup.Webcamslash: ImageVector
    get() {
        if (_webcamslash != null) {
            return _webcamslash!!
        }
        _webcamslash = Builder(name = "Webcamslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 72.0f, 72.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(58.82f, 63.8f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 120.0f, 183.6f)
                lineTo(120.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(197.19f, 216.0f)
                lineToRelative(4.89f, 5.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(64.0f, 104.0f)
                arcToRelative(63.65f, 63.65f, 0.0f, false, true, 6.26f, -27.62f)
                lineTo(88.68f, 96.64f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 144.0f)
                curveToRelative(1.2f, 0.0f, 2.39f, -0.06f, 3.58f, -0.17f)
                lineTo(150.0f, 164.11f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 64.0f, 104.0f)
                close()
                moveTo(136.0f, 200.0f)
                lineTo(136.0f, 183.59f)
                arcToRelative(79.91f, 79.91f, 0.0f, false, false, 25.44f, -6.91f)
                lineTo(182.64f, 200.0f)
                close()
                moveTo(85.52f, 45.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.0f, -10.91f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 105.0f, 115.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.1f, -9.19f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -84.0f, -92.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.52f, 45.31f)
                close()
                moveTo(150.83f, 111.43f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 128.0f, 80.0f)
                arcToRelative(24.17f, 24.17f, 0.0f, false, false, -5.24f, 0.57f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 119.3f, 65.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 166.0f, 116.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.21f, -4.95f)
                close()
            }
        }
        .build()
        return _webcamslash!!
    }

private var _webcamslash: ImageVector? = null

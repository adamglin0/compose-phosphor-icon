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

public val DuotoneGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                horizontalLineTo(72.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 85.92f, 97.74f)
                lineToRelative(0.0f, 0.1f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 240.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(81.32f, 88.55f)
                lineToRelative(-0.06f, 0.12f)
                arcTo(65.0f, 65.0f, 0.0f, false, false, 72.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(87.34f, 87.34f, 0.0f, false, false, 31.8f, -5.93f)
                lineToRelative(10.28f, 11.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.3f, 0.12f)
                arcTo(88.4f, 88.4f, 0.0f, false, false, 72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(72.25f, 72.25f, 0.0f, false, true, 5.06f, -26.54f)
                lineToRelative(87.0f, 95.7f)
                arcTo(71.66f, 71.66f, 0.0f, false, true, 160.0f, 200.0f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(87.89f, 87.89f, 0.0f, false, true, -22.35f, 58.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.71f, 176.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 117.37f, 70.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.48f, -12.89f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null

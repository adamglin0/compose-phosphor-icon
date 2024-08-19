package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Sketchlogo: ImageVector
    get() {
        if (_sketchlogo != null) {
            return _sketchlogo!!
        }
        _sketchlogo = Builder(name = "Sketchlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.0f, 96.1f)
                lineToRelative(-56.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.0f, -4.1f)
                lineTo(72.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.0f, 4.1f)
                lineTo(7.0f, 96.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.26f, 16.09f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.54f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 249.0f, 96.1f)
                close()
                moveTo(213.55f, 92.0f)
                lineTo(182.0f, 92.0f)
                lineTo(152.0f, 52.0f)
                horizontalLineToRelative(26.55f)
                close()
                moveTo(71.88f, 116.0f)
                lineToRelative(21.19f, 53.0f)
                lineTo(43.61f, 116.0f)
                close()
                moveTo(158.28f, 116.0f)
                lineTo(128.0f, 191.69f)
                lineTo(97.72f, 116.0f)
                close()
                moveTo(104.0f, 92.0f)
                lineToRelative(24.0f, -32.0f)
                lineToRelative(24.0f, 32.0f)
                close()
                moveTo(184.12f, 116.0f)
                horizontalLineToRelative(28.27f)
                lineToRelative(-49.46f, 53.0f)
                close()
                moveTo(77.45f, 52.0f)
                lineTo(104.0f, 52.0f)
                lineTo(74.0f, 92.0f)
                lineTo(42.45f, 92.0f)
                close()
            }
        }
        .build()
        return _sketchlogo!!
    }

private var _sketchlogo: ImageVector? = null

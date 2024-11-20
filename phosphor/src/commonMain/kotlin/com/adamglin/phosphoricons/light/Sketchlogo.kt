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

public val LightGroup.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) {
            return _sketchLogo!!
        }
        _sketchLogo = Builder(name = "SketchLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.52f, 100.05f)
                lineToRelative(-56.0f, -64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 34.0f)
                lineTo(72.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.52f, 2.0f)
                lineToRelative(-56.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.13f, 8.0f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.78f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 244.52f, 100.05f)
                close()
                moveTo(75.94f, 110.0f)
                lineToRelative(34.6f, 86.49f)
                lineTo(29.81f, 110.0f)
                close()
                moveTo(167.14f, 110.0f)
                lineTo(128.0f, 207.84f)
                lineTo(88.86f, 110.0f)
                close()
                moveTo(92.0f, 98.0f)
                lineToRelative(36.0f, -48.0f)
                lineToRelative(36.0f, 48.0f)
                close()
                moveTo(180.06f, 110.0f)
                horizontalLineToRelative(46.13f)
                lineToRelative(-80.73f, 86.49f)
                close()
                moveTo(226.78f, 98.0f)
                lineTo(179.0f, 98.0f)
                lineTo(140.0f, 46.0f)
                horizontalLineToRelative(41.28f)
                close()
                moveTo(74.72f, 46.0f)
                lineTo(116.0f, 46.0f)
                lineTo(77.0f, 98.0f)
                lineTo(29.22f, 98.0f)
                close()
            }
        }
        .build()
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null

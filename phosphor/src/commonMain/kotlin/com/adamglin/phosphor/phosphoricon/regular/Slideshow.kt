package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Slideshow: ImageVector
    get() {
        if (_slideshow != null) {
            return _slideshow!!
        }
        _slideshow = Builder(name = "Slideshow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 48.0f)
                lineTo(64.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 64.0f)
                lineTo(48.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 48.0f)
                close()
                moveTo(192.0f, 192.0f)
                lineTo(64.0f, 192.0f)
                lineTo(64.0f, 64.0f)
                lineTo(192.0f, 64.0f)
                lineTo(192.0f, 192.0f)
                close()
                moveTo(240.0f, 56.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(224.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(32.0f, 56.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(16.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null

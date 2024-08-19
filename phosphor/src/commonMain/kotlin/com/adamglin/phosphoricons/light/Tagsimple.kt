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

public val LightGroup.Tagsimple: ImageVector
    get() {
        if (_tagsimple != null) {
            return _tagsimple!!
        }
        _tagsimple = Builder(name = "Tagsimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.0f, 124.67f)
                lineTo(199.37f, 56.23f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 187.72f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(187.72f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.65f, -6.23f)
                lineTo(245.0f, 131.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 245.0f, 124.67f)
                close()
                moveTo(189.39f, 193.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.66f, 0.89f)
                lineTo(40.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(187.72f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.66f, 0.89f)
                lineTo(232.79f, 128.0f)
                close()
            }
        }
        .build()
        return _tagsimple!!
    }

private var _tagsimple: ImageVector? = null

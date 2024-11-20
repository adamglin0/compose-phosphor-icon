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

public val LightGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(128.0f, 135.86f)
                lineTo(47.42f, 62.0f)
                lineTo(208.58f, 62.0f)
                close()
                moveTo(101.67f, 128.0f)
                lineTo(38.0f, 186.36f)
                lineTo(38.0f, 69.64f)
                close()
                moveTo(110.55f, 136.14f)
                lineTo(124.0f, 148.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.1f, 0.0f)
                lineToRelative(13.4f, -12.28f)
                lineTo(208.58f, 194.0f)
                lineTo(47.43f, 194.0f)
                close()
                moveTo(154.33f, 128.0f)
                lineTo(218.0f, 69.64f)
                lineTo(218.0f, 186.36f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null

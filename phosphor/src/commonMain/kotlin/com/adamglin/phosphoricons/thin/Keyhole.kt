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

public val ThinGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -57.0f, 29.22f)
                lineTo(92.34f, 174.39f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 180.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -5.61f)
                lineTo(149.0f, 141.22f)
                arcTo(36.15f, 36.15f, 0.0f, false, false, 164.0f, 112.0f)
                close()
                moveTo(140.34f, 141.33f)
                lineTo(153.86f, 172.0f)
                lineTo(102.14f, 172.0f)
                lineToRelative(13.52f, -30.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.66f, -5.07f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 140.34f, 141.33f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null

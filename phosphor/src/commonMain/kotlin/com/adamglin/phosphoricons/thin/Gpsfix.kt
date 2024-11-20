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

public val ThinGroup.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) {
            return _gpsFix!!
        }
        _gpsFix = Builder(name = "GpsFix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                lineTo(211.9f, 124.0f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 132.0f, 44.1f)
                lineTo(132.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 44.1f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 44.1f, 124.0f)
                lineTo(16.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(44.1f, 132.0f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 124.0f, 211.9f)
                lineTo(124.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 211.9f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 211.9f, 132.0f)
                lineTo(240.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 204.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null

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

public val ThinGroup.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) {
            return _crosshairSimple!!
        }
        _crosshairSimple = Builder(name = "CrosshairSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(132.0f, 219.91f)
                lineTo(132.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(35.91f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 36.09f, 132.0f)
                lineTo(72.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(36.09f, 124.0f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 124.0f, 36.09f)
                lineTo(124.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 36.09f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 219.91f, 124.0f)
                lineTo(184.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(35.91f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 132.0f, 219.91f)
                close()
            }
        }
        .build()
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null

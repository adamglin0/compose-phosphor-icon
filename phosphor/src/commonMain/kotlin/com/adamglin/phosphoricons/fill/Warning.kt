package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.8f, 188.09f)
                lineTo(149.35f, 36.22f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, false, -42.7f, 0.0f)
                lineTo(19.2f, 188.09f)
                arcToRelative(23.51f, 23.51f, 0.0f, false, false, 0.0f, 23.72f)
                arcTo(24.35f, 24.35f, 0.0f, false, false, 40.55f, 224.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(24.35f, 24.35f, 0.0f, false, false, 21.33f, -12.19f)
                arcTo(23.51f, 23.51f, 0.0f, false, false, 236.8f, 188.09f)
                close()
                moveTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null

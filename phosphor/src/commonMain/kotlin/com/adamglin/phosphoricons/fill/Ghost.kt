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

public val FillGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, -96.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.07f, 6.19f)
                lineToRelative(24.26f, -19.85f)
                lineTo(93.6f, 222.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.13f, 0.0f)
                lineTo(128.0f, 202.34f)
                lineToRelative(24.27f, 19.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.13f, 0.0f)
                lineToRelative(24.27f, -19.85f)
                lineToRelative(24.26f, 19.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 216.0f)
                lineTo(224.0f, 120.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(100.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 128.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 128.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null

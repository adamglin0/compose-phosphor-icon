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

public val FillGroup.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) {
            return _arrowsLeftRight!!
        }
        _arrowsLeftRight = Builder(name = "ArrowsLeftRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.34f, 85.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 48.0f)
                lineTo(88.0f, 72.0f)
                lineTo(208.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(88.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                close()
                moveTo(213.66f, 170.34f)
                lineTo(181.66f, 138.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 144.0f)
                verticalLineToRelative(24.0f)
                lineTo(48.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(168.0f, 184.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 170.34f)
                close()
            }
        }
        .build()
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null

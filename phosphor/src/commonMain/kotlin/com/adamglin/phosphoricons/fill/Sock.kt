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

public val FillGroup.Sock: ImageVector
    get() {
        if (_sock != null) {
            return _sock!!
        }
        _sock = Builder(name = "Sock", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 16.0f)
                lineTo(104.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 32.0f)
                verticalLineToRelative(76.69f)
                lineTo(49.25f, 147.43f)
                arcToRelative(58.92f, 58.92f, 0.0f, false, false, 83.32f, 83.32f)
                lineTo(201.0f, 162.34f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, false, 7.0f, -17.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 16.0f)
                close()
                moveTo(192.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                lineTo(192.0f, 56.0f)
                lineTo(104.0f, 56.0f)
                lineTo(104.0f, 32.0f)
                close()
                moveTo(189.66f, 151.0f)
                lineTo(157.8f, 182.88f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 34.2f, -70.2f)
                verticalLineToRelative(32.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 151.0f)
                close()
            }
        }
        .build()
        return _sock!!
    }

private var _sock: ImageVector? = null

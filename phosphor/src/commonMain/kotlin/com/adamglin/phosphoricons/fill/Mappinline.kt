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

public val FillGroup.Mappinline: ImageVector
    get() {
        if (_mappinline != null) {
            return _mappinline!!
        }
        _mappinline = Builder(name = "Mappinline", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 224.0f)
                horizontalLineTo(150.54f)
                arcTo(266.56f, 266.56f, 0.0f, false, false, 174.0f, 200.25f)
                curveToRelative(27.45f, -31.57f, 42.0f, -64.85f, 42.0f, -96.25f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f)
                curveToRelative(0.0f, 31.4f, 14.51f, 64.68f, 42.0f, 96.25f)
                arcTo(266.56f, 266.56f, 0.0f, false, false, 105.46f, 224.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 72.0f)
                close()
            }
        }
        .build()
        return _mappinline!!
    }

private var _mappinline: ImageVector? = null

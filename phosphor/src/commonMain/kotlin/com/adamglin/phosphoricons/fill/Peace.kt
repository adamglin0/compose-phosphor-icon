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

public val FillGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 143.37f)
                lineToRelative(46.0f, 32.2f)
                arcToRelative(71.86f, 71.86f, 0.0f, false, true, -46.0f, 24.0f)
                close()
                moveTo(56.0f, 128.0f)
                arcToRelative(71.61f, 71.61f, 0.0f, false, false, 8.81f, 34.48f)
                lineTo(120.0f, 123.84f)
                lineTo(120.0f, 56.46f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 56.0f, 128.0f)
                close()
                moveTo(120.0f, 199.54f)
                lineTo(120.0f, 143.37f)
                lineToRelative(-46.0f, 32.2f)
                arcTo(71.86f, 71.86f, 0.0f, false, false, 120.0f, 199.54f)
                close()
                moveTo(136.0f, 56.46f)
                verticalLineToRelative(67.38f)
                lineToRelative(55.19f, 38.64f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 136.0f, 56.46f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null

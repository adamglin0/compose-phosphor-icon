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

public val LightGroup.Codeblock: ImageVector
    get() {
        if (_codeblock != null) {
            return _codeblock!!
        }
        _codeblock = Builder(name = "Codeblock", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.76f, 100.24f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.48f)
                lineTo(40.49f, 64.0f)
                lineTo(68.24f, 91.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                close()
                moveTo(99.76f, 100.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f)
                lineTo(127.51f, 64.0f)
                lineTo(99.76f, 91.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 99.76f, 100.24f)
                close()
                moveTo(200.0f, 42.0f)
                lineTo(176.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(202.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
            }
        }
        .build()
        return _codeblock!!
    }

private var _codeblock: ImageVector? = null

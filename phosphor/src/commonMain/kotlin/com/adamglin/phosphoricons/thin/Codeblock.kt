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

public val ThinGroup.Codeblock: ImageVector
    get() {
        if (_codeblock != null) {
            return _codeblock!!
        }
        _codeblock = Builder(name = "Codeblock", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.17f, 98.83f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(37.66f, 64.0f)
                lineTo(66.83f, 93.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                close()
                moveTo(101.17f, 98.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(130.34f, 64.0f)
                lineTo(101.17f, 93.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 101.17f, 98.83f)
                close()
                moveTo(200.0f, 44.0f)
                lineTo(176.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(204.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
            }
        }
        .build()
        return _codeblock!!
    }

private var _codeblock: ImageVector? = null

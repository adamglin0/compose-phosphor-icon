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

public val LightGroup.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) {
            return _terminalWindow!!
        }
        _terminalWindow = Builder(name = "TerminalWindow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.25f, 4.69f)
                lineToRelative(-40.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.5f, -9.38f)
                lineTo(110.4f, 128.0f)
                lineTo(76.25f, 100.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.5f, -9.38f)
                lineToRelative(40.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 126.0f, 128.0f)
                close()
                moveTo(176.0f, 154.0f)
                lineTo(136.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null

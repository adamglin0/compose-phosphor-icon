package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Devicetablet: ImageVector
    get() {
        if (_devicetablet != null) {
            return _devicetablet!!
        }
        _devicetablet = Builder(name = "Devicetablet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 20.0f)
                lineTo(64.0f, 20.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(192.0f, 236.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(220.0f, 48.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 192.0f, 20.0f)
                close()
                moveTo(60.0f, 84.0f)
                lineTo(196.0f, 84.0f)
                verticalLineToRelative(88.0f)
                lineTo(60.0f, 172.0f)
                close()
                moveTo(64.0f, 44.0f)
                lineTo(192.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(196.0f, 60.0f)
                lineTo(60.0f, 60.0f)
                lineTo(60.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 44.0f)
                close()
                moveTo(192.0f, 212.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(60.0f, 196.0f)
                lineTo(196.0f, 196.0f)
                verticalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 192.0f, 212.0f)
                close()
            }
        }
        .build()
        return _devicetablet!!
    }

private var _devicetablet: ImageVector? = null

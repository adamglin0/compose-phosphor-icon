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

public val BoldGroup.Cassettetape: ImageVector
    get() {
        if (_cassettetape != null) {
            return _cassettetape!!
        }
        _cassettetape = Builder(name = "Cassettetape", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(183.0f, 188.0f)
                lineToRelative(-12.6f, -16.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 168.0f)
                lineTo(92.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.4f, 3.2f)
                lineTo(73.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                close()
                moveTo(82.0f, 152.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, -68.0f)
                lineTo(82.0f, 84.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, 68.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 108.0f)
                close()
                moveTo(184.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 184.0f, 118.0f)
                close()
                moveTo(141.5f, 128.0f)
                horizontalLineToRelative(-27.0f)
                arcToRelative(34.08f, 34.08f, 0.0f, false, false, 0.0f, -20.0f)
                horizontalLineToRelative(27.0f)
                arcToRelative(34.08f, 34.08f, 0.0f, false, false, 0.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cassettetape!!
    }

private var _cassettetape: ImageVector? = null

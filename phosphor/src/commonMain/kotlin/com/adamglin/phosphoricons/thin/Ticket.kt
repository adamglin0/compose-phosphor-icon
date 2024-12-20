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

public val ThinGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(236.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                close()
                moveTo(28.0f, 192.0f)
                lineTo(28.0f, 163.78f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -71.56f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(92.0f, 60.0f)
                lineTo(92.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 192.0f)
                close()
                moveTo(196.0f, 128.0f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, 32.0f, 35.78f)
                lineTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(100.0f, 196.0f)
                lineTo(100.0f, 60.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(228.0f, 92.22f)
                arcTo(36.06f, 36.06f, 0.0f, false, false, 196.0f, 128.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null

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

public val FillGroup.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 152.0f)
                close()
                moveTo(168.0f, 32.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(160.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(152.0f, 56.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(240.0f, 116.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(136.0f, 192.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 116.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 76.0f, 56.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 56.0f)
                horizontalLineToRelative(12.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 240.0f, 116.0f)
                close()
                moveTo(120.0f, 116.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(88.0f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null

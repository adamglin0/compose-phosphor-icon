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

public val LightGroup.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 146.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 152.0f)
                close()
                moveTo(238.0f, 116.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(134.0f, 190.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 190.0f)
                lineTo(32.0f, 190.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 116.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, true, 76.0f, 58.0f)
                horizontalLineToRelative(78.0f)
                lineTo(154.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(166.0f, 30.0f)
                lineTo(166.0f, 58.0f)
                horizontalLineToRelative(14.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, true, 238.0f, 116.0f)
                close()
                moveTo(122.0f, 178.0f)
                lineTo(122.0f, 116.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(226.0f, 116.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, false, -46.0f, -46.0f)
                lineTo(166.0f, 70.0f)
                verticalLineToRelative(74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(154.0f, 70.0f)
                lineTo(111.29f, 70.0f)
                arcTo(57.93f, 57.93f, 0.0f, false, true, 134.0f, 116.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null

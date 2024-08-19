package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Lock-key-light`: ImageVector
    get() {
        if (`_lock-key-light` != null) {
            return `_lock-key-light`!!
        }
        `_lock-key-light` = Builder(name = "Lock-key-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 82.0f)
                lineTo(174.0f, 82.0f)
                lineTo(174.0f, 56.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                lineTo(82.0f, 82.0f)
                lineTo(48.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 96.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 82.0f)
                close()
                moveTo(94.0f, 56.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                lineTo(162.0f, 82.0f)
                lineTo(94.0f, 82.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(128.0f, 114.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -6.0f, 51.29f)
                lineTo(122.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 165.29f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 128.0f, 114.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 128.0f, 154.0f)
                close()
            }
        }
        .build()
        return `_lock-key-light`!!
    }

private var `_lock-key-light`: ImageVector? = null

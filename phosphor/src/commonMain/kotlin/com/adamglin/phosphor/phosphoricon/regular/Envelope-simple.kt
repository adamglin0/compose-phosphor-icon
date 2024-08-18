package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Envelope-simple`: ImageVector
    get() {
        if (`_envelope-simple` != null) {
            return `_envelope-simple`!!
        }
        `_envelope-simple` = Builder(name = "Envelope-simple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
                moveTo(203.43f, 64.0f)
                lineTo(128.0f, 133.15f)
                lineTo(52.57f, 64.0f)
                close()
                moveTo(216.0f, 192.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(74.19f)
                lineToRelative(82.59f, 75.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.82f, 0.0f)
                lineTo(216.0f, 74.19f)
                verticalLineTo(192.0f)
                close()
            }
        }
        .build()
        return `_envelope-simple`!!
    }

private var `_envelope-simple`: ImageVector? = null

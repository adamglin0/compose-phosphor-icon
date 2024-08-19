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

public val ThinGroup.Gaspump: ImageVector
    get() {
        if (_gaspump != null) {
            return _gaspump!!
        }
        _gaspump = Builder(name = "Gaspump", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.14f, 72.49f)
                lineTo(218.83f, 53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(19.32f, 19.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 86.63f)
                lineTo(236.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(172.0f, 108.0f)
                lineTo(172.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(72.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 56.0f)
                lineTo(52.0f, 212.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(172.0f, 212.0f)
                lineTo(172.0f, 116.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 40.0f, 0.0f)
                lineTo(244.0f, 86.63f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 238.14f, 72.49f)
                close()
                moveTo(60.0f, 212.0f)
                lineTo(60.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 44.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(164.0f, 212.0f)
                close()
                moveTo(140.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 112.0f)
                close()
            }
        }
        .build()
        return _gaspump!!
    }

private var _gaspump: ImageVector? = null

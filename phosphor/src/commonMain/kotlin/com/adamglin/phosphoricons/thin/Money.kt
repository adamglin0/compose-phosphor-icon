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

public val ThinGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 100.0f)
                close()
                moveTo(240.0f, 60.0f)
                lineTo(16.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(240.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(244.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 60.0f)
                close()
                moveTo(20.0f, 107.26f)
                arcTo(52.75f, 52.75f, 0.0f, false, false, 59.26f, 68.0f)
                lineTo(196.74f, 68.0f)
                arcTo(52.75f, 52.75f, 0.0f, false, false, 236.0f, 107.26f)
                verticalLineToRelative(41.48f)
                arcTo(52.75f, 52.75f, 0.0f, false, false, 196.74f, 188.0f)
                lineTo(59.26f, 188.0f)
                arcTo(52.75f, 52.75f, 0.0f, false, false, 20.0f, 148.74f)
                close()
                moveTo(236.0f, 99.0f)
                arcToRelative(44.8f, 44.8f, 0.0f, false, true, -31.0f, -31.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(51.0f, 68.0f)
                arcTo(44.8f, 44.8f, 0.0f, false, true, 20.0f, 99.0f)
                lineTo(20.0f, 68.0f)
                close()
                moveTo(20.0f, 157.0f)
                arcToRelative(44.8f, 44.8f, 0.0f, false, true, 31.0f, 31.0f)
                lineTo(20.0f, 188.0f)
                close()
                moveTo(205.0f, 188.0f)
                arcToRelative(44.8f, 44.8f, 0.0f, false, true, 31.0f, -31.0f)
                verticalLineToRelative(31.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null

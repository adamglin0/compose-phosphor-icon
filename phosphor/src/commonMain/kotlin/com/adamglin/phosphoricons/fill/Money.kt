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

public val FillGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 128.0f)
                close()
                moveTo(248.0f, 64.0f)
                lineTo(248.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(16.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(8.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(240.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 64.0f)
                close()
                moveTo(232.0f, 110.35f)
                arcTo(56.78f, 56.78f, 0.0f, false, true, 193.65f, 72.0f)
                lineTo(62.35f, 72.0f)
                arcTo(56.78f, 56.78f, 0.0f, false, true, 24.0f, 110.35f)
                verticalLineToRelative(35.3f)
                arcTo(56.78f, 56.78f, 0.0f, false, true, 62.35f, 184.0f)
                horizontalLineToRelative(131.3f)
                arcTo(56.78f, 56.78f, 0.0f, false, true, 232.0f, 145.65f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null

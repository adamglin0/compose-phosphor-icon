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

public val FillGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 236.0f)
                close()
                moveTo(84.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 192.0f)
                close()
                moveTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 192.0f)
                close()
                moveTo(52.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 160.0f)
                close()
                moveTo(248.0f, 32.0f)
                lineTo(216.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineToRelative(-30.2f, 30.2f)
                lineTo(53.38f, 86.19f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.69f, 27.1f)
                lineToRelative(98.0f, 98.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.09f, -8.66f)
                lineTo(191.46f, 75.86f)
                lineTo(219.31f, 48.0f)
                lineTo(248.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null

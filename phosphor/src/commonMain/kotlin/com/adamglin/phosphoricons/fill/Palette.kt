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

public val FillGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.77f, 53.89f)
                arcTo(103.27f, 103.27f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-1.07f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 24.0f, 128.0f)
                curveToRelative(0.0f, 43.0f, 26.58f, 79.06f, 69.36f, 94.17f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(46.21f)
                arcToRelative(31.81f, 31.81f, 0.0f, false, false, 31.2f, -24.88f)
                arcToRelative(104.43f, 104.43f, 0.0f, false, false, 2.59f, -24.0f)
                arcTo(103.28f, 103.28f, 0.0f, false, false, 200.77f, 53.89f)
                close()
                moveTo(84.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 168.0f)
                close()
                moveTo(84.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 112.0f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 88.0f)
                close()
                moveTo(172.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 112.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null

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

public val FillGroup.Lettercirclep: ImageVector
    get() {
        if (_lettercirclep != null) {
            return _lettercirclep!!
        }
        _lettercirclep = Builder(name = "Lettercirclep", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 116.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(112.0f, 136.0f)
                lineTo(112.0f, 96.0f)
                horizontalLineToRelative(24.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 156.0f, 116.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(172.0f, 116.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(104.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 152.0f)
                horizontalLineToRelative(24.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 172.0f, 116.0f)
                close()
            }
        }
        .build()
        return _lettercirclep!!
    }

private var _lettercirclep: ImageVector? = null
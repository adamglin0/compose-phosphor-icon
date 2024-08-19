package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(192.0f, 108.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(168.0f, 134.09f)
                lineToRelative(-8.19f, 7.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.62f, 0.0f)
                lineToRelative(-8.19f, -7.0f)
                lineTo(136.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(112.0f, 120.0f)
                lineTo(100.0f, 120.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(76.0f, 120.0f)
                lineTo(72.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.81f, 2.89f)
                lineTo(152.0f, 116.2f)
                lineToRelative(20.19f, -17.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 108.0f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null

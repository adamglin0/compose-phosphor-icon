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

public val BoldGroup.Trademarkregistered: ImageVector
    get() {
        if (_trademarkregistered != null) {
            return _trademarkregistered!!
        }
        _trademarkregistered = Builder(name = "Trademarkregistered", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(156.7f, 141.42f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 136.0f, 76.0f)
                lineTo(104.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(116.0f, 148.0f)
                horizontalLineToRelative(16.24f)
                lineTo(150.0f, 174.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.0f, -13.32f)
                close()
                moveTo(116.0f, 100.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(116.0f, 124.0f)
                close()
            }
        }
        .build()
        return _trademarkregistered!!
    }

private var _trademarkregistered: ImageVector? = null
